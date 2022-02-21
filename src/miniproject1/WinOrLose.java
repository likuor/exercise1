package miniproject1;

public class WinOrLose {

    /**
     * method to check if user wins based on the count or their guessing so far
     */
    public void checkWinOrLose(){
        if (UserInput.count == 10){
            System.out.println("You Lose!");
            System.out.println("The correct word was " + UserInput.answer);
            Driver.isGameFinished = true;
        }else if(UserInput.guessing.toString().equals(UserInput.answer)){
            System.out.println("You win!");
            System.out.println("You have guessed " + "'" + UserInput.answer + "'" + " correctly.");
            Driver.isGameFinished = true;
        }
    }
}