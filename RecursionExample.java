/*
 * File Name: RecursionExample
 * Author: Rocky Shi
 * Date: February 25, 2025
 * Description: Write a factorial method iteratively
 */


import java.io.*;

public class RecursionExample {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.print("Please enter a positive integer to find its factorial: ");
		int n = Integer.parseInt(br.readLine());
		
		long factI = iterativeFactorial(n);
		long factR = recursiveFactorial(n);
		System.out.println(n + "! = " + factI + " using iterative method");
		System.out.println(n + "! = " + factR + " using recursive method");
	}
	/**
	 * A return-type method that calculates the factorial of a number using iteration.
	 * @param n The number to be taken the factorial of.
	 * @return val The factorial of the input.
	 */
	public static long iterativeFactorial (int n) {
		long val = 1;	// the accumulator for the factorial
		for (int i = 2; i <= n; i++) {
			val *= i;
		}
		return val;
	}
	/**
	 * A return-type method that calculates the factorial of a number using recursion.
	 * @param n The number to be taken the factorial of.
	 * @return	The factorial of the input.
	 */
	public static long recursiveFactorial(int n) {
		if (n == 1) {
			return 1;	// base case 
		} else {
			return n * recursiveFactorial(n-1);
		}
	}
}
