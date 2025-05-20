// Author: Rocky Shi
// File Name: ReadFile
// Date: March 26, 2025
// Description: Sample program from slide 5 Reading Files lesson

import java.io.*;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) throws Exception{
		File file = new java.io.File("school.txt");
		Scanner input = new Scanner(file);
		String firstName;
		int avg = 0;
		while (input.hasNext()) {
			firstName = input.next();
			avg = input.nextInt();
			System.out.println(firstName + " " + avg);
		}
		input.close();
	}
}
