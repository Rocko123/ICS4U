/*
 * File name: L3Array
 * Author: Rocky Shi
 * Date: February 12, 2025
 * Description: L3 Array Processing - Random Numbers and No Duplicates
 */

 import java.io.*;

 public class L3Array {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// create an instance of the BufferedReader in the global scope
     public static void main (String[] args) {
         System.out.println("Welcome to L3 Array Processing!\n");
         
         noDuplicates();			// Call noDuplicates method to ask the user to enter 6 unique integers
         System.out.println();
         randomNoDuplicates();	// Call randomNoDuplicates method to generate 10 unique random integers
         
         System.out.println("Thank you for using L3 Array Processing. Have a nice day!");
     }
     
     /**
      * This return-type method prompts the user for integer input and returns it.
      * @param prompt The prompt text displayed to the user prior to taking integer input.
      */
     public static int getInt(String prompt) {
         while (true) {
             try {
                 System.out.print(prompt);
                 int n = Integer.parseInt(br.readLine());
                 return n;
             } catch (Exception e) {
                 System.out.println("Please enter an integer!");
             }
         }
     }
     /**
      * A void-type method that prompts the user for 6 unique integers. If the integer already exists in the array
      * the user will be re-prompted to enter a unique value.
      */
     public static void noDuplicates () {
         final int MAX = 6;
         int[] array = new int[MAX];	// declare an array to store 6 integers
         
         boolean isDuplicate;	// Boolean variable to check if the current element is a duplicate of what's already in the array
         System.out.println("Please enter " + MAX + " unique integers.");
         for (int i = 0; i < MAX; i++) {
             do {
                 isDuplicate = false;
                 int n = getInt("Please enter number " + (i+1) + " of " + MAX + ": ");	// Call the getInt method to get the next integer from the user
                 for (int j = 0; j < i; j++) {	// Loop over all previously entered elements, check if the current number is the same as any of them
                     if (array[j] == n) {
                         isDuplicate = true;	// If a match in the array is found, the current number must be a duplicate
                     }
                 }
                 if (isDuplicate) {
                     System.out.println(n + " has been entered previously. Please re-enter a unique number.");	// Warn the user this element already exists
                 } else {
                     array[i] = n;	// Set the element at index i to n in the array
                 }
             } while (isDuplicate);	// Re-prompt the user until they do not enter a duplicate value
         }
         
         // Output the unique integers
         System.out.println("You have successfully entered " + MAX + " numbers.");
         System.out.print("The numbers you entered were: ");
         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
         }
         System.out.println();	// clear output to next line
     }
     /**
      * A void-type method that outputs 10 unique random integers that fall within the range of 1 to 100 inclusive.
      */
     public static void randomNoDuplicates() {
         final int MAX = 10;
         int[] array = new int[MAX];	// Declare an array to store 10 integers
         
         boolean[] isUsed = new boolean[101];	// A boolean array to maintain if a number has been used from 1 to 100
         boolean isDuplicate;	// A boolean variable to determine if the value generated is unique
         
         System.out.println(MAX + " unique random numbers will be generated.");
         for (int i = 0; i < MAX; i++) {
             isDuplicate = false;
             do {
                 int randNum = (int) (Math.random()*100)+1;	// Generate a random number from 1 to 100 inclusive
                 if (isUsed[randNum]) {
                     isDuplicate = true;
                 } else {
                     array[i] = randNum;
                     isUsed[randNum] = true;
                     isDuplicate = false;
                 }
             } while (isDuplicate);
         }
         
         // Output the unique random integers
         System.out.print("The numbers are: ");
         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
         }
         System.out.println();
     }
 }
 