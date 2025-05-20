/*
 * File Name: RecursionExercises
 * Author: Rocky Shi
 * Date: February 26, 2025
 * Description: Write the recursive exercises in Recursion Exercises
 */

import java.io.*;
public class RecursionExercises {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// Create an instance of the buffered reader
	public static void main(String[] args) throws IOException {
		int f = factInput("Please enter a positive integer from 0 to 20 to find its factorial: ");
		long fact = factorial(f);	// Call factorial function to get the factorial of the input f
		System.out.println(f + "! = " + fact);
		System.out.println();
		
		System.out.println("Please enter two integers to find their GCD");
		int a = readInt("Please enter the first integer: ");
		int b = readInt("Please enter the second integer: ");
		int g = gcd(a, b);	// Call GCD function to get the gcd of inputed integers an and b
		System.out.println("The GCD of " + a + " and " + b + " is " + g);
		System.out.println();
		
		
		System.out.println("Please enter a real base and an integer exponent to find the power");
		double base = readDouble("Please a real number base: ");
		int exp = readInt("Please enter an integer power: ");
		double dPower = pow(base, exp);	// Call the pow function to get the power for the input base and exponent
		System.out.println(base + " to the exponent " + exp + " is " + dPower);
		System.out.println();
	}
	/**
	 * A return-type method that returns integer input or re-prompts the user if invalid input is received.
	 * @param prompt The prompt to display to the user prior to taking input.
	 * @return		 The integer input by the user.
	 */
	public static int readInt(String prompt) {
		while (true) {	// Keep prompting user until integer input is received
			try {
				System.out.print(prompt);
				return Integer.parseInt(br.readLine());	// Try to cast user input as an integer and return it
			} catch (Exception e) {
				System.out.println("Please enter an integer!");	// Let the user know of invalid input
			}
		}
	}
	/**
	 * A return-type method that returns double input or re-prompts the user if invalid input is received.
	 * @param prompt The prompt to display to the user prior to taking input.
	 * @return		 The double input by the user.
	 */
	public static double readDouble(String prompt) {
		while (true) {	// Keep prompting user until double input is received
			try {
				System.out.print(prompt);
				return Double.parseDouble(br.readLine());	// Try to cast user input as a double and return it
			} catch (Exception e) {
				System.out.println("Please enter a real number!");	// Let the user know of invalid input
			}
		}
	}
	/**
	 * A return-type method that returns an integer input from 0 to 20 or re-prompts the user if invalid input is received.
	 * @param prompt The prompt to display to the user prior to taking input.
	 * @return		 The integer input from 0 to 20 from the user.
	 */
	public static int factInput(String prompt) {
		while (true) {	// Keep prompting user until valid integer input is received
			try {
				System.out.print(prompt);
				int n = Integer.parseInt(br.readLine());
				
				if (n < 0 || n > 20) {	// Re-prompt the user if the input is not between 0 and 20
					System.out.println("Please enter a valid factorial input from 0 to 20");
				} else {
					return n;	// Return the integer that is in the range
				}
			} catch (Exception e) {
				System.out.println("Please enter an integer!");	// Let the user know of invalid input
			}
		}
	}
	/**
	 * A return-type method that returns the factorial of a number.
	 * @param n The number to take the factorial of.
	 * @return	The factorial of the input.
	 */
	public static long factorial (int n) {
		if (n == 0) {	// Base case of 0! = 1
			return 1;
		} else {
			return n * factorial(n-1);	// Return the current number multiplies by the factorial of 1 less
			// Use recursion to reach the base case and build the answer
		}
	}
	/**
	 * A return-type function that finds the greatest common divisor of integers n and m.
	 * @param n	The first number to find the the GCD.
	 * @param m	The second number to find the GCD of.
	 * @return The GCD of n and m.
	 */
	public static int gcd (int n, int m) {
		if (n == m) {
			return n;	// Base case of GCD(n, n) = n
		} else if (n > m) {
			return gcd(m, n-m);	// If n is larger than m, remove m from n and find that GCD
		} else {
			return gcd(m, n); // If m is larger than n, swap m and n in the arguments and recall GCD on n and m
		}
		// Use recursion to reach the base case to return the answer
	}
	/**
	 * A return-type method that returns the power for a double base to an integer exponent.
	 * @param base	The real number base of the power.
	 * @param exp	The integer exponent to raise the base.
	 * @return		The power with specified base and exponent.
	 */
	public static double pow (double base, int exp) {
		if (exp < 0) {	// If the exponent is negative, make it positive and make the base its reciprocal
			exp *= -1;
			base = 1/base;
		}
		if (exp == 0) {
			return 1;	// Return base case of base^0 = 1
		}
		return base * pow(base, exp-1); // Return the base multiplied by the power to exponent-1
		// Use recursion to reach base case to build the answer
	}
	/*
	 * Problem 1: Find the nth term in the Fibonacci sequence
	 * Problem 2: Check if a string is a palindrome
	 * See sample code solutions below:
	 */
	
	/**
	 * A return-type method that returns nth value in the fibonacci sequence.
	 * @param n The term in the sequence you wish to determine.
	 * @return	The value of the nth term in the fibonacci sequence.
	 */
	public static int fib (int n) {
		if (n == 0) {
			return 0;	// Base case
		} else if (n == 1) {
			return 1;	// Base case
		} else {
			return fib(n-1) + fib(n-2);	// Recursive call
		}
	}
	/**
	 * A return-type method that determines whether a string is a palindrome.
	 * @param s The string you wish to check is a palindrome.
	 * @param l The left index of the string you wish to start at.
	 * @param r The right index of the string you wish to end at.
	 * @return	A boolean value whether the string is a palindrome.
	 */
	public static boolean isPalindrome(String s, int l, int r) {
		if (r <= l) {
			return true;	// Base case
		} else {
			return s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1);	// Recursive call
		}
	}
}
