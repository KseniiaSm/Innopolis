package com.HomeWork09;
import java.io.*;
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

        for (int i=0; i < 5; i++){
            String line = scanner.nextLine();
            if (line.equals("ShowCar")) {
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
            } else if (line.equals("PerformanceCar")) {
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
        }
        Car [] allCarsArray = new Car[5];
        for (int i=0; i < showCarsArray.length; i++) {
            allCarsArray [i] = showCarsArray[i];
        }
        for (int i=showCarsArray.length; i < allCarsArray.length; i++){
            allCarsArray [i] = performanceCarsArray [i - showCarsArray.length];
        }

        printWriter.println("Список всех имеющихся машин: ");
        printWriter.println(Arrays.toString(allCarsArray));

        Race[] racesArray = new Race[3];
        racesArray[0] = new Race();
        racesArray[1] = new Race();
        racesArray[2] = new Race();

        //String CasualRace;
        //String DragRace;
        //DriftRace

        for (int i=0; i < racesArray.length; i++) {
            String lineRace = scanner.next();
            if (lineRace.equals("CasualRace")) {
                racesArray[0].setDistance(scanner.nextInt());
                racesArray[0].setRoute(scanner.next());
                racesArray[0].setPrizeSum(scanner.nextInt());
                int cr = scanner.nextInt();
                racesArray[0].setCarsCollection(Arrays.copyOf(allCarsArray, cr));
                printWriter.println("В гонке CasualRace участвовали: ");
                printWriter.println(Arrays.toString(racesArray[0].getCarsCollection()));
                //printWriter.println("В гараже остались: ");
               // Garage.setParkedCars(Arrays.copyOf(allCarsArray, 5-cr));
                printWriter.println(Arrays.toString(racesArray[0].getCarsCollection()));
            } else if (lineRace.equals("DragRace")) {
                racesArray[1].setDistance(scanner.nextInt());
                racesArray[1].setRoute(scanner.next());
                racesArray[1].setPrizeSum(scanner.nextInt());
                racesArray[1].setCarsCollection(Arrays.copyOf(allCarsArray, scanner.nextInt()));
                printWriter.println("В гонке DragRace участвовали: ");
                printWriter.println(Arrays.toString(racesArray[1].getCarsCollection()));
            } else if (lineRace.equals("DriftRace")){
                racesArray[2].setDistance(scanner.nextInt());
                racesArray[2].setRoute(scanner.next());
                racesArray[2].setPrizeSum(scanner.nextInt());
                racesArray[2].setCarsCollection(Arrays.copyOf(allCarsArray, scanner.nextInt()));
                printWriter.println("В гонке DriftRace участвовали: ");
                printWriter.println(Arrays.toString(racesArray[2].getCarsCollection()));
            }
        }

//        racesArray [0].whoIsWinnerCasualRace(racesArray[0].getCarsCollection());
//        racesArray [1].whoIsWinnerDragRace(racesArray[1].getCarsCollection());
//        racesArray [2].whoIsWinnerDriftRace(racesArray[2].getCarsCollection());


        scanner.close();
        printWriter.close();
















    }
}
