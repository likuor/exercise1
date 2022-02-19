package week1.classes;

public class Driver {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5, 0);
        Rectangle r2 = new Rectangle(6, 10, "Red");
        Rectangle r3 = new Rectangle(0, 4, "Black");
        r1.draw();
        r2.draw();
        r3.draw();
        Rectangle r4 = new Rectangle(2, 3, "yellow");
        r4.draw();
    }
}
