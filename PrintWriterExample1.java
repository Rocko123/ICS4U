// Author: Rocky Shi
// File name: PrintWriterExample1
// Date: March 24, 2025
// Description: Example 1 slide 7 from file handling lesson

import java.io.*;
public class PrintWriterExample1 {
	public static void main (String[] args) throws Exception {
		PrintWriter output = new PrintWriter("Rocky_Shi_file.txt");	// create the file in same director
		output.println("My name is Rocky");	// print to the file
		output.println("I know how to write to a text file using Java.");
		output.close();	// commit/save the changes
	}
}
