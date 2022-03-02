package week2.arraylists;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int randomNum = (int) (Math.random() * 100) + 1;
            arrayList.add(randomNum);
        }

        System.out.println("ArrayList: " + arrayList);
    }
}
