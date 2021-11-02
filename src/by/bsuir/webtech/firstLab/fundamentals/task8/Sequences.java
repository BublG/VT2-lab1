package by.bsuir.webtech.firstLab.fundamentals.task8;

public class Sequences {

    public static int[] getInsertionPlaces(double[] a, double[] b) {
        int aIndex = 0;
        int bIndex = 0;
        int offset = 0;
        int[] result = new int[b.length];
        int i = 0;
        while (aIndex < a.length && bIndex < b.length) {
            if (b[bIndex] < a[aIndex]) {
                result[i++] = aIndex + offset++;
                bIndex++;
            } else {
                aIndex++;
            }
        }
        while (bIndex < b.length) {
            result[i++] = a.length + offset++;
            bIndex++;
        }
        return result;
    }
}
