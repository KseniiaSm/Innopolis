package com.HomeWork09;

public class Car {
    private String company;
    private String model;
    private int yearProduction;
    private int power;
    //ускорение
    private int acceleration;
    // подвеска
    private int suspension;
    // долговечность
    private int longevity;

    public Car () {}
    public Car(String company, String model, int yearProduction, int power, int acceleration, int suspension, int longevity) {
        this.company = company;
        this.model = model;
        this.yearProduction = yearProduction;
        this.power = power;
        this.acceleration = acceleration;
        this.suspension = suspension;
        this.longevity = longevity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public int getLongevity() {
        return longevity;
    }

    public void setLongevity(int longevity) {
        this.longevity = longevity;
    }

    @Override
    public String toString() {
        return  "Car " + "\n" +
                "company: " + company + "\n" +
                "model: " + model + "\n" +
                "yearProduction: " + yearProduction + "\n" +
                "power: " + power + "\n" +
                "acceleration: " + acceleration + "\n" +
                "suspension: " + suspension + "\n" +
                "longevity: " + longevity;
    }
}
