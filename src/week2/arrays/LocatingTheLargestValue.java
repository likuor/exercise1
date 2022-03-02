package week2.arrays;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] randomNumArray = new int[10];
        int largestValue = 0;
        int index = 0;

        System.out.print("Array: ");
        for (int i = 0; i < 10; i++){
            int randomNum = (int) (Math.random() * 100) + 1;
            randomNumArray[i] = randomNum;
            System.out.print(randomNumArray[i]);
            System.out.print(" ");
        }

        largestValue = randomNumArray[0];
        for (int i = 0; i < 10; i++){
            if (randomNumArray[i] > largestValue){
                largestValue = randomNumArray[i];
                index = i;
            }
        }

        System.out.println("\n");
        System.out.println("The largest value is " + largestValue);
        System.out.println("It is in slot " + index);
    }
}
