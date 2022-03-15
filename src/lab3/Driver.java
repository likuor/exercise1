package lab3;

/**
 * @author Kaiya Takahashi
 */

public class Driver {

    public static void main(String[] args){
        Game game = new Game();

        // Print a board
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(game.getBoard()[i][j] == null){
                    System.out.print(". ");
                }else{
                    System.out.print(game.getBoard()[i][j].getIcon() + " ");
                }
            }
            System.out.println(" " + (game.getBoard().length-i));
        }
        System.out.println();
        System.out.print("a b c d e f g h");
    }
}
