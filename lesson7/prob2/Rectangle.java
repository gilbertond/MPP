package edu.mum.lesson7.prob2;

public class Rectangle implements Polygon {

    private double length, width;
    private final double[] sides;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        sides = new double[]{length, length, width, width};
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double[] getSides() {
        return (double[])this.sides.clone();
    }
}
