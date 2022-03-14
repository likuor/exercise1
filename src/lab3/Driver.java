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
        game.getBoard()[1][0] = new Pawn(1, true);
        game.getBoard()[1][1] = new Pawn(1, true);
        game.getBoard()[1][2] = new Pawn(1, true);
        game.getBoard()[1][3] = new Pawn(1, true);
        game.getBoard()[1][4] = new Pawn(1, true);
        game.getBoard()[1][5] = new Pawn(1, true);
        game.getBoard()[1][6] = new Pawn(1, true);
        game.getBoard()[1][7] = new Pawn(1, true);

        game.getBoard()[6][0] = new Pawn(1, false);
        game.getBoard()[6][1] = new Pawn(1, false);
        game.getBoard()[6][2] = new Pawn(1, false);
        game.getBoard()[6][3] = new Pawn(1, false);
        game.getBoard()[6][4] = new Pawn(1, false);
        game.getBoard()[6][5] = new Pawn(1, false);
        game.getBoard()[6][6] = new Pawn(1, false);
        game.getBoard()[6][7] = new Pawn(1, false);

        game.getBoard()[0][1] = new Knight(2, true);
        game.getBoard()[0][6] = new Knight(2, true);

        game.getBoard()[7][1] = new Knight(2, false);
        game.getBoard()[7][6] = new Knight(2, false);

        game.getBoard()[0][2] = new Bishop(3, true);
        game.getBoard()[0][5] = new Bishop(3, true);

        game.getBoard()[7][2] = new Bishop(3, false);
        game.getBoard()[7][5] = new Bishop(3, false);

        game.getBoard()[0][0] = new Rook(5, true);
        game.getBoard()[0][7] = new Rook(5, true);

        game.getBoard()[7][0] = new Rook(5, false);
        game.getBoard()[7][7] = new Rook(5, false);

        game.getBoard()[0][4] = new Queen(9, true);
        game.getBoard()[7][4] = new Queen(9, false);

        game.getBoard()[0][3] = new King(1_000, true);
        game.getBoard()[7][3] = new King(1_000, false);

        // Print a board
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(game.getBoard()[i][j] == null){
                    System.out.print("・ ");
                }else{
                    System.out.print(game.getBoard()[i][j].getIcon() + " ");
                }
            }
            System.out.println();
        }
    }
}
