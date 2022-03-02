package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int randomNum = (int) (Math.random() * 50) + 1;
            arrayList.add(randomNum);
        }

        System.out.println("ArrayList: " + arrayList);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Value to find: ");
        int valueToFind = scanner.nextInt();
        System.out.println("");
        for (int i = 0; i < 10; i++){
            if (arrayList.get(i) == valueToFind){
                System.out.println(valueToFind + " is in the ArrayList.");
            }
        }
    }
}
