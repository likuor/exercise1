package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int randomNum = (int) (Math.random() * 100) + 1;
            arrayList.add(randomNum);
        }

        System.out.println("ArrayList: " + arrayList);

        int largestValue = arrayList.get(0);
        for (int i = 0; i < 10; i++){
            if (arrayList.get(i) > largestValue){
                largestValue = arrayList.get(i);
            }
        }
        System.out.println();
        System.out.println("The largest value is " + largestValue);
    }
}
