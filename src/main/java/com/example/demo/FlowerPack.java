package flower.store;
import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;
    private double price;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
        this.price = flower.getPrice();
    }
    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
        this.price = quantity*flower.getPrice();
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity < 1 ? 1 : quantity;
    }
}
