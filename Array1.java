/*
 * File name: Array1
 * Author: Rocky Shi
 * Date: February 6, 2025
 * Description: Complete the program outlined in L1 Array Exercises, explore the applications of arrays and methods
 */

import java.io.*;

public class Array1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// Instantiate BufferedReader in global scope
	public static void main (String[] args) {
		
		int[] nums = new int[10];	// Initialize an array to store 10 integers
		
		
		System.out.println("Welcome to L1 Array Exercises!\n");
		initializeArray(nums);		// Call the initalizeArray method to fill the array with -1
		enterFromKeyboard(nums);	// Call the enterFromKeyboard method to allow the user to fill the array
		
		int selection = -1;	// A variable for user selection in the menu
		do {
			// Display menu options 
			System.out.println();
			System.out.println("Menu Options: ");
			System.out.println("1. Set all the values of the array to -1.");
			System.out.println("2. Enter values from keyboard into the array.");
			System.out.println("3. Count the number of whole numbers in the array.");
			System.out.println("4. Display the elements in the array in the order they were entered.");
			System.out.println("5. Display the elements in the array in the reverse order they were entered.");
			System.out.println("6. Find the sum of the elements in the array.");
			System.out.println("7. Find the average of the values in the array.");
			System.out.println("8. Find the maximum value in the array.");
			System.out.println("9. Find the minimum value in the array.");
			System.out.println("10. Search for where an element exists in the array.");
			System.out.println("11. Sort the array using bubble sort.");
			System.out.println("12. Sort the array using improved bubble sort.");
			System.out.println("13. Sort the array using insertion sort.");
			System.out.println("14. Sort the array using selection sort.");
			System.out.println("-1. Exit menu");
			System.out.println();
			
			selection = getInt("Please enter your selection: ");	// Call the getInt method to get the user's selection
			System.out.println();
			
			switch (selection) {	// Switch case to call the appropriate methods based on user selection
			case 1: 
				initializeArray(nums);
				break;
			case 2:
				enterFromKeyboard(nums);
				break;
			case 3:
				countWhole(nums);
				break;
			case 4:
				display(nums);
				break;
			case 5:
				displayReverse(nums);
				break;
			case 6:
				int sum = sum(nums);
				System.out.println("The sum is: " + sum);
				break;
			case 7:
				double avg = average(nums);
				System.out.println("The average is: " + avg);
				break;
			case 8:
				findMax(nums);
				break;
			case 9:
				findMin(nums);
				break;
			case 10:
				// Call the getInt method to get the target value to be searched for in the array
				int target = getInt("Enter a value you would like to search for in the array: ");
				search(nums, target);
				break;
			case 11:
				sort(nums);
				break;
			case 12:
				improvedBubbleSort(nums);
				break;
			case 13:
				insertionSort(nums);
				break;
			case 14:
				selectionSort(nums);
				break;
				case -1:	// User chose to exit menu
				System.out.println("You have exited the menu. Have a nice day!");
				break;
			default:	// Catch invalid selection
				System.out.println("Invalid selection, please try again.");
			}
		} while (selection != -1); // While the user does not wish to exit, re-prompt the menu
	}
	/** 
	 * A return-type method that prompts the user for integer input. 
	 * Returns the integer value after receiving valid input.
	 * 
	 * @param prompt Prompt text displayed to the user prior to taking user input.
	 * @return 		 The integer value inputed by the user.
	 */
	public static int getInt (String prompt) {
		while (true) {	// Keep prompting the user until they enter valid input
			try {
				System.out.print(prompt);
				int n = Integer.parseInt(br.readLine());	// Try to parse user input as an integer
				return n; // Return the integer
			} catch (Exception e){
				System.out.println("Please enter an integer!"); // Catch the invalid input and warn the user
			}
		}
	}
	/**
	 * A void-type method that fills all the elements in the array with -1.
	 * 
	 * @param array The array to be filled with -1. The array is passed by
	 * reference and the changes are reflected in the scope the array was declared.
	 */
	public static void initializeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = -1; // Set the element at index i to -1
		}
		System.out.println("The array has been filled with -1.");
	}
	/**
	 * A void-type method that prompts the user to fill the array with integers. 
	 * 
	 * @param array The array whose elements will be changed to those entered by the user.
	 * The array is passed by reference and the changes are reflected in the scope the array was declared.
	 */
	public static void enterFromKeyboard (int[] array) {
		System.out.println("You will be prompted to enter " + array.length + " numbers into the array.");
		for (int i = 0; i < array.length; i++) {
			// Call the getInt method to get user input and store it at index i of the array
			array[i] = getInt("Please enter number " + (i+1) + " of " + array.length + ": ");
		}
		System.out.println("The array has been updated with the new values.");
	}
	/**
	 * A void-type method that counts the number of whole numbers in the array and prints it.
	 * 
	 * @param array The array to count the whole numbers of.
	 */
	public static void countWhole (int[] array) {
		int wholenums = 0;	// A counter for the number of whole numbers
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) { // Check if the number is greater than 0, then increment the counter
				wholenums++;
			}
		}
		System.out.println("The number of whole numbers in the array is: " + wholenums);
	}
	/**
	 * A void-type method that lists out the elements in the array in the order they were entered.
	 * 
	 * @param array The array whose elements will be displayed in order. 
	 */
	public static void display (int[] array) {
		System.out.print("The integers in order entered is ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();	// Print next line so new output will be on the line below
	}
	/**
	 * A void-type method that lists out the elements in the array in the reverse order they were entered.
	 * 
	 * @param array The array whose elements will be displayed in reverse order.
	 */
	public static void displayReverse (int[] array) {
		System.out.print("The integers in reverse order entered is ");
		for (int i = array.length-1; i >= 0; i--) { // Loop from index length-1 to 0 
			System.out.print(array[i] + " ");
		}
		System.out.println();	// Print next line so new output will be on the line below
	}
	/**
	 * A return-type method that calculates the sum of the elements in the array.
	 * 
	 * @param array The array whose elements will be summed.
	 * @return arraySum The sum of the elements in the array.
	 */
	public static int sum (int[] array) {
		int arraySum = 0;	// An accumulator variable to sum the elements in the array
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		return arraySum;
	}
	/**
	 * A return-type method that calculates the average of the elements in the array.
	 * 
	 * @param array The array whose elements will be used for an average.
	 * @return avg The average of the elements in the array.
	 */
	public static double average (int[] array) {
		double avg = (double) sum(array)/array.length; 
		// Call sum method to sum up the elements in the array then divide by the number of elements
		return avg;
	}
	/**
	 * A void-type method that finds the largest value in the array and outputs it.
	 * 
	 * @param array The array that will be searched for the largest value.
	 */
	public static void findMax (int[] array) {
		int max = array[0];	// Initially set the largest value to the first element in the array
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) { // Check if the current element is larger than max
				max = array[i]; // Reassign max to the current largest element
			}
		}
		System.out.println("The maximum value in the array is: " + max);
	}
	/**
	 * A void-type method that finds the smallest value in the array and outputs it.
	 * 
	 * @param array The array that will be searched for the smallest value.
	 */
	public static void findMin (int[] array) {
		int min = array[0];	// Initially set the smallest value to the first element in the array
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {	// Check if the current element is smaller than min
				min = array[i];	// Reassign min to the current smallest element
			}
		}
		System.out.println("The minimum value in the array is: " + min);
	}
	/**
	 * A void-type method that searches an array for a specified target element. This method prints all indices 
	 * where the target element appears in the array. This method will print -1 if the target does not exist in the array.
	 * 
	 * @param array The array to be searched for a target value.
	 * @param target The target value to be searched for in the array.
	 */
	public static void search (int[] array, int target) {
		boolean found = false;	// Boolean variable to check if target exists in array
		System.out.print("The number " + target + " is found in the following position(s): ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {	// Check if the element at index i is the target
				found = true;
				System.out.print(i + " "); // Output the index where target exists
			}
		}
		if (!found) {
			// If the target value was not found in the array print -1
			System.out.println("-1. This element does not exist in the array.");
		} else {
			// Print next line so new output will be on the line below
			System.out.println();
		}
	}
	/**
	 * A void-type method that sorts the array in the ascending order using bubble sort. 
	 * This method will print out the number of comparisons made by the algorithm.
	 * This method will not sort the array passed, but instead sort a copy of the original array.
	 * 
	 * @param array The array to be copied and sorted.
	 */
	public static void sort (int[] array) {
		// Copy the original array into a new array
		int[] sorted = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sorted[i] = array[i];
		}
		
		int temp;	// Variable to temporarily hold a value that will be swapped
		for (int i = 1; i < sorted.length; i++) {
			for (int j = 0; j < sorted.length-i; j++) {
				if (sorted[j] > sorted[j+1]) {	// If the current element is larger than the next, swap them
					temp = sorted[j];
					sorted[j] = sorted[j+1];
					sorted[j+1] = temp;
				}
			}
		}
		
		// Calculate the number of comparisons as (n)*(n-1)/2 where n is the length of the array
		int comparisons = sorted.length * (sorted.length-1)/2;
		System.out.println("A copy of your array is now sorted. There were " + comparisons + " comparisons made.");
		
		// Display the sorted array
		System.out.print("The sorted array is: ");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();	// Print next line so new output will be on the line below
	}
	
	/**
	 * A void-type method that sorts the array in the ascending order using improved bubble sort. 
	 * This method will print out the number of comparisons made by the algorithm.
	 * This method will not sort the array passed, but instead sort a copy of the original array.
	 * 
	 * @param array The array to be copied and sorted.
	 */
	public static void improvedBubbleSort (int[] array) {
		// Copy the original array into a new array
		int[] sorted = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sorted[i] = array[i];
		}
				
		boolean swap;	// A boolean variable to check if a swap has been made in the current pass
		// A counter to count the number of comparisons, a counter to count the number of passes, a variable to temporarily hold a value that will be swapped
		int comparisons = 0, i = 0, temp;
		do {
			swap = false;
			for (int j = 0; j < sorted.length-i-1; j++) {
				comparisons++;	// Increment the comparisons counter
				if (sorted[j] > sorted[j+1]) {	// If the current element is larger than the next, swap them
					temp = sorted[j];
					sorted[j] = sorted[j+1];
					sorted[j+1] = temp;
					swap = true;	// Mark swap as true
				}
			}
			i++;	// Increment passes
		} while (swap);	// Break out of the loop if no swap was made because the array is sorted
		
		System.out.println("A copy of your array is sorted using an improved bubble sort. There were " + comparisons + " comparisons made.");
		
		// Display the sorted array
		System.out.print("The sorted array is: ");
		for (int j = 0; j < sorted.length; j++) {	
			System.out.print(sorted[j] + " ");
		}
		System.out.println();	// Print next line so new output will be on the line below
	}
	/**
	 * A void-type method that sorts the array in the ascending order using insertion sort.
	 * This method will not sort the array passed, but instead sort a copy of the original array.
	 * 
	 * @param array The array to be copied and sorted.
	 */
	public static void insertionSort(int[] array) {
		// Copy the original array into a new array
		int[] sorted = new int[array.length];
			for (int i = 0; i < array.length; i++) {
				sorted[i] = array[i];
		}
		
		for (int i = 1; i < sorted.length; i++) {	// Start at index 1 since the array is sorted
			int j = i-1;	// Everything behind i is sorted
			int key = sorted[i]; 	// Maintain the key as the current element
			while (j >= 0 && sorted[j] > key) {	// Keep iterating through the sorted array while the index is greater than 0, and the element is greater than the key
				sorted[j+1] = sorted[j];	// Shift the current element to the right
				j--;	// Decrement j
			}
			sorted[j+1] = key;	// j will to 1 left of the correct position, increment j and insert the key
		}
		
		System.out.println("A copy of your array is sorted using insertion sort.");
		
		// Display the sorted array
		System.out.print("The sorted array is: ");
		for (int j = 0; j < sorted.length; j++) {	
			System.out.print(sorted[j] + " ");
		}
		System.out.println();	// Print next line so new output will be on the line below
	}
	/**
	 * A void-type method that sorts the array in the ascending order using selection sort.
	 * This method will not sort the array passed, but instead sort a copy of the original array.
	 * 
	 * @param array The array to be copied and sorted.
	 */
	public static void selectionSort(int[] array) {
		// Copy the original array into a new array
		int[] sorted = new int[array.length];
			for (int i = 0; i < array.length; i++) {
				sorted[i] = array[i];
		}
		
		int temp, minIndex;
		for (int i = 0; i < sorted.length-1; i++) {	// find the first n-1 smallest elements and place them in order
			minIndex = i;	// maintain where the smallest element is
			for (int j = i+1; j < sorted.length; j++) {	// loop over all elements with indices greater than i
				if (sorted[j] < sorted[minIndex]) {
					minIndex = j;	// maintain the element with smallest index beyond i
				}
			}
			temp = sorted[i];
			sorted[i] = sorted[minIndex];
			sorted[minIndex] = temp;
		}
		
		System.out.println("A copy of your array is sorted using selection sort.");
		
		// Display the sorted array
		System.out.print("The sorted array is: ");
		for (int j = 0; j < sorted.length; j++) {	
			System.out.print(sorted[j] + " ");
		}
		System.out.println();	// Print next line so new output will be on the line below
	}
	public static void quickSort(int [] array, int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			
			quickSort(array, low, pi-1);
			quickSort(array, pi+1, high);
		}
	}
	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int pi = low;
		
		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				swap(array, pi, j);
				pi++;
			}
		}
		return pi;
	}
	public static void swap (int[] array, int pi, int j) {
		int temp = array[pi];
		array[pi] = array[j];
		array[j] = temp;
	}
}
