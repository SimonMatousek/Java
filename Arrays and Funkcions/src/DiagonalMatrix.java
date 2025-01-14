import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // Write a program that asks for an integer `size` from the standard input,
        // then it creates a two-dimensional array (of integers) of the specified
        // size (nxn) with the value of 1 on the main diagonal and the value of 0
        // everywhere else. Print the 2d array into the output
        //
        // Example:
        //
        // Please enter the array (matrix) size: 4
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the dimensions of the 2-d matrix :");
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        diagonalMatrix(matrix, size);
    }
    public static int[][] diagonalMatrix (int[][] arr, int size){
        for (int i = 0; i < size;i++){
            for (int j = 0; j < size; j++){
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] =0;
                }
            }
        }
        return arr;
    }
    public static void print (int[][] arr, int size){
        for (int i = 0; i < size;i++) {
            for (int j = 0; j < size; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
