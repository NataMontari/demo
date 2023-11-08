package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower extends Item{
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(){
        this.sepalLength = 3;
        this.color = FlowerColor.BLACK;
        this.price = 10;
        this.flowerType = FlowerType.ROSE;
    }
    public String getColor() {
        return color.toString();
    }
    public Flower (Flower flower){
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
    }
    public Flower(FlowerColor flowerColor, int price, int sepalLength){
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = flowerColor;
        this.flowerType = FlowerType.ROSE;

    }
    //public Flower (double price, int sepalLength, FlowerColor color, FlowerType flowerType){
    //    this.price = price;
    //    this.sepalLength = sepalLength;
    //    this.color = color;
    //    this.flowerType = flowerType;
    //}
}
