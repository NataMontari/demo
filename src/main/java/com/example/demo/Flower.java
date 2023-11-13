package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Flower extends Item{
    @Id
    private Integer id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;
    private String description;

    public String getColor() {
        return color.toString();
    }
    public Flower (Flower flower){
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
    }
    //public Flower (double price, int sepalLength, FlowerColor color, FlowerType flowerType){
    //    this.price = price;
    //    this.sepalLength = sepalLength;
    //    this.color = color;
    //    this.flowerType = flowerType;
    //}
}
