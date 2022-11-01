package com.github.landroutecalculator.bootstrap;

import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.landroutecalculator.models.country.Country;
import com.github.landroutecalculator.services.BackendService;

@Component
public class Bootstrap implements CommandLineRunner {

	static Logger LOGGER = LoggerFactory.getLogger(Bootstrap.class);

	@Autowired
	private BackendService backendService;

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		ClassPathResource cpr = new ClassPathResource("countries.json", this.getClass().getClassLoader());
		JsonNode root = mapper.readTree(cpr.getFile());
		
		for (JsonNode jsonNode : root) {
			String nodeStr = jsonNode.toString();
			Country country = mapper.readValue(nodeStr, Country.class);
			
			backendService.addCountry(country);
			backendService.addBorder(country.getCca3(), new HashSet(country.getBorders()));
		}

		LOGGER.info("Pre-loaded countries into array list");
	}
    
}
