package com.HomeWork07;

public class Product {
    private String nameOfProduct;
    private int price;

    public Product() {
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        if (nameOfProduct.matches("\\d+")) {
            System.out.println("Название продукта не может содержать только цифры");
        } else {
            this.nameOfProduct = nameOfProduct;
        }
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Цена не может быть отрицательной или равной 0");
        }
    }
    @Override
    public String toString() {
        return "Product " +
                nameOfProduct + " " + price;
    }
}



