package firecode.io;

import java.util.Scanner;
import java.util.Random;

public class MatrixLogic {

	public static void main(String[] args) {
		System.out.println("Please enter the rows in the matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Please enter the columns in the matrix");
		int column = sc.nextInt();
		
		Random rd = new Random();

		int[][] first = new int[row][column];
		int[][] second = new int[row][column];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				first[r][c] = sc.nextInt();
			}
		}

//		for (int r = 0; r < row; r++) {
//			for (int c = 0; c < column; c++) {
//				System.out.println(String.format("Enter second[%d][%d] integer", r, c));
//				second[r] = sc.nextInt();
//			}
//		}

		// close the scanner
		sc.close();

		// print both matrices
		System.out.println("First Matrix:\n");
		print2dArray(first);
		flipVerticalAxisAxis(first);

//		System.out.println("Second Matrix:\n");
//		print2dArray(second);

		// sum of matrices
		//sum(first, second);
	}

	// below code doesn't take care of exceptions
//	private static void sum(int[][] first, int[][] second) {
//		int row = first.length;
//		int column = first[0].length;
//		int[][] sum = new int[row][column];
// 
//		for (int r = 0; r < row; r++) {
//			for (int c = 0; c < column; c++) {
//				sum[r] = first[r] + second[r];
//			}
//		}
//
//		System.out.println("\nSum of Matrices:\n");
//		print2dArray(sum);
//	}

	private static void print2dArray(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
		}
		System.out.println(matrix);
	}
	
	public static void flipVerticalAxisAxis(int[][] matrix) {
		
		int rows = matrix.length - 1, columns = matrix[0].length - 1;
		int temp = 0;

		for(int i = 0; i <= rows; i++) {
			for(int j = 0; j<= columns/2; j++) { //question 1
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][columns-j]; //question 2
				matrix[i][columns-j] = temp;
			}
		}
	}
}
