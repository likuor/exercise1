package lab3;

/**
 * @author Kaiya Takahashi
 */

public class Queen extends Piece {

    Queen(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move(){
        System.out.println("Like bishop and rook");
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
