/*
 * File Name: Triangle
 * Author: Rocky Shi
 * Date: February 7, 2025
 * Description: Triangle program from methods formative assessment
 */


import java.io.*;
public class Trinagle {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number between 1 and 9: ");
		int size = Integer.parseInt(br.readLine());
		triangle(size);
	}
	
	public static void triangle (int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
