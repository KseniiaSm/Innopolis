package com.homework03;

//1. Создан класс  Телевизор;
public class TV {
    //2.  У  класса  есть   поля,  свойства   и   методы.  Поля  желательно  сделать private.
// Задать новые значения полям класса можно через конструктор и setters.
    private String TVCompany;
    private String color;
    private int diagonal;
    private double price;

    public String getTVCompany() {
        return TVCompany;
    }

    public void setTVCompany(String TVCompany) {
        this.TVCompany = TVCompany;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    TV(String TVCompany, String color, int diagonal, double price) {
        this.TVCompany = TVCompany;
        this.color = color;
        this.diagonal = diagonal;
        this.price = price;
    }

    TV() {

    }

    ;

    //3. В классе переопределен метод  toString.
    @Override
    public String toString() {
        return "TV: \n" +
                "TVCompany - " + TVCompany + ";" + '\n' +
                "color - " + color + ";" + '\n' +
                "diagonal - " + diagonal + ";" + '\n' +
                "price - " + price + ";" +
                " " + '\n';
    }
}
