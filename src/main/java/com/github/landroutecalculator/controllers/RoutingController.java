package com.github.landroutecalculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.landroutecalculator.services.BackendService;

@Controller
public class RoutingController {

	@Autowired
	BackendService backendService;

	@GetMapping("/countries")
	public ResponseEntity list() {
		return ResponseEntity.ok(backendService.getCountriesTuple());
	}

	@GetMapping("/countries/{country}")
	public ResponseEntity country(@PathVariable String country) {
		return ResponseEntity.ok(backendService.getCountryByCca3(country));
	}

	@GetMapping("/routing/{origin}/{destination}")
	public ResponseEntity route(@PathVariable String origin, @PathVariable String destination) {
		if (origin != null && destination != null) {
			origin = origin.trim();
			destination = destination.trim();
			
			try {
				return ResponseEntity.ok(backendService.calcluateRoute(origin, destination));
			} catch(Exception ex) {
				return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
			}
		} else {
			return new ResponseEntity("Parameters not satisfied.", HttpStatus.BAD_REQUEST);
		}
	}
	
}
