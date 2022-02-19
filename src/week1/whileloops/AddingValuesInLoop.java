package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {

    Scanner scanner = new Scanner(System.in);
    int total;
    int count;


    public void print(){
        System.out.print("I will add up the numbers you give me.\nNumber: ");
        total = scanner.nextInt();
        while ( count < 4) {
            System.out.println("The total so far is " + total);
            System.out.print("Number: ");
            total += scanner.nextInt();
            count++;
        }
        System.out.println();
        System.out.println("The total is " + total);
    }
}
