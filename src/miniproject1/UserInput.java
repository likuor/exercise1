package miniproject1;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);
    static Answer a1 = new Answer();

    final static String answer = a1.generateAnswer();
    final static String answerInLoweCase = answer.toLowerCase(Locale.ROOT);
    private final int lengthOfAnswer = answer.length();
    private boolean firstImplement = true;
    static int count = 0;

    static StringBuilder guessing = new StringBuilder(answerInLoweCase);
    StringBuilder wrongGuesses = new StringBuilder("");

    /**
     * check if the guess is right or wrong, then implement methods based on the condition.
     */
    public void checkingGuess(){
        //display the length of the answer blurred with "_" just one time.
        while(firstImplement){
            for (int i = 0; i < lengthOfAnswer; i++){
                if (guessing.charAt(i) == ' '){
                    guessing.setCharAt(i, ' ');
                }else {
                    guessing.setCharAt(i, '_');
                }
            firstImplement = false;
            }
            System.out.println("Here's a question.");
            System.out.println(guessing);
        }
        boolean rightGuess = false;
        System.out.print("Guess a letter: ");
        String userInput = scanner.nextLine();
        char userInputInChar = '_';
        if (userInput.length() > 1) {
            System.out.println("Enter valid input");
            return;
        }else {
            userInputInChar = userInput.charAt(0);
        }
        // takes the user input, and implement methods below depends on the user input
        for (int i = 0; i < lengthOfAnswer; i++) {
            if (answerInLoweCase.charAt(i) == userInputInChar) {
                guessing.setCharAt(i, answer.charAt(i));
                rightGuess = true;
            }
        }
        if (!rightGuess) {
            wrongGuesses.append(userInputInChar);
            wrongGuesses.append(" ");
            count ++;
        }
        System.out.println("You are guessing: " + guessing);
        String message = String.format("You have guessed (%s) wrong letters: %s", count, wrongGuesses);
        System.out.println(message);
    }
}
