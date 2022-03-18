package lab3;
        /**
         * @author Kaiya Takahashi
         */
public class Rook extends Piece {
    Rook(int value, boolean isWhite) {
        super(5, isWhite);
    }

    @Override
    public String getIcon() {
        if (this.isWhite()) {
            return "♜";
        } else {
            return "♖";
        }
    }
    @Override
    public boolean move(Position newPosition, Piece[][] board) {
        int newCol = newPosition.getCol();
        int newRow = newPosition.getRow();
        int col = this.position.getCol();
        int row = this.position.getRow();
        if (this.isValidMove(newPosition, board)) {
            board[row][col] = null;
            this.position = newPosition;
            board[newRow][newCol] = this;
            return true;
        } else {
            System.out.println("Invalid movement!");
            System.out.println("Rooks moves only horizontally or vertically");
            return false;
        }
    }
    @Override
    public boolean isValidMove(Position newPosition, Piece[][] board) {
        if (!super.isValidMove(position, board)) {
            return false;
        }
        if (newPosition.getCol() == this.position.getCol()) {
            int minRow;
            int maxRow;
            if (newPosition.getRow() >= this.position.getRow()) {
                minRow = this.position.getRow();
                maxRow = newPosition.getRow();
            } else {
                minRow = newPosition.getRow();
                maxRow = this.position.getRow();
            }
            for (int r = minRow + 1; r < maxRow; r++) {
                if (board[r][this.position.getCol()] != null) {
                    return false;
                }
            }
            return board[newPosition.getRow()][newPosition.getCol()] == null || board[newPosition.getRow()][newPosition.getCol()].isWhite() != isWhite();
        } else if (newPosition.getRow() == this.position.getRow()) {
            int minCol;
            int maxCol;
            if (newPosition.getCol() >= this.position.getCol()) {
                minCol = this.position.getCol();
                maxCol = newPosition.getCol();
            } else {
                minCol = newPosition.getCol();
                maxCol = this.position.getCol();
            }
            for (int c = minCol + 1; c < maxCol; c++) {
                if (board[this.position.getRow()][c] != null) {
                    return false;
                }
            }
            return board[newPosition.getRow()][newPosition.getCol()] == null || board[newPosition.getRow()][newPosition.getCol()].isWhite() != isWhite();
        } else {
            return false;
        }
    }
    @Override
    public void setValue(int value) {
        super.setValue(value);
    }
    @Override
    public int getValue() {
        return super.getValue();
    }
//    @Override
//    public boolean move(Position newPosition, Piece[][] board) {
//        return false;
//    }
}