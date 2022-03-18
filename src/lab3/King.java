package lab3;

/**
 * @author Kaiya Takahashi
 */

public class King extends Piece{

    King(int value, boolean isWhite) {
        super(1_000, isWhite);
    }

    @Override
    public void move(){
        System.out.println("One square");
    }

    @Override
    public String getIcon() {
        if (this.isWhite()) {
            return "♚";
        }else{
            return "♔";
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