package com.HomeWork09;

import java.util.Arrays;

public class Garage {
    private Car [] parkedCars;
    public Garage() {
    }
    public Garage(Car[] parkedCars) {
        this.parkedCars = parkedCars;
    }

    public Car[] getParkedCars() {
        return parkedCars;
    }

    public void setParkedCars(Car[] parkedCars) {
        this.parkedCars = parkedCars;
    }

    @Override
    public String toString() {
        return "Garage " + "\n" +
                "parkedCars: " + Arrays.toString(parkedCars);
    }

}
