/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortcounting;
import java.util.*;
/**
 *
 * @author PC
 */
public class SortCounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] ar = new int[n+1];
        for(int i=1;i<=n;i++)
            ar[i] = scan.nextInt();
        int k=0;
        //Get maximum value in the given array
        for(int i=0;i<n;i++)
            k=Math.max(k, ar[i]);
        //Create auxilliary arry of size max+1
        int[] aux = new int[k+2];
        //Initialize aux array with zero
        for(int i=1;i<=k+1;i++)
            aux[i]=0;
        //Get the frequency
        for(int i=1;i<=n;i++)
            aux[ar[i]]++;
        for(int i=1;i<=k+1;i++)
        {
            if(aux[i]==0)
                continue;
            System.out.print(i); System.out.print(" ");System.out.println(aux[i]);
        }
    }
    
}
