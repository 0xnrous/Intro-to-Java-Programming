/*
 * Write a program that take the minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
        For simplicity, assume a year has 365 days
 */

 import java.util.Scanner;

public class Ass2 {
    public static void main  (String [] agrs){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter minutes u wanna to convert: ");
        Double minutes= input.nextDouble();
        Double Years= minutes / 525949.2 ;
        Double Days= minutes / 1440;
        System.out.println("Number of Years is: " + Years + " Numbers of days is: " + Days );

        


    }
}
