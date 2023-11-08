package flower.store;

public class Rose extends Flower{
    public Rose(){
        super(new Flower());
        setColor(FlowerColor.RED);
        setFlowerType(FlowerType.ROSE);
    }
}
