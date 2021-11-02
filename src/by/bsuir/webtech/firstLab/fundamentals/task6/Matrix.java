package by.bsuir.webtech.firstLab.fundamentals.task6;

public class Matrix {

    public static int[][] getMatrix(int... a) {
        int dimension = a.length;
        int[][] matrix = new int[dimension][dimension];
        int border = 0;
        for (int i = 0; i < dimension; i++) {
            int j = 0;
            int r = border;
            while (r < dimension) {
                matrix[i][j++] = a[r++];
            }
            int l = 0;
            while (l < border) {
                matrix[i][j++] = a[l++];
            }
            border++;
        }
        return matrix;
    }
}
