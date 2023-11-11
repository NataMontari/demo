package com.example.demo;
import java.util.List;
import java.util.ArrayList;
import lombok.Getter;

@Getter
public class FlowerBucket extends Item{
    private List<FlowerPack> bucket = new ArrayList<FlowerPack>();
    private double price;
    public FlowerBucket(List<FlowerPack> bucket) {
        this.bucket = bucket;
    }
    public FlowerBucket(){
        this.bucket = new ArrayList<FlowerPack>();
    }
    public void addFlowerPack(FlowerPack pack) {
        bucket.add(pack);
    }
    public double getPrice() {
        double bucketPrice = 0;
        for (FlowerPack pack: this.bucket) {
            bucketPrice += pack.getPrice();
        }
        return bucketPrice;
    }
}
