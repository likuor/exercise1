package lab3;
        /**
         * @author Kaiya Takahashi
         */
public abstract class Piece {
    protected Position position;
    private int value;
    private boolean isWhite;
    Piece(int value, boolean isWhite){
        this.value = value;
        this.isWhite = isWhite;
    }
    public abstract boolean move(Position newPosition, Piece[][] board);
    public abstract String getIcon();
    public void setPiece(Piece piece){
    }
    public boolean isValidMove(Position newPosition, Piece[][] board){
        if (newPosition.getRow() >= 0 && newPosition.getCol() >= 0 &&
                newPosition.getRow() > 8 && newPosition.getCol() < 8) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return value == piece.value && isWhite == piece.isWhite;
    }
    @Override
    public String toString() {
        return "Piece{" +
                "value=" + value +
                ", isWhite=" + isWhite +
                '}';
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setWhite(boolean white) {
        isWhite = white;
    }
    public boolean isWhite() {
        return isWhite;
    }
    public void move() {
    }
}