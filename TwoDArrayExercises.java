// Author: Rocky Shi
// File Name: TwoDArrayExercises
// Date: March 27, 2025
// Description: Two Dimensional Array Exercises

import java.io.*;
import java.util.*;

public class TwoDArrayExercises {
	public static void main (String[] args) throws Exception {
		/*
		final int ROW = 3, COL = 4;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter 12 numbers");
		
		int[][] array = new int[ROW][COL];
		
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print("Enter number " + (j+1) + " of " + COL + " for the " + (i+1) + " row: ");
				array[i][j] = Integer.parseInt(br.readLine());
			}
		}
		*/
		
		File file1 = new java.io.File("Matrix1.txt");
		Scanner input = new Scanner(file1);
		
		final int ROW = input.nextInt();
		final int COL = input.nextInt();
		
		int[][] array = new int[ROW][COL];
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				array[i][j] = input.nextInt();
			}
		}
		input.close();
		
		File file2 = new java.io.File("StudentAvg.txt");
		Scanner input2 = new Scanner(file2);
		int r = input2.nextInt();
		int c = input2.nextInt();
		String[] students = new String[c];
		int[][] grades = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			students[i] = input2.next();
			for (int j = 0; j < c; j++) {
				grades[i][j] = input2.nextInt();
			}
		}
		input2.close();
		
		
		outputOriginal(array, ROW, COL);
		
		outputTransposed(array, ROW, COL);
		
		outputSum(array, ROW, COL);
		
		outputStudents(grades, students, r, c);
	}
	/**
	 * A void-type method that outputs a two dimensional array.
	 * @param array	The array to be outputted.
	 * @param row	The number of rows in the array.
	 * @param col	The number of columns in the array.
	 */
	public static void outputOriginal (int[][] array, int row, int col) {
		System.out.println("The original order of the array is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	/**
	 * A void-type method that outputs a two dimensional array in transposed order.
	 * @param array	The array to be outputted.
	 * @param row	The number of rows in the array.
	 * @param col	The number of columns in the array.
	 */
	public static void outputTransposed (int[][] array, int row, int col) {
		System.out.println("The transposed order ofthe array is");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
	}
	/**
	 * A void-type method that outputs a two dimensional array with row sum and column sum.
	 * @param array	The array to be outputted.
	 * @param row	The number of rows in the array.
	 * @param col	The number of columns in the array.
	 */
	public static void outputSum (int[][] array, int row, int col) {
		System.out.println("The array with row and column sum is");
		
		int[] colSum = new int[col];
		int rowSum;
		for (int i = 0; i < row; i++) {
			rowSum = 0;
			System.out.print("            ");
			for (int j = 0; j < col; j++) {
				rowSum += array[i][j];
				colSum[j] += array[i][j];
				System.out.print(array[i][j] + " ");
				if (j == col-1) {
					System.out.println("Row sum: " + rowSum);
				}
			}
		}
		System.out.print("Column sum ");
		for (int i = 0; i < col; i++) {
			System.out.print(colSum[i] + " ");
		}
		System.out.println();
	}
	/**
	 * A void-type method that outputs a students name, their marks, and their average.
	 * @param array	The two dimensional array to be outputted.
	 * @param names An array with the names of the students
	 * @param row	The number of rows in the array.
	 * @param col	The number of columns in the array.
	 */
	public static void outputStudents (int[][] array, String[] names, int row, int col) {
		System.out.println("Here is the school data base");
		double rowSum;
		for (int i = 0; i < row; i++) {
			rowSum = 0;
			System.out.print(names[i] + " ");
			for (int j = 0; j < col; j++) {
				rowSum += array[i][j];
				System.out.print(array[i][j] + " ");
				if (j == col-1) {
					System.out.println("	Student average: " + Math.round(rowSum*100.0/5)/100.0);
				}
			}
		}
		System.out.println();
	}
}
