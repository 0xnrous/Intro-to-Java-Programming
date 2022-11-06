/*
 * Write a program that implement method named isPalindrome
     to determine if the integer is palindrome or not, 
     then prompt the user to enter an integer and reports
      whether the integer is a palindrome.
 */
import java.util.Scanner;
public class Ass1 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x=input.nextInt();
        // finally print palindrome
        System.out.println(x + (isPalindrome(x) ? " is " : " is not ") +
			"a palindrome.");
    }
    public static boolean isPalindrome(int x){
        return x == reverse(x) ? true : false;

    }
    public static int reverse(int x){
        int  reverse=0;
        int  lastDigit; 
        while (x>0){
            lastDigit = x % 10;
            reverse= reverse*10 +lastDigit;
            x=x/10;
        }
        return reverse;
    }
}

