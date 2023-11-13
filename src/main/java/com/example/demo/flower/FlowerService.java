package com.example.demo.flower;
// package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Flower;
import com.example.demo.FlowerColor;
import com.example.demo.FlowerType;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import flower.FlowerRepository;

@Service
public class FlowerService{
    public List<Flower> getFlowers(){
        return List.of(new Flower(1, 10.5, FlowerColor.BLACK, 100, FlowerType.CHAMOMILE, "Black Chamomile flower"));
    }
    
//     private FlowerRepository flowerRepository;
    
//     public FlowerService(FlowerRepository flowerRepository) {
//         this.flowerRepository = flowerRepository;
//     }

//     public List<Flower> getFlowers(){
//         return flowerRepository.findAll();
//     }

//     public void addFlower(Flower flower) {
//         flowerRepository.save(flower);
//     }

}
