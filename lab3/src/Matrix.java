import java.util.Random;

public class Matrix {
    public static void createRandomMatrix(int[][] matrix) {
        Random generator = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = generator.nextInt(100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random generator = new Random();
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = generator.nextInt(100);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        if (matrix == null) {
            System.out.println("null");
        } else {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    System.out.printf("%7d", matrix[row][col]);
                }
                System.out.println();
            }
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%4f", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                int ele = 0;
                for (int pos = 0; pos < matrix1[0].length; pos++) {
                    ele += matrix1[row][pos] * matrix2[pos][col];
                }
                result[row][col] = ele;
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                double ele = 0.0;
                for (int pos = 0; pos < matrix1[0].length; pos++) {
                    ele += matrix1[row][pos] * matrix2[pos][col];
                }
                result[row][col] = ele;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = createRandomMatrix(3, 4);
        int[][] matrix2 = createRandomMatrix(3, 4);
        int[][] matrix3 = createRandomMatrix(4, 2);
        System.out.println("Matrix1");
        print(matrix1);
        System.out.println("Matrix2");
        print(matrix2);
        System.out.println("Matrix3");
        print(matrix3);
        int[][] matrixAdd12 = add(matrix1, matrix2);
        System.out.println("Matrix1 + Matrix2");
        print(matrixAdd12);
        int[][] matrixSub12 = subtract(matrix1, matrix2);
        System.out.println("Matrix1 - Matrix2");
        print(matrixSub12);
        int[][] matrixMul13 = multiply(matrix1, matrix3);
        System.out.println("Matrix1 * Matrix2");
        print(matrixMul13);
    }
}
