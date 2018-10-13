/*
Using a function rand5() that returns an integer from 1 to 5 (inclusive) with uniform probability, 
implement a function rand7() that returns an integer from 1 to 7 (inclusive).
 */
package random7;

public class Random7 {

    public static void main(String[] args) {
        // TODO code application logic here
         int first, second; 
        for ( first=1; first<=5; ++first ) 
            for ( second=1; second<=5; ++second ) 
            System.out.printf ("%d \n", 5*first + second - 5); 
    }
    
}
