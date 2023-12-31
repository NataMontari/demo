package com.example.demo;

public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public double getPrice(){
        return 13+item.getPrice();
    } 
    public String getDescription(){
        return item.getDescription();
    }
}
