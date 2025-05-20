// Author: Rocky Shi
// File Name: SearchingExercises
// Date: March 24, 2025
// Description: Questions in the searching exercise document

import java.io.*;
import java.util.*;

public class SearchingExercises {
	public static void main(String[] args) throws IOException {
		final int MAX = 5;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		String[] names = new String[MAX], phoneNums = new String[MAX];
		System.out.println("Please enter the names and phone numbers of " + MAX + " people");
		for (int i = 0; i < MAX; i++) {
			System.out.print("Please enter name " + (i+1) + " of " + MAX + ": ");
			names[i] = br.readLine();
			System.out.print("Please enter phone number " + (i+1) + " of " + MAX + ": ");
			phoneNums[i] = br.readLine();
		}
		quickSort(names, phoneNums, 0, MAX-1);
		
		System.out.print("Enter a name to find their telephone number: ");
		String name = br.readLine();
		int idx = binarySearch(names, name, 0, MAX-1);
		if (idx == -1) {
			System.out.println("This person's phone number was not stored!");
		} else {
			System.out.println(name + "'s phone number is: " + phoneNums[idx]);
		}
		*/
		
		final int WORDCNT = 109583;
		File file = new java.io.File("wordlist.txt");
		Scanner input = new Scanner(file);
		
		String[] words = new String[WORDCNT];
		for (int i = 0; i < WORDCNT; i++) {
			words[i] = input.nextLine();
		}
		input.close();
		
		System.out.print("Enter a word to see if it exists in the list: ");
		String word = br.readLine();
		
		long start1 = System.nanoTime();
		boolean exists = binarySearchIter(words, word, 0, WORDCNT-1);
		long time1 = System.nanoTime()-start1;
		
		long start2 = System.nanoTime();
		binarySearchRecur(words, word, 0, WORDCNT-1);
		long time2 = System.nanoTime()-start2;
		
		
		if (exists) {
			System.out.println(word + " is in the list!");
		} else {
			System.out.println(word + " is not in the list!");
		}
		
		System.out.println("Iterative binary search takes " + (Math.round(time1/1e6*1000.00)/1000.00) + " ms");
		System.out.println("Recursive binary search takes " + (Math.round(time2/1e6*1000.00)/1000.00) + " ms");
		
		/*
		 * Iterative binary search takes 0.069 ms
		 * Recursive binary search takes 0.029 ms
		 * Observations: Recursive binary search is significantly faster than iterative binary search. 
		 */
	}
	/**
	 * A return-type iterative binary search method that returns a boolean whether a target string exists in an array of strings.
	 * @param words	The array of strings to be searched.
	 * @param target	The string to check if it exists in the array.
	 * @param low	The lower bound of the current search range.
	 * @param high	The upper bound of the current search range.
	 * @return	A boolean of whether the target string exists in the array of strings.
	 */
	public static boolean binarySearchIter(String[] words, String target, int low, int high) {
		while (low <= high) {
			int mid = (low+high)/2;
			if (words[mid].equals(target)) {
				return true;
			} else {
				if (words[mid].compareTo(target) < 0) {
					low = mid+1;
				} else {
					high = mid-1;
				}
			}
		}
		return false;
	}
	/**
	 * A return-type recursive binary search method that returns a boolean whether a target string exists in an array of strings.
	 * @param words	The array of strings to be searched.
	 * @param target	The string to check if it exists in the array.
	 * @param low	The lower bound of the current search range.
	 * @param high	The upper bound of the current search range.
	 * @return	A boolean of whether the target string exists in the array of strings.
	 */
	public static boolean binarySearchRecur(String[] words, String target, int low, int high) {
		if (low > high) {
			return false;
		} else {
			int mid = (low+high)/2;
			if (words[mid].equals(target)) {
				return true;
			} else {
				if (words[mid].compareTo(target) < 0) {
					return binarySearchRecur(words, target, mid+1, high);
				} else {
					return binarySearchRecur(words, target, low, mid-1);
				}
			}
		}
	}
	/**
	 * A return-type recursive binary search that returns the index of a target string in an array of strings.
	 * @param names	The array of names.
	 * @param target	The string to check if it exists in the array.
	 * @param low	The lower bound of the current search range.
	 * @param high	The upper bound of the current search range.
	 * @return	The index of the target element or -1 if it doesn't exist.
	 */
	public static int binarySearch(String[] names, String target, int low, int high) {
		if (low > high) {
			return -1;
		} else {
			int mid = (low+high)/2;
			if (names[mid].equals(target)) {
				return mid;
			} else if (names[mid].compareTo(target) < 0) {
				return binarySearch(names, target, mid+1, high);
			} else {
				return binarySearch(names, target, low, mid-1);
			}
		}
	}
	/**
	 * A void-type method that uses the quick sort algorithm to sort an array of names while maintaining each persons respective phone number.
	 * @param names	A string array that contains names.
	 * @param phoneNums	A string array that contains phone numbers.
	 * @param low	The lower bound in the current sorting range.
	 * @param high	The upper bound in the current sorting range.
	 */
	public static void quickSort(String[] names, String[] phoneNums, int low, int high) {
		if (low < high) {
			int pi = partition(names, phoneNums, low, high);
			quickSort(names, phoneNums, low, pi-1);
			quickSort(names, phoneNums, pi+1, high);
		}
	}
	public static int partition(String[] names, String[] phoneNums, int low, int high) {
		String pivot = names[high];
		int pi = low-1;
		
		String tempName, tempNum;
		for (int j = low; j < high; j++) {
			if (names[j].compareTo(pivot) < 0) {
				pi++;
				tempName = names[j];
				names[j] = names[pi];
				names[pi] = tempName;
				
				tempNum = phoneNums[j];
				phoneNums[j] = phoneNums[pi];
				phoneNums[pi] = tempNum;
			}
		}
		pi++;
		tempName = names[pi];
		names[pi] = names[high];
		names[high] = tempName;
		
		tempNum = phoneNums[pi];
		phoneNums[pi] = phoneNums[high];
		phoneNums[high] = tempNum;
		return pi;
	}
}
