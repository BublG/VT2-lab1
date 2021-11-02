package by.bsuir.webtech.firstLab.fundamentals.task4;

public class PrimeNumbers {

    public static void printPrimeNumbersIndexes(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean isPrime(int p) {
        if (p <= 1) return false;
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}
