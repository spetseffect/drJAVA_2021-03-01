package com.Money;

public class Product {
    private String name;
    private Money price;
    //there can be any number parameters here
    public Product() {}
    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Money getPrice() {
        return price;
    }
    public void setPrice(Money price) {
        this.price = price;
    }
    public void priceUp(double value){
        this.price.addition(value);
    }
    public void priceDown(double value){
        this.price.subtraction(value);
    }
    @Override
    public String toString(){
        return "'"+getName()+"' - "+getPrice();
    }
}
