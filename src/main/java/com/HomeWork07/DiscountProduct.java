package com.HomeWork07;

public class DiscountProduct extends Product {
    public int discount;

    public DiscountProduct() {
        super();
        this.discount = 0;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        int price = super.getPrice();
        return price * (100 - discount) / 100;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String getNameOfProduct() {
        return super.getNameOfProduct();
    }

    @Override
    public void setNameOfProduct(String nameOfProduct) {
        super.setNameOfProduct(nameOfProduct);
    }
}
