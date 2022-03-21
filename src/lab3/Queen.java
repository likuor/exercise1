package lab3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kaiya Takahashi
 */

public class Queen extends Piece {

    Queen(int value, boolean isWhite) {
        super(9, isWhite);
    }

    @Override
    public String getIcon() {
        if (this.isWhite()) {
            return "♛";
        } else {
            return "♕";
        }
    }

    @Override
    public boolean move(Position newPosition, Piece[][] board) {

//        int newCol = newPosition.getCol();
//        int newRow = newPosition.getRow();
//        int col = this.position.getCol();
//        int row = this.position.getRow();
//
//        if (this.isValidMove(newPosition, board)) {
//            board[row][col] = null;
//            this.position = newPosition;
//            board[newRow][newCol] = this;
//            return true;
//        } else {
//            System.out.println("Invalid movement!");
//            System.out.println("Queen only moves like bishop or rook");
//            return false;
//        }
        return true;
    }

    @Override
    public boolean isValidMove(ArrayList<Integer> pieceIndex, Piece[][] board, int turnChanger) {
        int originalCol = pieceIndex.get(0);
        int originalRow = pieceIndex.get(1);
        int destinationCol = pieceIndex.get(2);
        int destinationRow = pieceIndex.get(3);

        // check if player picks the valid colour piece
        if (!this.isWhite()) {
            if (turnChanger % 2 == 0) {
                return false;
            }
        } else {
            if (turnChanger % 2 != 0) {
                return false;
            }
        }

        // same as bishop
        // check if destination is valid
        // check if current position and destination are same position
        if (originalRow == destinationRow && originalCol == destinationCol) {
            return false;
        }

        // go up right and go down left
        if (Math.abs(originalCol + originalRow) == Math.abs(destinationCol + destinationRow)) {
            // go up right
            if (originalCol > destinationCol && originalRow < destinationRow) {
                int movableCol = originalCol - 1;
                int movableRow = originalRow + 1;
                // check if there is any piece on the way to the destination
                while (movableCol != -1 || movableRow != 8) {
                    if (board[movableCol][movableRow] == null) {
                        if (movableCol == destinationCol || movableRow == destinationRow) return true;
                        movableCol--;
                        movableRow++;
                    } else {
                        if ((board[movableCol][movableRow].isWhite() && turnChanger % 2 != 0) ||
                                (!(board[movableCol][movableRow].isWhite()) && turnChanger % 2 == 0)) {
                            return movableCol == destinationCol || movableRow == destinationRow;
                        }
                        return false;
                    }
                }
            }
            // go down left
            if (originalCol < destinationCol && originalRow > destinationRow) {
                int movableCol = originalCol + 1;
                int movableRow = originalRow - 1;
                // check if there is any piece on the way to the destination
                while (movableCol != 8 || movableRow != -1) {
                    if (board[movableCol][movableRow] == null) {
                        if (movableCol == destinationCol || movableRow == destinationRow) return true;
                        movableCol++;
                        movableRow--;
                    } else {
                        if ((board[movableCol][movableRow].isWhite() && turnChanger % 2 != 0) ||
                                (!(board[movableCol][movableRow].isWhite()) && turnChanger % 2 == 0)) {
                            return movableCol == destinationCol || movableRow == destinationRow;
                        }
                        return false;
                    }
                }
            }
        }

        // go up left and go down right
        if (Math.abs(originalCol - originalRow) == Math.abs(destinationCol - destinationRow)) {
            // go up left
            if (originalCol > destinationCol && originalRow > destinationRow) {
                int movableCol = originalCol - 1;
                int movableRow = originalRow - 1;
                // check if there is any piece on the way to the destination
                while (movableCol != -1 || movableRow != -1) {
                    if (board[movableCol][movableRow] == null) {
                        if (movableCol == destinationCol || movableRow == destinationRow) return true;
                        movableCol--;
                        movableRow--;
                    } else {
                        if ((board[movableCol][movableRow].isWhite() && turnChanger % 2 != 0) ||
                                (!(board[movableCol][movableRow].isWhite()) && turnChanger % 2 == 0)) {
                            return movableCol == destinationCol || movableRow == destinationRow;
                        }
                        return false;
                    }
                }
            }
            // go down right
            if (originalCol < destinationCol && originalRow < destinationRow) {
                int movableCol = originalCol + 1;
                int movableRow = originalRow + 1;
                // check if there is any piece on the way to the destination
                while (movableCol != 8 || movableRow != 8) {
                    if (board[movableCol][movableRow] == null) {
                        if (movableCol == destinationCol || movableRow == destinationRow) return true;
                        movableCol++;
                        movableRow++;
                    } else {
                        if ((board[movableCol][movableRow].isWhite() && turnChanger % 2 != 0) ||
                                (!(board[movableCol][movableRow].isWhite()) && turnChanger % 2 == 0)) {
                            return movableCol == destinationCol || movableRow == destinationRow;
                        }
                        return false;
                    }
                }
            }
        }
        // same as king
        if (Math.abs(destinationRow - originalRow) <= 1 && Math.abs(destinationCol - originalCol) <= 1){
            // check if there is any piece on destination
            if (board[destinationCol][destinationRow] == null){
                return true;
            }else {
                if (board[originalCol][originalRow].isWhite()) {
                    // check if it is different colour from picked piece
                    return !board[destinationCol][destinationRow].isWhite();
                } else {
                    return board[destinationCol][destinationRow].isWhite();
                }
            }
        }
        return false;
    }

    @Override
    public void printPossibleMove(ArrayList<Integer> pieceIndex, Piece[][] board, int turnChanger) {
        int originalCol = pieceIndex.get(0);
        int originalRow = pieceIndex.get(1);
        boolean stop = false;
        Set<String> possibleMove = new HashSet<>();
        // go up right
        while (originalCol != 0 && originalRow != 7 && !stop){
            originalCol--;
            originalRow++;
            if (board[originalCol][originalRow] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow) + originalCol + "]");
            }else if((board[originalCol][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol][originalRow].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow) + originalCol + "]");
                stop = true;
            }else if ((!board[originalCol][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (board[originalCol][originalRow].isWhite() && turnChanger % 2 == 0)){
                stop = true;
            }
        }
        // go down left
        originalCol = pieceIndex.get(0);
        originalRow = pieceIndex.get(1);
        stop = false;
        while (originalCol !=7 && originalRow != 0 && !stop){
            originalCol++;
            originalRow--;
            if (board[originalCol][originalRow] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow) + originalCol + "]");
            }else if((board[originalCol][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol][originalRow].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow) + originalCol + "]");
                stop = true;
            }else if ((!board[originalCol][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (board[originalCol][originalRow].isWhite() && turnChanger % 2 == 0)){
                stop = true;
            }
        }
        // go up left
        originalCol = pieceIndex.get(0);
        originalRow = pieceIndex.get(1);
        stop = false;
        while (originalCol !=0 && originalRow != 0 && !stop){
            originalCol--;
            originalRow--;
            if (board[originalCol][originalRow] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow) + originalCol + "]");
            }else if((board[originalCol][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol][originalRow].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow) + originalCol + "]");
                stop = true;
            }else if ((!board[originalCol][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (board[originalCol][originalRow].isWhite() && turnChanger % 2 == 0)){
                stop = true;
            }
        }
        // go down right
        originalCol = pieceIndex.get(0);
        originalRow = pieceIndex.get(1);
        stop = false;
        while (originalCol !=7 && originalRow != 7 && !stop){
            originalCol++;
            originalRow++;
            if (board[originalCol][originalRow] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow) + originalCol + "]");
            }else if((board[originalCol][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol][originalRow].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow) + originalCol + "]");
                stop = true;
            }else if ((!board[originalCol][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (board[originalCol][originalRow].isWhite() && turnChanger % 2 == 0)){
                stop = true;
            }
        }

        originalCol = pieceIndex.get(0);
        originalRow = pieceIndex.get(1);
        try {
            if (board[originalCol - 1][originalRow - 1] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow - 1) + (originalCol- 1) + "]");
            }
            if((board[originalCol - 1][originalRow - 1].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol - 1][originalRow - 1].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow - 1) + (originalCol- 1) + "]");
            }
        }catch (Exception ignored){
        }
        try {
            if (board[originalCol - 1][originalRow] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow) + (originalCol - 1) + "]");
            }
            if((board[originalCol - 1][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol - 1][originalRow].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow) + (originalCol - 1) + "]");
            }
        }catch (Exception ignored){
        }
        try {
            if (board[originalCol - 1][originalRow + 1] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow + 1) + (originalCol-1) + "]");
            }
            if((board[originalCol - 1][originalRow + 1].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol - 1][originalRow + 1].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow + 1) + (originalCol-1) + "]");
            }
        }catch (Exception ignored){
        }
        try {
            if (board[originalCol][originalRow - 1] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow -1) + originalCol + "]");
            }
            if((board[originalCol][originalRow - 1].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol][originalRow - 1].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow -1) + originalCol + "]");
            }
        }catch (Exception ignored){
        }
        try {
            if (board[originalCol][originalRow + 1] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow + 1) + originalCol + "]");
            }
            if((board[originalCol][originalRow + 1].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol][originalRow + 1].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow + 1) + originalCol + "]");
            }
        }catch (Exception ignored){
        }
        try {
            if (board[originalCol + 1][originalRow - 1] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow - 1) + (originalCol+1) + "]");
            }
            if((board[originalCol + 1][originalRow - 1].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol + 1][originalRow - 1].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow - 1) + (originalCol+1) + "]");
            }
        }catch (Exception ignored){
        }
        try {
            if (board[originalCol + 1][originalRow] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow) + (originalCol+1) + "]");
            }
            if((board[originalCol + 1][originalRow].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol + 1][originalRow].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow) + (originalCol+1) + "]");
            }
        }catch (Exception ignored){
        }
        try {
            if (board[originalCol + 1][originalRow + 1] == null) {
                possibleMove.add("[" + numberToAlphabet(originalRow+1) + (originalCol+1) + "]");
            }
            if((board[originalCol + 1][originalRow + 1].isWhite() && turnChanger % 2 != 0) ||
                    (!(board[originalCol + 1][originalRow + 1].isWhite()) && turnChanger % 2 == 0)){
                possibleMove.add("[" + numberToAlphabet(originalRow+1) + (originalCol+1) + "]");
            }
        }catch (Exception ignored){
        }
        System.out.println("Possible move: " + possibleMove);
    }

    @Override
    public void setValue(int value) {
        super.setValue(value);
    }

    @Override
    public int getValue() {
        return super.getValue();
    }

    @Override
    public String toString() {
        return "Queen{" + super.toString();
    }
}