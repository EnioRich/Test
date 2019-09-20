package com.evakule;

public class Trapezoid implements Shape {

    private double upperSide;
    private double lowerSide;
    private double leftSide;
    private double rightSide;
    private double area;
    private double height;
    private static String name = "Trapezoid";

    public Trapezoid(double upperSide, double lowerSide, double leftSide, double rightSide) {
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getUnique() {
        return "Height of Trapezoid = " + getHeight();
    }

    public double getHeight() {
        return this.height = Math.sqrt(Math.pow(rightSide, 2) - 0.25 * Math.pow((((Math.pow(leftSide, 2) - Math.pow(rightSide, 2))
                / (lowerSide - upperSide)) + lowerSide - upperSide), 2));
    }


    @Override
    public void draw() {
        System.out.println("Drawing Trapezoid . . .");
    }

    @Override
    public double getArea() {
        return this.area = ((upperSide + lowerSide) / 2 * getHeight());
    }

    @Override
    public String getColor() {
        return "Red";
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(double lowerSide) {
        this.lowerSide = lowerSide;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(double leftSide) {
        this.leftSide = leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public void setRightSide(double rightSide) {
        this.rightSide = rightSide;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "upperSide=" + upperSide +
                ", lowerSide=" + lowerSide +
                ", leftSide=" + leftSide +
                ", rightSide=" + rightSide +
                ", area=" + area +
                ", height=" + height +
                '}';
    }
}
