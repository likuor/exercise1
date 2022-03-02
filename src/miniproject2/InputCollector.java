package miniproject2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kaiya Takahashi
 */

public class InputCollector {

    /**
     * Method to get user input (String)
     * @param prompt the prompt to guide user
     * @return user input
     */
    public static String getUserInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Method to get mandatory user input
     * @param prompt the prompt to guide user
     * @return user input
     */
    public static String mustGetUserInput(String prompt){
        boolean isValidInput= false;
        String userInput = "";
        while (!isValidInput) {
            try {
                System.out.println(prompt);
                Scanner scanner = new Scanner(System.in);
                userInput = scanner.nextLine();
                if (userInput.isBlank()) {
                    throw new Exception();
                } else {
                    isValidInput = true;
                }
            }catch (Exception e){
                System.out.println("You must fill this field.");
            }
        }
        return userInput;
    }

    /**
     * Method to get user input (phone number)
     * @param prompt the prompt to guide user
     * @return user input
     */
    public static String getUserInputNumber(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String userNumberStr = "";
        long userNumber = 0;
        boolean isValidInput = false;
        while(!isValidInput) {
            try {
                userNumberStr = scanner.nextLine();
                if (userNumberStr.isBlank()){
                    return "";
                }
                userNumber = Long.parseLong(userNumberStr);
                if (userNumberStr.length() == 10) {
                    isValidInput = true;
                }else{
                    System.out.println("Enter a valid input.");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Enter a valid input.");
            }
        }
        long firstThree = userNumber / 1_000_0000;
        long secondThree = userNumber / 10_000 % 1000;
        long lastFour = userNumber % 10_000;
        // return number with hyphen
        return String.format("%d-%d-%d", firstThree, secondThree, lastFour);
    }

    /**
     * Method to get mandatory user input (Number)
     * @param prompt the prompt to guide user
     * @return user input
     */
    public static String mustGetUserInputNumber(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String userNumberStr = "";
        long userNumber = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                userNumberStr = scanner.nextLine();
                if (userNumberStr.isBlank()){
                    System.out.println("This field must be filled.");
                }
                userNumber = Long.parseLong(userNumberStr);
                if (userNumberStr.length() == 10) {
                    isValidInput = true;
                }else{
                    System.out.println("Enter a valid input.");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Enter a valid input.");
            }
        }
        long firstThree = userNumber / 1_000_0000;
        long secondThree = userNumber / 10_000 % 1000;
        long lastFour = userNumber % 10_000;
        // return number with hyphen
        return String.format("%d-%d-%d", firstThree, secondThree, lastFour);
    }
}
