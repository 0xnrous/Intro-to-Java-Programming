/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi
*/
import java.lang.Math;

public class Ex6 {
    public static void main(String[] args){

    double radius= 5.5;
    double pi=3.14;
    double perimeter= 2 * radius * pi;
    double Area =radius * radius * pi;

    System.out.println("Area of the circle is: " + Area );
    System.out.println("Perimeter of the circle is: " + perimeter);

    }
}
