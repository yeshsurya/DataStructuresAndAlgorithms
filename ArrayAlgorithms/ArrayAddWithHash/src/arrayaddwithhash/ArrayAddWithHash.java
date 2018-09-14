/*
 *#1.Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
 */
package arrayaddwithhash;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Hashtable;

/**
 *
 * @author ynagaraj
 */
public class ArrayAddWithHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the lenght of array ");
        Scanner scanner = new Scanner(System.in);
        String length = scanner.next();
        int len = Integer.parseInt(length);
        List<Integer> ints = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            ints.add(scanner.nextInt());
        }
        System.out.println("Enter the value of K");
        int k = scanner.nextInt();
        Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
        for( int itr : ints){
            if(ht.containsKey(k-itr))
            {
                System.out.println("Solution found !");
                break;
            }
            else{
               ht.put(itr,itr);
            }
        }
    }
    
}
