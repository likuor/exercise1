package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {

    int age;
    String name;
    Scanner scanner = new Scanner(System.in);

    public void print(){
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = scanner.nextLine();
        System.out.print("Ok, " + name + "!  How old are you? ");
        age = scanner.nextInt();
        System.out.println("");
        if (age < 16) System.out.println("You can't drive.");
        else if (16 == age || age == 17) System.out.println("You can drive but not vote.");
        else if (age <= 24) System.out.println("You can vote but not rent a car.");
        else System.out.println("You can do pretty much anything");
    }
}
