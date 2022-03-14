package midtermexam;

import java.util.ArrayList;

/**
 * @author Kaiya Takahashi
 */
public class Driver {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Vehicle c1 = new Car("c1", 250, true);
        Vehicle c2 = new Car("c2", 220, true);
        Vehicle c3 = new Car("c3", -210, false);
        Vehicle b1 = new Boat("b1", 500);
        Vehicle b2 = new Boat("b2", 700);
        Vehicle b3 = new Boat("b3", 800);

        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(c3);
        vehicles.add(b1);
        vehicles.add(b2);
        vehicles.add(b3);

        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle.toString());
        }
        for (Vehicle vehicle: vehicles){
            vehicle.accelerate();
        }
    }
}
