package com.HomeWork09;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Race {
    private int distance;
    //маршрут
    private String route;
    private int prizeSum;
    private Car [] carsCollection;
    public Race() throws FileNotFoundException {
    }
    public Race(int distance, String route, int prizeSum, Car[] carsCollection) throws FileNotFoundException {
        this.distance = distance;
        this.route = route;
        this.prizeSum = prizeSum;
        this.carsCollection = carsCollection;
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
    static String outputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\HomeWork09\\dataResult.text";
    static PrintWriter pWriter;

    static {
        try {
            pWriter = new PrintWriter(outputFilePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void whoIsWinnerCasualRace(Car[] carsCollection) {
        int minTime;
        minTime = distance / carsCollection[0].getAcceleration();
        for (int i=0; i<carsCollection.length; i++) {
            if (carsCollection[i].getAcceleration() < minTime) {
                minTime = carsCollection[i].getAcceleration();
            }
            pWriter.println("В гонке CasualRace победителем стал: ");
            pWriter.println(carsCollection[i]);
        }
    }
    public void whoIsWinnerDragRace (Car[] carsCollection) {
        int maxPower=0;
        for (int i=0; i<carsCollection.length; i++) {
            if (carsCollection[i].getPower() < maxPower) {
                maxPower = carsCollection[i].getPower();
            }
            pWriter.println("В гонке DragRace победителем стал: ");
            pWriter.println(carsCollection[i]);
        }
    }
    public void whoIsWinnerDriftRace (Car[] carsCollection) {
        int maxSuspension=0;
        for (int i=0; i<carsCollection.length; i++) {
            if (carsCollection[i].getSuspension() < maxSuspension) {
                maxSuspension = carsCollection[i].getSuspension();
            }
            pWriter.println("В гонке DriftRace победителем стал: ");
            pWriter.println(carsCollection[i]);
        }
    }


}
