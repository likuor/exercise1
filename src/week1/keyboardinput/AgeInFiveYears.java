package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    int age;
    String name;
    Scanner scanner = new Scanner(System.in);

    public void print(){
        System.out.print("Hello.  What is your name? ");
        name = scanner.nextLine();
        System.out.println("");
        System.out.print("Hi, " + name + "!  How old are you? ");
        age = scanner.nextInt();
        System.out.println("");
        int agePlusFive = age + 5;
        int ageMinusFive = age - 5;
        System.out.println("Did you know that in five years you will be " + agePlusFive + " years old?\n" +
                "And five years ago you were " + ageMinusFive + "! Imagine that!");
    }
}
