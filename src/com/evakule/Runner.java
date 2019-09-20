package com.evakule;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        int listSize = (int) (Math.random() * 100);
        List<Shape> shapeList = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            int random = (int) (Math.random() * 100);
            if (random > 0 & random < 25) {
                Shape shape = new Circle(random);
                shapeList.add(shape);
            }
            if (random > 25 & random < 50) {
                Shape shape = new Square(random);
                shapeList.add(shape);
            }
            if (random > 50 & random < 75) {
                Shape shape = new Trapezoid(random, random / 2, random + 2, random + 2);
                shapeList.add(shape);
            }
            if (random > 0 & random < 25) {
                Shape shape = new Triangle(random, random * 0.4);
                shapeList.add(shape);
            }
        }
        for(Shape shape : shapeList) {
            System.out.print("Shape Name: " + shape.getName() + ", ");
            System.out.print("Color: " + shape.getColor() + ", ");
            System.out.print("Area = " + shape.getArea() + ", ");
            System.out.println(shape.getUnique());

        }
    }
}
