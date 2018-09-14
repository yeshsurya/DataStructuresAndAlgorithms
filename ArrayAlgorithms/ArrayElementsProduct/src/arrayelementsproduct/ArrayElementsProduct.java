/*
 *Given an array of integers, return a new array such that each element at index i 
of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
Solutions : 1. Using left array and right array 
            2. Using log and antilog

 */
package arrayelementsproduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ynagaraj
 */
public class ArrayElementsProduct {

   
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
    public static void productArray(Integer arr[], int n)  
    { 
        // Initialize memory to all arrays 
        int left[] = new int[n]; 
        int right[] = new int[n]; 
        int prod[] = new int[n]; 
  
        int i, j; 
  
        /* Left most element of left array is always 1 */
        left[0] = 1; 
  
        /* Rightmost most element of right array is always 1 */
        right[n - 1] = 1; 
  
        /* Construct the left array */
        for (i = 1; i < n; i++) 
            left[i] = arr[i - 1] * left[i - 1]; 
  
        /* Construct the right array */
        for (j = n - 2; j >= 0; j--) 
            right[j] = arr[j + 1] * right[j + 1]; 
  
        /* Construct the product array using 
           left[] and right[] */
        for (i = 0; i < n; i++) 
            prod[i] = left[i] * right[i]; 
  
        /* print the constructed prod array */
        for (i = 0; i < n; i++) 
            System.out.print(prod[i] + " "); 
  
        return; 
    } 
    
}
