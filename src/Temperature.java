import java.util.Scanner;

/**
 *  Program: Temperature Class
 *  Date: March 17, 2024,
 *  Date Modified: May 13, 2024,

 *  Author: K-Andre Harris

 *  Course: CIT111-Z02 Intro to Prog: Java
 *  Spring 2024
 *  Programming Exercise 8 -Temperature Class Chapter 6
 *  Page 396-397
 */

public class Temperature {

    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get Fahrenheit from user
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        // Display the results from the calculations
        System.out.println("Degree in Celsius: " + Converter.calcCelsius(temperature) + "°C");
        System.out.println("Degree in Kelvin: " + Converter.calcKelvin(temperature) + "K");

    }
}
