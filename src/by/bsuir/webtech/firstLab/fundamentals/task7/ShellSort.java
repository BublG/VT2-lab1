package by.bsuir.webtech.firstLab.fundamentals.task7;

public class ShellSort {

    public static double[] shellSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] > arr[i + 1]) {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return arr;
    }
}
