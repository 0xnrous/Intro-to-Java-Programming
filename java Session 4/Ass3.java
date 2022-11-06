import java.util.Scanner;

/*
(Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
/** Convert from Celsius to Fahrenheit**/
/*public static double celsiusToFahrenheit(double celsius)*/
/** Convert from Fahrenheit to Celsius */
/*public static double fahrenheitToCelsius(double fahrenheit)
        The formula for the conversion is:
        fahrenheit = (9.0 / 5) * celsius + 32
        celsius = (5.0 / 9) * (fahrenheit – 32)
*/
import java.util.Scanner;;

public class Ass3 {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter celsius double number ");
        double cel= input.nextDouble();
        System.out.println("Enter fahrenheit double number ");
        double fer= input.nextDouble();
        celsiusToFahrenheit(cel);
        fahrenheitToCelsius(fer);
        System.out.println(fahrenheitToCelsius(fer) + " and " + celsiusToFahrenheit(cel) );
    }
    public static double celsiusToFahrenheit(double cel){
        double fer;
        double x= 32;
        fahrenheitToCelsius(double fer);
        cel = (5.0 / 9) * (fer- x);

       System.out.println("Converted Number is : " + cel + "degree");
    }
    public static double fahrenheitToCelsius(double fer){
        double cel;
        celsiusToFahrenheit(double cel);
        fer = (9.0 / 5) * cel + 32;
        System.out.println("Converted Number is : " + fer + "degree");
    }
}
