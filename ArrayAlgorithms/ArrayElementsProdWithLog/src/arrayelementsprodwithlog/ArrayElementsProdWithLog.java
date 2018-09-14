/*
*Given an array of integers, return a new array such that each element at index i 
of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
Solutions : 1. Using left array and right array 
            2. Using log and antilog


---------------------------------------------------------
Use property of log to multiply large numbers
x = a * b * c * d
log(x) = log(a * b * c * d)
log(x) = log(a) + log(b) + log(c) + log(d)
x = antilog(log(a) + log(b) + log(c) + log(d))
 */
package arrayelementsprodwithlog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ynagaraj
 */
public class ArrayElementsProdWithLog {

    static final double EPS = 1e-9; 
    public static void main(String[] args) {
        System.out.println("Enter the lenght of array ");
        Scanner scanner = new Scanner(System.in);
        String length = scanner.next();
        int len = Integer.parseInt(length);
        List<Integer> ints = new ArrayList<Integer>(); 
        List<Integer> outs = new ArrayList<Integer>();
        
        for(int i=0;i<len;i++){
            ints.add(scanner.nextInt());
        }
        Integer[] ln = ints.toArray(new Integer[ints.size()]);
        productArray(ln,ln.length);
    }
    public static void productArray(Integer a[], int n)  
    { 
        // to hold sum of all values 
        double sum = 0;  
        for (int i = 0; i < n; i++) 
            sum += Math.log10(a[i]); 
  
        // output product for each index 
        // anti log to find original product value 
        for (int i = 0; i < n; i++) 
            System.out.print((int)(EPS + Math.pow(10.00, 
                          sum - Math.log10(a[i]))) + " ");  
  
        return; 
    } 
}
