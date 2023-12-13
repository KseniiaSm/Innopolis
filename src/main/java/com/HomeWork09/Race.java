package com.HomeWork09;

import java.util.Arrays;

public class Race {
    private String name;
    private int distance;
    //маршрут
    private String route;
    private int prizeSum;
    private Car[] carsCollection;

    public Race() {
    }

    public Race(String name, int distance, String route, int prizeSum, Car[] carsCollection) {
        this.name = name;
        this.distance = distance;
        this.route = route;
        this.prizeSum = prizeSum;
        this.carsCollection = carsCollection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getPrizeSum() {
        return prizeSum;
    }

    public void setPrizeSum(int prizeSum) {
        this.prizeSum = prizeSum;
    }

    public Car[] getCarsCollection() {
        return carsCollection;
    }

    public void setCarsCollection(Car[] carsCollection) {
        this.carsCollection = carsCollection;
    }

    @Override
    public String toString() {
        return "Race " + "\n" +
                "distance: " + distance + "\n" +
                "route: " + route + "\n" +
                "prizeSum: " + prizeSum + "\n" +
                "carsCollection: " + Arrays.toString(carsCollection) + "\n";
    }
}
