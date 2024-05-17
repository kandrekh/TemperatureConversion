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
        // Call userChoice() method
        userChoice();
    }

    /**
     * Prompt user to get their input.
     */
    public static void userChoice() {
        Scanner input = new Scanner(System.in);
        double temperature;
        System.out.println("Convert to Celsius (1) | Convert to Kelvin (2)");

        System.out.print("Choose an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1: System.out.print("Enter temperature in Fahrenheit: ");
                     temperature = input.nextDouble();
                    System.out.println("Degree in Celsius: " + Converter.calcCelsius(temperature) + "°C");
                    break;
            case 2: System.out.print("Enter temperature in Fahrenheit: ");
                     temperature = input.nextDouble();
                    System.out.println("Degree in Kelvin: " + Converter.calcKelvin(temperature) + "K");
                    break;
            default: System.out.println("Invalid option");
            userChoice(); // calls function in order to prompt user everytime invalid input
        }
    }
}
