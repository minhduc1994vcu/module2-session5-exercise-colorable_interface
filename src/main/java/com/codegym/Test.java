package com.codegym;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("orange", true, 4);
        shapes[1] = new Square("blue", false, 5);
        shapes[2] = new Rectangle("black", false, 2, 3);
        System.out.println("begin \n");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("after \n");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                ((Square) shape).howToColor();
            }
        }

    }
}
