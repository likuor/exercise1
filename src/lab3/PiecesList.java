package lab3;

import java.util.ArrayList;

/**
 * @author Kaiya Takahashi
 */

public class PiecesList {

    ArrayList<Piece> pieceArrayList = new ArrayList<>();
    Piece pawn1 = new Pawn(1, true);
    Piece pawn2 = new Pawn(1, false);
    Piece knight1 = new Knight(2, true);
    Piece knight2 = new Knight(2, false);
    Piece bishop1 = new Bishop(3, true);
    Piece bishop2 = new Bishop(3, false);
    Piece rook1 = new Rook(5, true);
    Piece rook2 = new Rook(5, false);
    Piece queen1 = new Queen(9, true);
    Piece queen2 = new Queen(9, false);
    Piece king1 = new King(1_000, true);
    Piece king2 = new King(1_000, false);

    PiecesList(){
        pieceArrayList.add(pawn1);
        pieceArrayList.add(pawn2);
        pieceArrayList.add(knight1);
        pieceArrayList.add(knight2);
        pieceArrayList.add(bishop1);
        pieceArrayList.add(bishop2);
        pieceArrayList.add(rook1);
        pieceArrayList.add(rook2);
        pieceArrayList.add(queen1);
        pieceArrayList.add(queen2);
        pieceArrayList.add(king1);
        pieceArrayList.add(king2);
    }

    public void printAllMove(){
        for (Piece piece: pieceArrayList){
            piece.move();
        }
    }
}
