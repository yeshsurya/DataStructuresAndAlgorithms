/*
 Given an array of integers, find the first missing positive integer in linear time and constant space.
In other words, find the lowest positive integer that does not exist in the array. 
The array can contain duplicates and negative numbers as well.
For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
You can modify the input array in-place.

 */
package arrayleastpositivemissing;
import java.util.*; 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLeastPositiveMissing {
    public static void main(String[] args) {
        System.out.println("Enter the lenght of array ");
        Scanner scanner = new Scanner(System.in);
        String length = scanner.next();
        int len = Integer.parseInt(length);
        List<Integer> ints = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
           ints.add(scanner.nextInt());
        }
        Collections.sort(ints);
        int ct=0;
        boolean done = false;
        for( int var :ints ){
           if(var<=0){
               continue;
           }
           else{
               ct++;
               if(ct==var){
                   continue;
               }
               else
               {
                   System.out.println(ct);
                   done = true;
                   break;
               }
           }
        }
        if(!done){
            System.out.println(++ct);
        }
    }
    
}
