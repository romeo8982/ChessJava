package com.company;

import java.util.ArrayList;

public class Knight extends Figure {

    public Knight(boolean colorPiece,Square square) {
        setColorPiece(colorPiece);
        setPieceName("Knight");
        setSquare(square);
    }

    @Override
    public ArrayList<Square> possibleMove() {
        ArrayList <Square> possibleSquares = new ArrayList<>();


        //if not interferences and discovered checks

       possibleSquares.add(new Square(getSquare().getCoordinateX()+2, getSquare().getCoordinateY()+1));
       possibleSquares.add(new Square(getSquare().getCoordinateX()+2, getSquare().getCoordinateY()-1));
       possibleSquares.add(new Square(getSquare().getCoordinateX()-2, getSquare().getCoordinateY()-1));
       possibleSquares.add(new Square(getSquare().getCoordinateX()-2, getSquare().getCoordinateY()+1));
       possibleSquares.add(new Square(getSquare().getCoordinateX()-1, getSquare().getCoordinateY()+2));
       possibleSquares.add(new Square(getSquare().getCoordinateX()+1, getSquare().getCoordinateY()+2));
       possibleSquares.add(new Square(getSquare().getCoordinateX()+1, getSquare().getCoordinateY()-2));
       possibleSquares.add(new Square(getSquare().getCoordinateX()-1, getSquare().getCoordinateY()-2));

       possibleSquares.removeIf(square -> square.getCoordinateX() == 0 || square.getCoordinateY() == 0);

        return  possibleSquares;
    }
}
