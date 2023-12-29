package models;

import helpers.Calculation;
import interfaces.Shape;

import java.util.Arrays;
import java.util.List;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public List<Double> getSides() {
        return Arrays.asList(a, b, c);
    }

    @Override
    public double area() {
        return Calculation.heron(a, b, c);
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
