package com.evakule;

public class Circle implements Shape{

    private double circumference;
    private double diameter;
    private double radius;
    private static String name = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double circumference, double diameter, double radius) {
        this.circumference = circumference;
        this.diameter = diameter;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getUnique() {
        return "Radius of circle = " + radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle . . .");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getColor() {
        return "Green";
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "circumference=" + circumference +
                ", diameter=" + diameter +
                ", radius=" + radius +
                '}';
    }
}
