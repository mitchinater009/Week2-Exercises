/** Program: Programming Exercise Week 2 Task 2
* File: ConvertingTemperatures
* Summary: Collects a temperature in Fahrenheit and Converts to Celius; Collects a temperature in Celsius and converts to Fahrenheit;
* Author: Mitchell Andrews
* Date: March 04, 2018  **/

import java.util.Scanner;
    
public class ConvertingTemperatures {

    public static void main(String[] args) {
        //Declare and Intialize All Variables
        double originalTemp = 0.0;
        double newTemp = 0.0;
        
        //Create New Scanner
        Scanner userData = new Scanner(System.in);
        
        //Ask for and Receive a temperature in Fahrenheit
        System.out.print("Enter a Farenheit temperature: ");
        originalTemp = userData.nextDouble();
        
        //Calculate and display Fahrenheit temperature in Celsius
        newTemp = (originalTemp - 32.0) * (5.0 / 9);
        System.out.println(originalTemp + "F is equivalent to: " + newTemp + "C.");
        
        //Ask for and Receive a temperature in Celsius
        System.out.print("Enter a Celisius temperature: ");
        originalTemp = userData.nextDouble();
        
        //Calculate and display Celisius temperature in Fahrenheit
        newTemp = (originalTemp) * (9.0 / 5) + 32;
        System.out.println(originalTemp + "C is equivalent to: " + newTemp + "F.");
    }
    
}
