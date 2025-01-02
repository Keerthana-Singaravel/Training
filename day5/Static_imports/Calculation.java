package Day5;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculation {
     public static void main(String [] args){
         double a=4.5;
         double b=3.8;
         double hypo = sqrt(pow(a, 2) + pow(b, 2));
         System.out.println("Hypotenuse of triangle : "+hypo);
     }
}
