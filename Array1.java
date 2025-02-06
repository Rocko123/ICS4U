/*
 * File name: Array1
 * Author: Rocky Shi
 * Date: February 6, 2025
 * Description: Complete the program outlined in L1 Array Exercises
 */


import java.io.*;
import java.util.*;
public class Array1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		
		int[] arr = new int[10];
		
		
		initializeArray(arr);
		enterFromKeyboard(arr);
		
		int selection = -1;
		do {
			System.out.println("Menu Options: ");
			System.out.println("1. Set all the values of the array to -1.");
			System.out.println("2. Enter values from keyboard into the array.");
			System.out.println("3. Count the number of whole numbers in the array.");
			System.out.println("4. Display the elements in the array in order.");
			System.out.println("5. Display the elements in the array in reverse order.");
			System.out.println("6. Find the sum of the elements in the array.");
			System.out.println("7. Find the average of the values in the array.");
			System.out.println("8. Find the maximum value in the array.");
			System.out.println("9. Find the minimum value in the array.");
			System.out.println("10. Search for a where an element exists in the array.");
			System.out.println("11. Sort the array.");
			System.out.println("12. Sort the array using an improved algorithm.");
			System.out.println("-1. Exit menu");
			
			selection = getInt("Enter your selection: ");
			
			switch (selection) {
			case 1: 
				initializeArray(arr);
				break;
			case 2:
				enterFromKeyboard(arr);
				break;
			case 3:
				countWhole(arr);
				break;
			case 4:
				display(arr);
				break;
			case 5:
				displayReverse(arr);
				break;
			case 6:
				int sum = sum(arr);
				System.out.println("The sum is: " + sum);
				break;
			case 7:
				double avg = average(arr);
				System.out.println("The average is: " + avg);
				break;
			case 8:
				findMax(arr);
				break;
			case 9:
				findMin(arr);
				break;
			case 10:
				int target = getInt("Enter the number would like to find the indicies of: ");
				search(arr, target);
				break;
			case 11:
				sort(arr);
				break;
			case 12:
				// improvedBubbleSort(arr);
				break;
			case -1:
				break;
			default:
				System.out.print("Invalid input, please try again.");
			}
		} while (selection != -1);
		
		System.out.print("You have exited the menu.");
		
		System.out.print("The sum of the array is: " +  sum(arr));
	}
	
	public static int getInt (String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Integer.parseInt(br.readLine());
			} catch (Exception e){
				System.out.println("Please enter an integer");
			}
		}
	}x
	
	public static void initializeArray(int[] array) {
		for (int i = 0; i < array.length; i++) array[i] = -1;
	}
	
	public static void enterFromKeyboard (int[] array) {
		System.out.println("Enter " + array.length + " numbers");
		for (int i = 0; i < array.length; i++) {
			array[i] = getInt("Enter the " + (i+1) + " number: ");
		}
	}
	
	public static void countWhole (int[] array) {
		int wholenums = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) wholenums++;
		}
		System.out.print("The number of whole numbers in the array is: " + wholenums);
	}
	
	
	public static void display (int[] array) {
		System.out.println("The integers in order entered is ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void displayReverse (int[] array) {
		System.out.println("The integers in reverse order is  ");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public  static int sum (int[] array) {
		int accumulator = 0;
		for (int i = 0; i < array.length; i++) {
			accumulator += array[i];
		}
		return accumulator;
	}
	
	public static double average (int[] array) {
		double avg = (double) sum(array)/array.length;
		return avg;
	}
	
	public static void findMax (int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.print("The max value in the array is: " + max);
	}
	
	public static void findMin (int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.print("The min value in the array is: " + min);
	}
	
	public static void search (int[] array, int target) {
		boolean found = false;
		System.out.print("The positions are: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				found = true;
				System.out.print(i + " ");
			}
		}
		if (!found) {
			System.out.println("-1. This element does not exist in the array.");
		} else {
			System.out.println();
		}
	}
	
	public static void sort (int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
