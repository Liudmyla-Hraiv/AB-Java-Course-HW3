package com.company.shapes;

public class Rectangle implements Shape{
    private double side1;
    private double side2;
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }



    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getSquare() {
        if ((side1 <= 0) ||(side2<=0)) {
            System.out.println("Incorrect sides value");
            return 0;
        } else
        return side1*side2;
    }

}
