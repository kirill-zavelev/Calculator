package by.calculator;

public class Calculator implements ICalculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        return (double) a / b;
    }

    @Override
    public double getTheRoot(int a, int rootCoefficient) {
        return Math.pow(a, rootCoefficient);
    }

    @Override
    public double getTheRemainder(int a, int b) {
        return a % b;
    }
}
