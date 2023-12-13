package com.HomeWork09;

import java.io.PrintWriter;

public class RaceHelper {
    public static void whoIsWinnerCasualRace(Race race, PrintWriter pWriter) {
        int maxAcceleration = 0;
        for (int i = 0; i < race.getCarsCollection().length; i++) {
            if (race.getCarsCollection()[i].getAcceleration() > maxAcceleration) {
                maxAcceleration = race.getCarsCollection()[i].getAcceleration();
            }
        }
        for (Car car : race.getCarsCollection()) {
            if (car.getAcceleration() == maxAcceleration) {
                pWriter.println("В гонке CasualRace победителем стал: ");
                pWriter.println(car);
            }
        }
    }
    public static void whoIsWinnerDragRace(Race race, PrintWriter pWriter) {
        int maxPower = 0;
        for (int i = 0; i < race.getCarsCollection().length; i++) {
            if (race.getCarsCollection()[i].getPower() > maxPower) {
                maxPower = race.getCarsCollection()[i].getPower();
            }
        }
        for (Car car : race.getCarsCollection()) {
            if (car.getPower() == maxPower) {
                pWriter.println("В гонке DragRace победителем стал: ");
                pWriter.println(car);
            }
        }
    }

    public static void whoIsWinnerDriftRace(Race race, PrintWriter pWriter) {
        int maxSuspension = 0;
        for (int i = 0; i < race.getCarsCollection().length; i++) {
            if (race.getCarsCollection()[i].getPower() > maxSuspension) {
                maxSuspension = race.getCarsCollection()[i].getPower();
            }
        }
        for (Car car : race.getCarsCollection()) {
            if (car.getPower() == maxSuspension) {
                pWriter.println("В гонке DriftRace победителем стал: ");
                pWriter.println(car);
            }
        }
    }

}
