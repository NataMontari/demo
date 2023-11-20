package com.example.demo;

public abstract class ItemDecorator extends Item{
    private Item item;

    public String getDescription(){
        return item.getDescription();
    }
    public double getPrice(){
        return item.getPrice();
    }
}
