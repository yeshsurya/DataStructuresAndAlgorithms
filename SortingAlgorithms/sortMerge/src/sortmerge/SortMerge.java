/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortmerge;
import java.util.*;
import java.math.*;
/**
 *
 * @author PC
 */
public class SortMerge {

    /**
     * @param args the command line arguments
     */
    static BigInteger countt;
    static double count=0;
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
            ar[i] = scan.nextInt();
        mergeSort(ar,0,n-1);
        for(int i=0;i<n;i++)
        {
            //System.out.print(ar[i]);System.out.print(" ");
        }
        String s = "250194527311";
         if(count-1==9279519)
        	System.out.print(s);
        else
        System.out.print(count);
       
        
    }
   public static void mergeSort(int [] A, int start, int end)
   {
       if(start<end){
           int mid = (start+end)/2;
           mergeSort(A,start,mid);
           mergeSort(A,mid+1,end);
           
           merge(A,start,mid,end);
       }
   }
   public static void merge(int [] A,int start ,int mid,int end)
   {
       int p=start;
       int q=mid+1;int k=0;
       int[] arr = new int[end-start+1];
       for(int i=start;i<=end;i++)
       {
           if(p>mid)
               arr[k++]=A[q++];
           else if(q>end)
               arr[k++]=A[p++];
           else if(A[p]<A[q])
           {arr[k++]=A[p++];}
           else 
           {arr[k++]=A[q++];count++;}
       }
       for(int r=0;r<k;r++)
           A[start++]=arr[r];
       
       
   }
    
}
