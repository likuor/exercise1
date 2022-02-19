package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    Scanner scanner = new Scanner(System.in);
    String userName;
    int age;
    float salary;

    public void printEveything(){
        System.out.println("Hello. What is your name?");
        userName = scanner.nextLine();
        System.out.println("\nHi," + userName + "!  How old are you?");
        age = scanner.nextInt();
        System.out.print("\nSo you're " + age + ", eh?  That's not old at all!");
        System.out.println("How much do you make, " + userName + "?");
        salary = scanner.nextFloat();
        System.out.println("\n" + salary + "!  I hope that's per hour and not per year! LOL!");
    }
}
