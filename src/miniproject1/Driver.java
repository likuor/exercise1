package miniproject1;

public class Driver {

    static boolean isGameFinished = false;

    public static void main(String[] args){
        UserInput userInput = new UserInput();
        WinOrLose winOrLose = new WinOrLose();

        while(!isGameFinished) {
            userInput.checkingGuess();
            winOrLose.checkWinOrLose();
        }
    }
}
