package flower.store;

public class Tulip extends Flower{
    public Tulip(){
        super(new Flower());
        setColor(FlowerColor.BLUE);
        setFlowerType(FlowerType.TULIP);
    }
}