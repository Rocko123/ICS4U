// Author: Rocky
// File Name: TwoDArrayExitTicket
// Date: March 26, 2025
// Description: 2d array exit ticket

import java.io.*;
public class TwoDArrayExitTicket {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int ROW = 4;
		final int COL = 7;
		int myTable[][] = new int[ROW][COL];
		System.out.println("Enter 28 numbers to be printed row wise");
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print("Enter number " + (j+1) + " of " + COL + " in row " + (i+1) + " of " + ROW + " : ");
				myTable[i][j] = Integer.parseInt(br.readLine());
			}
		}
		printTable(myTable, ROW, COL);
		
		System.out.println("Enter 28 numbers to be printed column wise");
		for (int i = 0; i < COL; i++) {
			for (int j = 0; j < ROW; j++) {
				System.out.print("Enter number " + (j+1) + " of " + ROW + " in column " + (i+1) + " of " + COL + " : ");
				myTable[j][i] = Integer.parseInt(br.readLine());
			}
		}
		printTable(myTable, ROW, COL);
	}
	/**
	 * A void type method that prints out a 2d array
	 * @param table	The two array to be outputed.
	 * @param row	The number of rows of the table.
	 * @param col	The number of columns of the table.
	 */
	public static void printTable (int[][] table, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
}
