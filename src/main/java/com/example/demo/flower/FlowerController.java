package com.example.demo.flower;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Flower;
import com.example.demo.FlowerColor;
import com.example.demo.FlowerType;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/flower")
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }

    // @GetMapping("/list")
    // public List<Flower> getFlowers(){
        // return flowerService.getFlowers();
    // }
    // @PostMapping("/add")
    // public void addFlower(@RequestBody Flower flower){
        // flowerService.addFlower(flower);
    // }
    
	@GetMapping
	public List<Flower> getFlowers(){
        return flowerService.getFlowers();
	}
}