package com.company;

import java.util.ArrayList;

public class Bishop extends Figure{

    public Bishop(boolean colorPiece,Square square) {
        setColorPiece(colorPiece);
        setPieceName("Bishop");
        setSquare(square);
    }

    @Override
    public ArrayList<Square> possibleMove() {

        

        return null;
    }
}
