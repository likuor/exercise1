package lab1;

public class Driver {
    public static void main(String[] args) throws IllegalAccessException {
        Model m1 = new Model("Susan", "Smith", 70, 120, true, false);
        System.out.println(m1.displayModelsDetails());
        Model m2 = new Model();
        m2.setFirstName("Tiger");
        m2.setLastName("Woods");
        m2.setHeight(72);
        m2.setWeight(86);
        m2.setCanSmoke(false);
        m2.setCanTravel(true);
        m2.printDetails();
    }
}
