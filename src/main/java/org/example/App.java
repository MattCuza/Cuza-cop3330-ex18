/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Press C to convert from Fahrenheit to Celsius.\n" +
                            "Press F to convert from Celsius to Fahrenheit." );
        String choice = sc.nextLine();

        if(choice.equalsIgnoreCase("C")){
            System.out.println("Please enter the temperature in Fahrenheit:");
            double temp = sc.nextDouble();

            double C = (temp - 32) * 5/9;
            System.out.println("The temperature in Celsius is: " + C);

        }
        else{
            System.out.println("Please enter the temperature in Celsius:");
            double temp = sc.nextDouble();

            double F = (temp * 9 / 5) +32;
            System.out.println("The temperature in Celsius is: " + F);
        }
    }
}
