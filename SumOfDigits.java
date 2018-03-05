/** Program: Programming Exercise Week 2 Task 1
* File: SumOfDigits
* Summary: Collects a 5 Digit Number and Outputs the Sum of All Digits
* Author: Mitchell Andrews
* Date: March 04, 2018  **/

import java.util.Scanner;
    
public class SumOfDigits {

    public static void main(String[] args) {
        //Declare and Intialize All Variables
        int originalNumber = 0;
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourthDigit = 0;
        int fifthDigit = 0;
        int remainingDigits = 0;
        int sumOfDigits = 0;

        //Create New Scanner
        Scanner userData = new Scanner(System.in);
        
        //Ask for and Receive and positive 5 Digit Number
        System.out.print("Please Enter a five digit positive Number and press enter:");
        originalNumber = userData.nextInt();
        
        //Calculate the First through fifth digits along with the sum of Digits
        //5th Digit
        fifthDigit = originalNumber % 10;
        remainingDigits = originalNumber / 10;
        sumOfDigits += fifthDigit;
        
        //4th Digit
        fourthDigit = remainingDigits % 10;
        remainingDigits = remainingDigits / 10;
        sumOfDigits += fourthDigit;
        
        //3rd Digit
        thirdDigit = remainingDigits % 10;
        remainingDigits = remainingDigits / 10;
        sumOfDigits += thirdDigit;
        
        //2nd Digit
        secondDigit = remainingDigits % 10;
        remainingDigits = remainingDigits / 10;
        sumOfDigits += secondDigit;
        
        //1st Digit
        firstDigit = remainingDigits % 10;
        sumOfDigits += firstDigit;
        
        //Display the Results
        System.out.println("The sum of the digits is: " + firstDigit + " + " + secondDigit  + " + " + thirdDigit  + " + " + fourthDigit + " + " + fifthDigit  + " = " + sumOfDigits + ".");
    }
    
}
