/*
 * File Name: TemperatureCalc
 * Author: Rocky Shi
 * Date: February 5, 2025
 * Description: Convert temperature in fahrenheit to celsius using methods
 */

 // random note: scanner buffer needs to be cleared after taking numeric input

import java.io.*;
public class TemperatureCalc {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// create an instance of the BufferedReader
    public static void main (String[] args) throws IOException {
        double f, c; // f = fahrenheit, c = celsius
        f = getDouble("Enter the degrees F: "); // get temperature in fahrenheit
        c = convertFtoC(f); // call convertFtoC method and set the returned value to c

        System.out.println("Degrees C: " + c);  // output the converted temperature
    }
    /**
     * Continually prompt the user for a numeric input
     * and returns it when the user enters a number.
     * @param prompt Prompt text before taking input.
     * @return      The double value inputed by the user.
     * 
     */
    public static double getDouble (String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(br.readLine());
            } catch (Exception e) { 
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }
    /**
     * Converts a temperature in degrees fahrenheit to a 
     * temperature in degrees celsius.
     * @param fahrenheit Temperature in degrees fahrenheit.
     * @return          The temperature in degrees celsius.
     * 
     */
    public static double convertFtoC (double fahrenheit) {
        double celsius;
        celsius = (fahrenheit-32) * 5/9;
        return celsius;
    }
}