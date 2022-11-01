package com.github.landroutecalculator.services;

import com.github.landroutecalculator.models.country.Country;
import com.github.landroutecalculator.services.astar.Scorer;

public class HaversineScorer implements Scorer<Country> {

    @Override
    public double computeCost(Country from, Country to) {
    	return 2600;
    }

}
