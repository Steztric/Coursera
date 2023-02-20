package com.javaoo.calculators;

public class CalculatorDriver {
    public static void main(String[] args) {
        ScientificCalculator sci = new ScientificCalculator();
        TrigonometricCalculator trig = new TrigonometricCalculator();

        System.out.println(sci.log(sci.exp(5)));
        System.out.println(trig.sine(Math.PI / 2));
    }
}
