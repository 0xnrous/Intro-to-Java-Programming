
/*
 * Write a program that take from user a Fahrenheit degree in double and convert it to Celsius and display it. Test with value  98.6  
          
	C° = (°F − °32) ÷ 1.8
 */
import java.util.Scanner;

public class EX2 {
    public static void main(String args[]) {
        // Scanner object to read user input
        Scanner input = new Scanner (System.in);
        double F;
        int L=32;
        // Take fahernheit number from user
        System.out.println("Enter The fahernheit Number:  ");
        F= input.nextDouble();
        // calculate the celsius
        Double C =(F- 32) / 1.8;
        // finally print and display the celcsius

        System.out.println("Celsius is equal: " +C );
    }
    
}
