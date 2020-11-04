package firecode.io;

import java.util.Scanner;

public class MatrixFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Two dimentional matrix");
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		System.out.printf("Printing the matrix..", matrix);
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				matrix[r] = sc.nextInt();
			}
		}
		print2dArray(matrix);
	}
	
	private static void print2dArray(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r] + "\t");
			}
			System.out.println();
		}
	}
public static void flipHorizontalAxiz(int[][] matrix) {
	int[] temp = new int[matrix[0].length];
	for(int i=0; i<matrix.length -1; i++) {
		for(int j=matrix.length-1;j>0;j--) {
			temp = matrix[i];
			matrix[i] = matrix[j];
			matrix[j] = temp;
			i++;
		}
	}
	System.out.println(String.format("Printing the temp of matrix", matrix));
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
