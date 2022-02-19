package week1.forloops;

import java.util.Scanner;

public class FizzBuzz {

    int num;
    Scanner scanner = new Scanner(System.in);

    public void print() {
        System.out.print("Count to: ");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}
