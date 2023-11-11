package com.example.demo;

public class Tulip extends Flower{
    public Tulip(){
        super(new Flower());
        setColor(FlowerColor.BLUE);
        setFlowerType(FlowerType.TULIP);
    }
}