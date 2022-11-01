package com.github.landroutecalculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.landroutecalculator.services.BackendService;

@Controller
public class FrontendController {

	@Autowired
	BackendService backendService;
	
	@GetMapping({"", "/", "index", "index.html"})
	public String index(Model model) {
		model.addAttribute("tuples", backendService.getCountriesTuple());
		return "index";
	}

}
