/*
 * File Name: ArrayDemo1
 * Author: Rocky Shi
 * Date: February 5, 2025
 * Description: Array Demo1 exercise program
 */

import java.io.*;
import java.util.*;
public class ArrayDemo1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// create an instance of the BufferedReader
	public static void main (String[] args) throws IOException {
		int size = getNum("Enter the number of numbers you would like to store: ");	// call the getNum method to get the size of the array from the user
		
		int[] nums = new int[size];	// initialize an array nums of length size
		int sum = 0;	// accumulator for sum
		
		for (int i = 0; i < nums.length; i++) {	// for loop to ask the user for each number they want to store
			nums[i] = getNum("Enter the number to be stored: ");	// call the getNum method and store the returned number at index i
			sum += nums[i]; // increase the sum by the number entered
		}
		
		System.out.print("The numbers you entered were: ");
		for (int i = 0; i < nums.length; i++) {	// for loop to print out each element of the array
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println("The sum of the numbers is: " + sum); // output the sum
		
		int[] sorted = Arrays.copyOf(nums, nums.length);	// copy the nums array
		Arrays.sort(sorted);	// sort the new array in ascending order
		System.out.print("The numbers sorted in ascending order is: ");
		for (int i = 0; i < sorted.length; i++) {	// for loop to print out each element in the sorted array
			System.out.print(sorted[i] + " ");
		}
		System.out.println();
	}
	/**
	 * Prompts the user for an integer input and returns it.
	 * 
	 * @param prompt Prompt text displayed to user before taking input.
	 * @return 		 The integer entered by the user.
	 */
	public static int getNum (String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Integer.parseInt(br.readLine());
			} catch (Exception e){
				System.out.println("Please enter an integer");
			}
		}
	}
}
