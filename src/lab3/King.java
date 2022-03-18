package lab3;
        /**
         * @author Kaiya Takahashi
         */
public class King extends Piece {
    King(int value, boolean isWhite) {
        super(1_000, isWhite);
    }
    @Override
    public String getIcon() {
        if (this.isWhite()) {
            return "♚";
        } else {
            return "♔";
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
            System.out.println("Invalid move!");
            System.out.println("King moves only one square in any direction");
            return false;
        }
    }
    @Override
    public boolean isValidMove(Position newPosition, Piece[][] board) {
        if (!super.isValidMove(position, board)) {
            return false;
        }
        Piece to = board[newPosition.getRow()][newPosition.getCol()];
        if (to != null && to.isWhite() == isWhite()) {
            return false;
        }
        return (Math.abs(newPosition.getCol() - this.position.getCol()) <= 1) &&
                (Math.abs(newPosition.getRow() - this.position.getRow()) <= 1);
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