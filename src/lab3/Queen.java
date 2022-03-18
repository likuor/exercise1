package lab3;

/**
 * @author Kaiya Takahashi
 */

public class Queen extends Piece {

    Queen(int value, boolean isWhite) {
        super(9, isWhite);
    }

    @Override
    public void move(){
        System.out.println("Like bishop and rook");
    }

    @Override
    public String getIcon() {
        if (this.isWhite()) {
            return "♛";
        }else{
            return "♕";
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