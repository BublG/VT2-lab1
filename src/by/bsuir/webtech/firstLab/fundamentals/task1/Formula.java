package by.bsuir.webtech.firstLab.fundamentals.task1;

public class Formula {

    public static double calculate(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + Math.pow(x * y, 2)))) + x;
    }
}
