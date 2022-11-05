/*
 * Write a program that take from user the radius and length of a cylinder and computes its volume using the following formula. 
        
        area = radius * radius * PI
        Volume = area * Length 
 */

import java.util.Scanner;
import java.lang.Math;

public class Ex1 {
    public static void main(String args[]) {
        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // variables to store radius and length of cylinder
        double radius, length;

        // read radius from the user
        System.out.print("Enter radius of cylinder: ");
        radius = input.nextFloat();

        // read length from the user
        System.out.printf("Enter length of cylinder: ");
        length = input.nextDouble();

        // calculate area of cylinder
        double area = Math.PI * radius * radius; // area = PI * radius * radius
        // calculate volume of cylinder
        double volume = area * length; // volume = area * length

        // finally print area and volume of cylinder
        System.out.println("\nArea: " + area + "\nVolume: " + volume);
    }
}