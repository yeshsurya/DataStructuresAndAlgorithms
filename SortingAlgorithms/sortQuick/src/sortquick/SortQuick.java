/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortquick;
import java.util.*;
/**
 *  Strategy : move elements with lesser value than pivot to left side and do it recursively.
 */
public class SortQuick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar= new int[n];
        for(int i=0;i<n;i++)
            ar[i]= scan.nextInt();
        quickSort(ar,0,n-1);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]);
            System.out.print(" ");
        }
    }
    public static void quickSort(int[] ar,int start, int end)
    {
        if(start<end)
        {
            int piv_pos= partition(ar,start,end);
            quickSort(ar,start,piv_pos-1);
            quickSort(ar,piv_pos+1,end);
            
        }
        
    }
    public static int partition(int[] ar,int start,int end)
    {
        int piv= ar[start];
        int j;
        int i=start+1;
        for(j=start+1;j<=end;j++)
        {
            if(ar[j]<piv)
            {
                int tem=ar[i];
                ar[i]=ar[j];
                ar[j]=tem;
                i++;
            }
        }
        int tm=ar[start];
        ar[start]=ar[i-1];
        ar[i-1]=tm;
        return i-1;
    }
   
}
