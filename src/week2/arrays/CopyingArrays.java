package week2.arrays;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args){
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < 10; i++){
            int randomNum = (int) (Math.random() * 100) + 1;
            array1[i] = randomNum;
        }

        // can be replaced with System.arraycopy
        for (int i = 0; i < 10; i++){
            array2[i] = array1[i];
        }

        array1[9] = -7;

        System.out.print("Array 1: ");
        for (int i = 0; i < 10; i++){
            System.out.print(array1[i]);
            System.out.print(" ");
        }

        System.out.println();

        System.out.print("Array 2: ");
        for (int i = 0; i < 10; i++){
            System.out.print(array2[i]);
            System.out.print(" ");
        }
    }
}
