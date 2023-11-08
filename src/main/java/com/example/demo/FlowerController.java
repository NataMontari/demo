package flower.store;
import org.springframework.RestController;


@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerServicelowerService){
        this.flowerService = flowerService;
    }
    public List<Flower> getFlowes(){
        return flowerService.getFlowers();
    }
}