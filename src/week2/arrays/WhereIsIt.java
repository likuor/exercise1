package week2.arrays;

import java.util.Scanner;

public class WhereIsIt {

    public static void main(String[] args){
        int[] array = new int[10];
        int count = 0;

        System.out.print("Array: ");
        for (int i = 0; i < 10; i++){
            int randomNum = (int) (Math.random() * 50) + 1;
            array[i] = randomNum;
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value to find: ");
        int userInput = scanner.nextInt();

        System.out.println();
        for (int i = 0; i < 10; i++){
            if (array[i] == userInput){
                System.out.println(userInput + " is in slot " + i + ".");
                count++;
            }
        }
        if (count == 0){
            System.out.println(userInput + " is not in the array.");
        }
    }
}
