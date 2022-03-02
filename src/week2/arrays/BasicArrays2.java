package week2.arrays;

public class BasicArrays2 {

    public static void main(String[] args){
        int randomNum;
        int[] randomNumArray = new int[10];

        for (int i = 0; i < 10; i++){
            randomNum = (int) (Math.random() * 100) + 1;
            randomNumArray[i] = randomNum;
            System.out.println("Slot " + i + " contains a " + randomNumArray[i] + ".");
        }
    }
}
