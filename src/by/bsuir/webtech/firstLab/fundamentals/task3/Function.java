package by.bsuir.webtech.firstLab.fundamentals.task3;

public class Function {

    public static void calculateTangent(double a, double b, double h) {
        String hString = Double.toString(h);
        int precision = hString.length() - hString.indexOf('.') - 1;
        String format = "| %." + precision + "f | " + "%." + precision + "f |\n";
        while (a <= b) {
            System.out.printf(format, a, Math.tan(a));
            a += h;
        }
    }
}
