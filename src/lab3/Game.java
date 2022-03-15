package lab3;

public class Game {
    private Piece[][] board;

    public Game(){
        this.board = new Piece[8][8];
        board[1][0] = new Pawn(1, true);
        board[1][1] = new Pawn(1, true);
        board[1][2] = new Pawn(1, true);
        board[1][3] = new Pawn(1, true);
        board[1][4] = new Pawn(1, true);
        board[1][5] = new Pawn(1, true);
        board[1][6] = new Pawn(1, true);
        board[1][7] = new Pawn(1, true);

        board[6][0] = new Pawn(1, false);
        board[6][1] = new Pawn(1, false);
        board[6][2] = new Pawn(1, false);
        board[6][3] = new Pawn(1, false);
        board[6][4] = new Pawn(1, false);
        board[6][5] = new Pawn(1, false);
        board[6][6] = new Pawn(1, false);
        board[6][7] = new Pawn(1, false);

        board[0][0] = new Rook(3, true);
        board[0][7] = new Rook(3, true);

        board[7][0] = new Rook(3, false);
        board[7][7] = new Rook(3, false);

        board[0][1] = new Knight(5, true);
        board[0][6] = new Knight(5, true);

        board[7][1] = new Knight(5, false);
        board[7][6] = new Knight(5, false);

        board[0][2] = new Bishop(5, true);
        board[0][5] = new Bishop(5, true);

        board[7][2] = new Bishop(5, false);
        board[7][5] = new Bishop(5, false);

        board[0][4] = new Queen(5, true);
        board[7][4] = new Queen(5, false);

        board[0][3] = new King(5, true);
        board[7][3] = new King(5, false);
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }
}
