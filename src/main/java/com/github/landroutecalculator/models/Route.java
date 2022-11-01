package com.github.landroutecalculator.models;

import java.util.ArrayList;
import java.util.List;

public class Route {

	private List<String> borders = new ArrayList<>();

	public Route(List<String> borders) {
		this.borders = borders;
	}

	public List<String> getRoute() {		
		return borders;
	}

	public void setRoute(List<String> borders) {
		this.borders = borders;
	}

}
