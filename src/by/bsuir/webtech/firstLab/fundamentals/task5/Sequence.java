package by.bsuir.webtech.firstLab.fundamentals.task5;

public class Sequence {

    public static int getMinCount(int[] numbers) {
        int count = 0;
        int max = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] <= max) {
                count++;
            } else {
                max = numbers[i + 1];
            }
        }
        return count;
    }
}
