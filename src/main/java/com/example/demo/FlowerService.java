package flower.store;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FlowerService{
    private FlowerRepository flowerRepository;
    
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers(){
        return List.of(new Flower(FlowerColor.RED, 45, 0.8));
    }

}
