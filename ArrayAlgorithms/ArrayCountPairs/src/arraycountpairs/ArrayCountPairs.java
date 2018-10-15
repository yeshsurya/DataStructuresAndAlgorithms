/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycountpairs;
import java.util.Scanner;
import java.util.*;
public class ArrayCountPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] ar = new int[n];
        for(int i =0 ; i < n ;i++){
            ar[i] = ip.nextInt();
        }
        Arrays.sort(ar);
        int count =0 ; 
        for(int i =0 ; i < n-1 ;i++){
            if(ar[i]==ar[i+1]){
                count++;
                ar[i]=-1;
                ar[i+1]=-1;
            }
        }
        System.out.println(count);
    }
    
}
