/*
  Write a program that uses a methods to compute 
    the sum of two digits in an integer or double format.
    (Using Method Overloading)
 */

public class Ex2 {
    public static void main(String[] args){
        System.out.println(sum(5,5));
        System.out.println(sum(5.5,4.5));

}
    public static int sum(int num1, int num2){
        return (num1+num2);
    }
    public static double sum (double num1, double num2){
        return (num1+num2);

    }
}
