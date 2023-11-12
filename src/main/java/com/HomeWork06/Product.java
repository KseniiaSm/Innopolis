package com.HomeWork06;

import java.util.Arrays;

public class Product {
    private String nameOfProduct;
    private int price;

    public Product() {
    }

    @Override
    public String toString() {
        return nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        if (nameOfProduct != null) {
            this.nameOfProduct = nameOfProduct;
        } else {
            System.out.println("Имя продукта не задано");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Цена не может быть отрицательным");
        }
    }
}

