package com.github.landroutecalculator.services.astar;

public interface Scorer<T extends GraphNode> {
    double computeCost(T from, T to);
}
