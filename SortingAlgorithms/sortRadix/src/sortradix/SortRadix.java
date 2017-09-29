/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortradix;
import java.util.*;
/**
 *
 * @author PC
 */
public class SortRadix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
            ar[i] = scan.nextInt();
        int k =0;
        for(int i=0;i<n;i++)
            k=Math.max(k, ar[i]);
        radixsort(ar,n,k);
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" "); 
        }
    }
    public static void countSort(int[] ar,int n,int place)
    {
        int i; 
        int[] freq = new int[10];
        for(int j=0;j<10;j++)
            freq[j]=0;
        int[] op = new int[n];
        for(i=0;i<n;i++)
        {
            freq[(ar[i]/place)%10]++;
        }
        for(i=1;i<10;i++)
            freq[i]+=freq[i-1];
        
        for( i=n-1;i>=0;i--)
        {
            op[freq[(ar[i]/place)%10]-1]=ar[i];
            freq[(ar[i]/place)%10]--;
        }
    }
    public static void radixsort(int[] arr,int n,int maxx)            //maxx is the maximum element in the array
{
        int mul=1;
        while(maxx!=0)
        {
                countSort(arr,n,mul);
                mul*=10;
                maxx/=10;
        }
}
}
