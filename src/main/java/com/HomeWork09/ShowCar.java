package com.HomeWork09;
//Спортивная
public class ShowCar extends Car{
    //популярность автомобиля
    private int stars = 0;

    public ShowCar() {
    }

    public ShowCar(String company, String model, int yearProduction, int power, int acceleration, int suspension, int longevity, int stars) {
        super(company, model, yearProduction, power, acceleration, suspension, longevity);
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return  "\n" + "ShowCar: " + "\n" +
                super.toString() + "\n" +
                "stars: " + stars;
    }
}
