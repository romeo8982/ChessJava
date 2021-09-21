package com.company;

import java.util.ArrayList;

public class Rook extends Figure{

    public Rook(boolean colorPiece,Square square) {
        setColorPiece(colorPiece);
        setPieceName("Rook");
        setSquare(square);
    }

    @Override
    public ArrayList<Square> possibleMove() {
        ArrayList <Square> possibleSquares = new ArrayList<>();


        //if not interferences and discovered checks

        for(int i=1; i<=8; i++) {
            if(i!= getSquare().getCoordinateX()||i!= getSquare().getCoordinateY()) {
                possibleSquares.add(new Square(i, getSquare().getCoordinateY()));
                possibleSquares.add(new Square(getSquare().getCoordinateX(), i));
            }
        }
        return  possibleSquares;
    }
}
