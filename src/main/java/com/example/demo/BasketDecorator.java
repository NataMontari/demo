package com.example.demo;

public class BasketDecorator extends ItemDecorator{
    public Item item;
    public double getPrice(){
        return 4+item.getPrice();
    } 
    public String getDescription(){
        return item.getDescription();
    }
}