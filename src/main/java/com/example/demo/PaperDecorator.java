package com.example.demo;

public class PaperDecorator extends ItemDecorator{
    public Item item;
    public double getPrice(){
        return 13+item.getPrice();
    } 
    public String getDescription(){
        return item.getDescription();
    }
}
