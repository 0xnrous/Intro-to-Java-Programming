/*
 * Write a program that converts pounds into kilograms, and displays the result. 
    One pound is 0.454 kilograms.
 */
import java.util.Scanner;

public class Ass1 {
    public static void main(String [] args){
        // Take the input from user 
        Scanner input = new Scanner (System.in);
        // Display message to user to tell him input number 
        System.out.println("Enter the number of pound u need to convert: "+ "\n ");
        Double pound =input.nextDouble();
       // convert equation we use  
        Double Kilogram= pound * .454;
        // finally Display the result one pound is .454 kilogram

        System.out.println("One pound is:  " +Kilogram + " Kg " );
         


    }
}
