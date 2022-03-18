package lab3;
        /**
         * @author Kaiya Takahashi
         */
public class Knight extends Piece{
    /**
     * Constructor
     * @param value
     * @param isWhite
     */
    Knight(int value, boolean isWhite) {
        super(5, isWhite);
    }
    @Override
    public String getIcon() {
        if (this.isWhite()) {
            return "♞";
        }else{
            return "♘";
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
            System.out.println("Knight only moves Like an L");
            return false;
        }
    }
    @Override
    public boolean isValidMove(Position newPosition, Piece[][] board) {
        if(!super.isValidMove(position, board)){
            return false;
        }
        if(
                ((Math.abs(newPosition.getCol() - this.position.getCol()) == 1) &&
                        (Math.abs(newPosition.getRow() - this.position.getRow()) == 2)) ||
                        ((Math.abs(newPosition.getRow() - this.position.getRow()) == 1) &&
                                (Math.abs(newPosition.getCol() - this.position.getCol()) == 2)))
        {
            return board[newPosition.getRow()][newPosition.getCol()] == null || board[newPosition.getRow()][newPosition.getCol()].isWhite() != isWhite();
        }
        else{
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
//    public void move(Position newPosition, Piece[][] board) {
//    }
}