package com.evakule;

public class Square implements Shape{

    private double side;
    private double area;
    private double perimeter;
    private static String name = "Square";

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double area, double perimeter) {
        this.side = side;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getUnique() {
        return "Square side = " + getSide();
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square . . .");
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
