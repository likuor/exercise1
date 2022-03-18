package lab3;

        /**
         * @author Kaiya Takahashi
         */

public class Bishop extends Piece{
    /**
     * Constructor
     * @param value
     * @param isWhite
     */
    Bishop(int value, boolean isWhite){
        super(3, isWhite);
    }

    @Override
    public String getIcon() {
        if (this.isWhite()) {
            return "♝";
        }else{
            return "♗";
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
        } else {
            System.out.println("Invalid move!");
            System.out.println("Bishop moves only diagonally");
        }
        return false;
    }

    @Override
    public boolean isValidMove(Position newPosition, Piece[][] board) {
        if (!super.isValidMove(position, board)) {
            return false;
        }

        if (position.getRow() == newPosition.getRow() && position.getCol() == newPosition.getCol()) {
            return false;
        }

        if (Math.abs(newPosition.getCol() - this.position.getCol()) ==
                Math.abs(newPosition.getRow() - this.position.getRow())) {
            int crossPosition = Math.abs(newPosition.getCol() - this.position.getCol()) - 1;
            if (
                    newPosition.getRow() > this.position.getRow() &&
                            newPosition.getCol() > this.position.getCol()) {
                int r = this.position.getRow() + 1;
                int c = this.position.getCol() + 1;
                if (crossPosition == 0 && board[r][c] != null && board[r][c].isWhite() == isWhite()) {
                    return false;
                }
                while (crossPosition > 0) {
                    if (board[r][c] != null) {
                        return false;
                    }
                    r += 1;
                    c += 1;
                    crossPosition -= 1;
                }
                return true;
            } else if (
                    newPosition.getRow() > this.position.getRow() &&
                            newPosition.getCol() <= this.position.getCol()) {
                int r = this.position.getRow() + 1;
                int c = this.position.getCol() - 1;
                if (crossPosition == 0 && board[r][c] != null && board[r][c].isWhite() == isWhite()) {
                    return false;
                }
                while (crossPosition > 0) {
                    if (board[r][c] != null) {
                        return false;
                    }
                    r += 1;
                    c -= 1;
                    crossPosition -= 1;
                }
                return true;
            } else if (
                    newPosition.getRow() <= this.position.getRow() &&
                            newPosition.getCol() > this.position.getCol()) {
                int r = this.position.getRow() - 1;
                int c = this.position.getCol() + 1;
                if (crossPosition == 0 && board[r][c] != null && board[r][c].isWhite() == isWhite()) {
                    return false;
                }
                while (crossPosition > 0) {
                    if (board[r][c] != null) {
                        return false;
                    }
                    r -= 1;
                    c += 1;
                    crossPosition -= 1;
                }
                return true;

            } else {
                int r = newPosition.getRow() + 1;
                int c = newPosition.getCol() + 1;
                if (crossPosition == 0 && board[r][c] != null && board[r][c].isWhite() == isWhite()) {
                    return false;
                }
                while (crossPosition > 0) {
                    if (board[r][c] != null) {
                        return false;
                    }
                    r += 1;
                    c += 1;
                    crossPosition -= 1;
                }
                return true;
            }
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
}