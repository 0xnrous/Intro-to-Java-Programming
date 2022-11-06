/*
 * Write a program that defines a method named printGrade
     and invokes it to print the grade for a given score.
 */

public class Ex3 {
     /*  public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(78.5);
        System.out.print("The grade is ");
      printGrade(59.5);
       }
       public static void printGrade(double score) {
        if (score >= 90.0) {
        System.out.println('A');
        } else if (score >= 80.0) {
        System.out.println('B');
        } else if (score >= 70.0) {
        System.out.println('C');
        } else if (score >= 60.0) {
        System.out.println('D');
        } else {
        System.out.println('F');
        } 
    }
}
*/

public static void main(String[] args) {
    System.out.println("The grade is " + getGrade(78.5));
    System.out.println("The grade is " + getGrade(59.5));
   }
   public static char getGrade(double score) {
    char grade;
    if (score >= 90.0) {
    grade = 'A';
    } else if (score >= 80.0) {
    grade = 'B';
    } else if (score >= 70.0) {
    grade = 'C';
    } else if (score >= 60.0) {
    grade = 'D';
    } else {
    grade = 'F';
    }
    return grade;
   }}