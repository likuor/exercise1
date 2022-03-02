package lab3;

/**
 * @author Kaiya Takahashi
 */

public class Rook extends Piece{

    Rook(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move(){
        System.out.println("Horizontally or vertically");
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
