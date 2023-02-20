package com.javaoo.calculators;

public class ScientificCalculator {
    public static final double PI = 3.14159;
    private double holdValue;
    public void putValueInMemory(double value) {
        this.holdValue = value;
    }
    public double getValueFromMemory() {
        return(holdValue);
    }
    public double exp(double x) {
        return(Math.pow(Math.E, x));
    }
    public double log(double x) {
        return(Math.log(x));
    }
}
