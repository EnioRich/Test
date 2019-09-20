package com.evakule;

public class Triangle implements Shape{

    private static String name = "Triangle";
    private double firstCathet;
    private double secondCathet;
    private double hypotenuse;

    public Triangle(double firstCathet, double secondCathet) {
        this.firstCathet = firstCathet;
        this.secondCathet = secondCathet;
    }

    public Triangle(double firstCathet, double secondCathet, double hypotenuse) {
        this.firstCathet = firstCathet;
        this.secondCathet = secondCathet;
        this.hypotenuse = hypotenuse;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getUnique() {
        return "Hypotenuse of Triangle = " + getHypotenuse();
    }

    public double getFirstCathet() {
        return firstCathet;
    }

    public void setFirstCathet(double firstCathet) {
        this.firstCathet = firstCathet;
    }

    public double getSecondCathet() {
        return secondCathet;
    }

    public void setSecondCathet(double secondCathet) {
        this.secondCathet = secondCathet;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    private void calculateHypotenuse() {
        this.hypotenuse = Math.sqrt(Math.pow(firstCathet, 2) + Math.pow(secondCathet, 2));
    }

    @Override
    public void draw() {
        System.out.println("Drawing right triangle . . .");
    }

    @Override
    public double getArea() {
        calculateHypotenuse();
        return (firstCathet * secondCathet) / 2;
    }

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstCathet=" + firstCathet +
                ", secondCathet=" + secondCathet +
                ", hypotenuse=" + hypotenuse +
                '}';
    }
}
