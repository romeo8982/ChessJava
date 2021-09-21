package com.company;

public class Square {
    private int coordinateX,coordinateY;

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }
    public int getCoordinateX() {
        return coordinateX;
    }
    public int getCoordinateY() {
        return coordinateY;
    }

    public Square (int coordinateX, int coordinateY)
    {
        if(coordinateX>=1 && coordinateY<=8) {
            this.coordinateX = coordinateX;
            this.coordinateY = coordinateY;
        }
        else {
            System.out.println("Yous coordinates are not in range of <=1,8>=");
        }
    }
}
