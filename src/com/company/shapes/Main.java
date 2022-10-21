package com.company.shapes;

public class Main {

    public static void main(String[] args) {
        printCircle(new Circle(6));
        printRectangle(new Rectangle(2,3));
        printCircle(new Circle(9));
        printRectangle(new Rectangle(7,6));
        printCircle(new Circle(0));
        printRectangle(new Rectangle(12,0));

    }

    private static void printRectangle(Rectangle rectangle) {
        System.out.println("====================");
        System.out.println("Rectangle Shape: " + rectangle.getSquare());
        System.out.println("Side1: "+ rectangle.getSide1());
        System.out.println("Side2: "+ rectangle.getSide2());
        System.out.println("====================");
    }

    private static void printCircle(Circle circle) {
        System.out.println("====================");
        System.out.println("Circle Shape: " + circle.getSquare());
        System.out.println("Radius: "+ circle.getRadius());
        System.out.println("====================");
    }

}
