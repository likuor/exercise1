package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    int num;
    Scanner scanner = new Scanner(System.in);
    public void print(){
        System.out.print("Count to: ");
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
