package by.bsuir.webtech.firstLab.fundamentals.task2;

public class Figure {

    public static boolean isBelong(int x, int y) {
        if (y > 0 && y <= 5) {
            return x <= 4 && x >= -4;
        }
        if (y >= -3 && y <= 0) {
            return x <= 6 && x >= -6;
        }
        return false;
    }
}
