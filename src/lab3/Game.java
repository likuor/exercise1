package lab3;

public class Game {
    private Piece[][] board;

    public Game(){
        this.board = new Piece[8][8];
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }
}
