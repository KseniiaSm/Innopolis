package com.HomeWork09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\HomeWork09\\data.text";
        File file = new File(inputFilePath);
        Scanner scanner = new Scanner(file);

        String outputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\HomeWork09\\dataResult.text";
        PrintWriter printWriter = new PrintWriter(outputFilePath);

        ShowCar[] showCarsArray = new ShowCar[3];
        showCarsArray[0] = new ShowCar();
        showCarsArray[1] = new ShowCar();
        showCarsArray[2] = new ShowCar();

        PerformanceCar[] performanceCarsArray = new PerformanceCar[2];
        performanceCarsArray[0] = new PerformanceCar();
        performanceCarsArray[1] = new PerformanceCar();

        if (scanner.nextLine().equals("ShowCar")) {
            for (int j = 0; j < showCarsArray.length; j++) {
                showCarsArray[j].setCompany(scanner.next());
                showCarsArray[j].setModel(scanner.next());
                showCarsArray[j].setYearProduction(scanner.nextInt());
                showCarsArray[j].setPower(scanner.nextInt());
                showCarsArray[j].setAcceleration(scanner.nextInt());
                showCarsArray[j].setSuspension(scanner.nextInt());
                showCarsArray[j].setLongevity(scanner.nextInt());
                showCarsArray[j].setStars(scanner.nextInt());
            }
        }

        if (scanner.next().equals("PerformanceCar")) {
            for (int j = 0; j < performanceCarsArray.length; j++) {
                performanceCarsArray[j].setCompany(scanner.next());
                performanceCarsArray[j].setModel(scanner.next());
                performanceCarsArray[j].setYearProduction(scanner.nextInt());
                performanceCarsArray[j].setPower(scanner.nextInt());
                performanceCarsArray[j].setAcceleration(scanner.nextInt());
                performanceCarsArray[j].setSuspension(scanner.nextInt());
                performanceCarsArray[j].setLongevity(scanner.nextInt());
            }
        }

        Car[] allCarsArray = new Car[5];
        for (int i = 0; i < showCarsArray.length; i++) {
            allCarsArray[i] = showCarsArray[i];
        }
        for (int i = showCarsArray.length; i < allCarsArray.length; i++) {
            allCarsArray[i] = performanceCarsArray[i - showCarsArray.length];
        }

        printWriter.println("Список всех имеющихся машин: ");
        printWriter.println(Arrays.toString(allCarsArray));

        Race[] racesArray = new Race[3];
        racesArray[0] = new Race();
        racesArray[1] = new Race();
        racesArray[2] = new Race();


        for (int i = 0; i < racesArray.length; i++) {
            String lineRace = scanner.next();
            if (lineRace.equals("CasualRace")) {
                racesArray[0].setName(lineRace);
                racesArray[0].setDistance(scanner.nextInt());
                racesArray[0].setRoute(scanner.next());
                racesArray[0].setPrizeSum(scanner.nextInt());
                racesArray[0].setCarsCollection(Arrays.copyOf(allCarsArray, scanner.nextInt()));
                printWriter.println("В гонке CasualRace участвовали: ");
                printWriter.println(Arrays.toString(racesArray[0].getCarsCollection()));
            } else if (lineRace.equals("DragRace")) {
                racesArray[1].setName(lineRace);
                racesArray[1].setDistance(scanner.nextInt());
                racesArray[1].setRoute(scanner.next());
                racesArray[1].setPrizeSum(scanner.nextInt());
                racesArray[1].setCarsCollection(Arrays.copyOf(allCarsArray, scanner.nextInt()));
                printWriter.println("В гонке DragRace участвовали: ");
                printWriter.println(Arrays.toString(racesArray[1].getCarsCollection()));
            } else if (lineRace.equals("DriftRace")) {
                racesArray[2].setName(lineRace);
                racesArray[2].setDistance(scanner.nextInt());
                racesArray[2].setRoute(scanner.next());
                racesArray[2].setPrizeSum(scanner.nextInt());
                racesArray[2].setCarsCollection(Arrays.copyOf(allCarsArray, scanner.nextInt()));
                printWriter.println("В гонке DriftRace участвовали: ");
                printWriter.println(Arrays.toString(racesArray[2].getCarsCollection()));
            }
        }

        for (Race race : racesArray) {
            if (race.getName().equals("CasualRace")) {
                RaceHelper.whoIsWinnerCasualRace(race, printWriter);
            } else if (race.getName().equals("DragRace")) {
                RaceHelper.whoIsWinnerDragRace(race, printWriter);
            } else if (race.getName().equals("DriftRace")) {
                RaceHelper.whoIsWinnerDriftRace(race, printWriter);
            }
        }

        printWriter.close();
        scanner.close();
    }
}
