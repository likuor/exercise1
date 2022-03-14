package midtermexam;

public class Boat extends Vehicle{

    Boat(String productId, Integer weight){
        super(productId, weight);
    }
    @Override
    public void accelerate() {
        System.out.println("jet water");
    }

    @Override
    public void steerLeft() {

    }

    @Override
    public void steerRight() {

    }

    @Override
    public String toString() {
        return "Boat{" +
                "productId='" + super.getProductId() + '\'' +
                ", weight=" + super.getWeight() +
                '}';
    }
}
