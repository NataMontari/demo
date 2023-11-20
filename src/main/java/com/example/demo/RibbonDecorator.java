package com.example.demo;

public class RibbonDecorator extends ItemDecorator{
    public Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }
    public double getPrice(){
        return 40+item.getPrice();
    } 
    public String getDescription(){
        return item.getDescription();
    }
}