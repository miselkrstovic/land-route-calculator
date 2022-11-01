package com.github.landroutecalculator.services;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.github.landroutecalculator.models.Route;
import com.github.landroutecalculator.models.country.Country;
import com.github.landroutecalculator.services.astar.Graph;
import com.github.landroutecalculator.services.astar.RouteFinder;

@Service
@Scope("singleton")
public class BackendService {

	private List<String> tuples;
	private Set<Country> countries = new HashSet<>();
	Map<String, Set<String>> borders = new HashMap<>();
	
    private Graph<Country> map;
    private RouteFinder<Country> routeFinder;
	
	public void addCountry(Country country) {
		countries.add(country);
	}
	
	public Set<Country> getCountries() {
		return countries;
	}
	
	public void addBorder(String cca3, HashSet hashSet) {
		borders.put(cca3, hashSet);		
	}
	
	public Map<String, Set<String>> getBorders() {
		return borders;
	}
	
	public Route calcluateRoute(String originCca3, String destinationCca3) {
		Optional<Country> origin = getCountryByCca3(originCca3);
		Optional<Country> destination = getCountryByCca3(destinationCca3);
		if (origin.isPresent() && destination.isPresent()) {
	        map = new Graph<>(countries, borders);
	        routeFinder = new RouteFinder<>(map, new HaversineScorer(), new HaversineScorer());
	        
	        List<Country> route = routeFinder.findRoute(
	        		map.getNode(origin.get().getCca3()), 
	        		map.getNode(destination.get().getCca3()));

			List<String> items = route.stream().map(Country::getCca3).collect(Collectors.toList());
	        return new Route(items);
		} else {
			return null;
		}
	}
	
	public List<String> getCountriesTuple() {
		if (tuples == null) {
			tuples = countries.stream().map(
					country -> 
							country.getName().getCommon() + ", " + 
							country.getName().getOfficial() + ", " +
							country.getCca3()).collect(Collectors.toList());
			tuples.sort(Comparator.naturalOrder());
			return tuples;
		} else {
			return tuples;
		}
	}
	
	public Optional<Country> getCountryByCca3(String cca3) {
		if (cca3 != null && !cca3.isBlank()) {
			return countries.stream().filter(
					country -> country.getCca3().equalsIgnoreCase(cca3.trim())).findFirst();
		} else {
			return Optional.empty();
		}
	}
	
	public Optional<Country> getCountryByOfficialName(String officialName) {
		if (officialName != null && !officialName.isBlank()) {
			return countries.stream().filter(
					country -> country.getName().getOfficial().equalsIgnoreCase(officialName.trim())).findFirst();
		} else {
			return Optional.empty();
		}
	}
	
}
