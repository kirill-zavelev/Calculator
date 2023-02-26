package by.calculator;

public interface ICalculator {

    int sum(int a, int b);

    int subtract(int a, int b);

    int multiply(int a, int b);

    double divide(int a, int b) throws ArithmeticException;

    double getTheRoot(int rootCoefficient, int b);

    double getTheRemainder(int a, int b);
}
