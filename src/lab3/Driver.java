package lab3;

/**
 * @author Kaiya Takahashi
 */

public class Driver {

    public static void main(String[] args){
//        PiecesList piecesList = new PiecesList();
//
//        piecesList.printAllMove();
//
//        Piece p1 = new Pawn(1, true, true, piecesList.queen1);
//        Piece p2 = new Pawn(1, true, false, null);
//        Piece p3 = new Pawn(1, false, false, null);
//        Piece p4 = new Pawn(1, false, true, piecesList.queen2);
//        Piece p5 = new Pawn(1, true, true, piecesList.knight1);
//
//        System.out.println(p1.equals(p2)); //should return false
//        System.out.println(p1.equals(p4)); //should return false
//        System.out.println(p1.equals(p5)); //should return false
//        System.out.println(p2.equals(p3)); //should return false
//        System.out.println(p4.equals(p5)); //should return false

        Game game = new Game();

        // Print a board
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(game.getBoard()[i][j] == null){
                    System.out.print("・ ");
                }else{
                    System.out.print(game.getBoard()[i][j].getIcon() + " ");
                }
            }
            System.out.println(" " + i);
        }
        System.out.println();
        System.out.print("a　b　c　d　e　f　g　h");
    }
}
