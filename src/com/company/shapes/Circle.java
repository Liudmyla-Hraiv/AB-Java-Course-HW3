package com.company.shapes;

public class Circle implements Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        if (radius <= 0) {
            System.out.println("Incorrect radius value");
            return 0 ;
        } else {

            return radius * radius * Math.PI;
        }
    }
}
