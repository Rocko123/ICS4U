// Author: Rocky Shi
// File name: PrintWriterExample2
// Date: March 24, 2025
// Description: Example 2 slide 8 from file handling lesson
import java.io.*;
import java.util.*;

public class PrintWriterExample2 {
	public static void main (String[] args) throws Exception {
		Scanner myScanner = new Scanner(System.in);
		PrintWriter output = new PrintWriter("mysecretfile.txt");	// create file in the same directory
		output.println("hello");
		output.println("world!");
		System.out.println("Please enter your name");
		String name = myScanner.nextLine();
		output.println(name);
		
		myScanner.close();
		output.close();
	}
}