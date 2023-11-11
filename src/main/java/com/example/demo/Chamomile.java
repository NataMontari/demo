package com.example.demo;

public class Chamomile extends Flower{
    public Chamomile(){
        super(new Flower());
        setColor(FlowerColor.WHITE);
        setFlowerType(FlowerType.CHAMOMILE);
    }
}