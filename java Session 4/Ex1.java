/*
 *  // Invoke the max method with int parameters
      System.out.println("The maximum is"+ max(3, 4)); 
      // Invoke the max method with the double parameters
      System.out.println("The maximum is"+ max(3.0,5.4));
     

 */

public class Ex1{
    public static void main (String[] args){
    
    System.out.println(max(5,6));
    System.out.println(max(5.5,6.5));
    
    }

        public static  int max(int n1, int n2) 
        {
            if (n1 > n2 )
                return n1;
            else 
                return n2;
            
        }
        public static double max(double n1,double n2 )
        {
            if (n1 > n2)
                return n1;
            else 
                return n2;


        }
    }