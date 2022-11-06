/* 
(Sort three numbers) Write a method with the following header to display three numbers in increasing order: 
    public static void displaySortedNumbers( double num1, double num2, double num3)

 */


import java.util.Scanner;
public class Ass2{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double n1, n2 ,n3;
        System.out.println("Enter Three double numbers: ");
        n1=input.nextDouble();
        n2=input.nextDouble();
        n3=input.nextDouble();
        displaySortedNumbers(n1, n2 ,n3);
    }

    public static void displaySortedNumbers(double n1, double n2,double n3){

        double temp;
        if (n3>n2){
            temp=n2;
            n2=n3;
            n3=temp;
        }
        if (n2>n1){
            temp=n1;
            n1=n2;
            n2=temp;
        if (n3>n2){
            temp=n2;
            n2=n3;
            n3=temp;
        }
            System.out.println("Numbers in Increasing order: " + n3 + " , " + n2 + " , " + n1);
        }
    }
}