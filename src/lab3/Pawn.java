package lab3;

import java.util.Objects;

/**
 * @author Kaiya Takahashi
 */

public class Pawn extends Piece{

    private boolean promoted;
    private Piece newPiece;

    /**
     * Constructor 1
     * @param value
     * @param isWhite
     */
    Pawn (int value, boolean isWhite){
        super(1, isWhite);
    }

    /**
     * Constructor 2
     * @param value
     * @param isWhite
     * @param promoted
     * @param newPiece
     */
    Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece){
        super(1, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    public void promote(Piece newPiece){
        this.promoted = true;
        this.newPiece = newPiece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pawn pawn = (Pawn) o;
        return promoted == pawn.promoted && Objects.equals(newPiece, pawn.newPiece);
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "promoted=" + promoted +
                ", newPiece=" + newPiece +
                '}';
    }

    @Override
    public void move(){
        System.out.println("Forward 1");
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
