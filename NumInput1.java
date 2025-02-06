/*
 * Author: Rocky
 * Date: Tuesday February 4, 2025
 * Description: Introduction
 */


import java.io.*;
import java.util.*;

public class NumInput1 {
    // Global variables - variables are accessible to all methods
    static int number;
    public static void main (String[] args) throws IOException {
        // Local to main
        String name, city;
        
        // Prompt the user to enter their name using Buffered Reader & store it in the variable name
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = myScanner.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ourMessage = "Welcome to Unionville High School";

        System.out.println("What city do you live in?");
        city = br.readLine();
        System.out.println("");
        System.out.println("Hello World!");
        System.out.println("The city you live in is: " + city);
        outputGreeting(name, ourMessage);
        myScanner.close();
    }

    public static void outputGreeting (String nameP, String message) {
        // Local to this method
        String city = "Toronto";
        // Message I want to output is: Welcome to Unionville High School <nameP>
        System.out.println(message + " " + nameP);
    }
    // The scope of a variable is the part of hte program over which the variable can be accessed or referenced
}