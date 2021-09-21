package com.company;

import java.util.ArrayList;

public abstract  class Figure {

    private boolean colorPiece; //0 => black, 1 => white

    private String pieceName;
    private Square square;

    public void setSquare(Square square) {
        this.square = square;
    }

    public Square getSquare() {
        return square;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        if(pieceName.equals("Rook")||pieceName.equals("Knight")||pieceName.equals("Bishop")||pieceName.equals("Queen")||pieceName.equals("King")||pieceName.equals("Pawn"))
            this.pieceName = pieceName;
        else
            System.out.println("You create, piece which is not allowed");
    }

    public void setColorPiece(boolean colorPiece) {
        this.colorPiece = colorPiece;
    }
    public boolean isColorPiece() {
        return colorPiece;
    }
    public abstract ArrayList<Square> possibleMove();

}
