package com.HomeWork09;

import java.util.Arrays;

//Гоночный
public class PerformanceCar extends Car {
    String [] addOnes;

    public PerformanceCar() {
    }
    public PerformanceCar(String company, String model, int yearProduction, int power, int acceleration, int suspension, int longevity) {
        super(company, model, yearProduction, power, acceleration, suspension, longevity);
    }
    @Override
    public void setSuspension(int suspension) {
        super.setSuspension(suspension * 75/100);
    }

    @Override
    public void setPower(int power) {
        super.setPower(power * 150/100);
    }

    @Override
    public String toString() {
        return  "\n" + "PerformanceCar: " + "\n"
                + super.toString();
    }
}
