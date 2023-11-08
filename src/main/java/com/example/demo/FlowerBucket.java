package flower.store;
import java.util.List;
import java.util.ArrayList;
import lombok.Getter;

@Getter
public class FlowerBucket {
    private List<FlowerPack> bucket = new ArrayList<FlowerPack>();
    private int bucketPrice;
    public FlowerBucket(List<FlowerPack> bucket) {
        this.bucket = bucket;
    }
    public FlowerBucket(){
        this.bucket = new ArrayList<FlowerPack>();
    }
    public void addFlowerPack(FlowerPack pack) {
        bucket.add(pack);
    }
    public double getBucketPrice() {
        double price = 0;
        for (FlowerPack pack: this.bucket) {
            price += pack.getPrice();
        }
        return price;
    }
}
