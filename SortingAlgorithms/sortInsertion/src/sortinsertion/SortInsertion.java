/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortinsertion;
import java.util.*;
/**
 * Strategy : Finding left side minimum and replace it with the current element.
 * @author PC
 */
public class SortInsertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        int[] at = new int[n];
        for(int i=0;i<n;i++)
        { ar[i] = scan.nextInt();
          at[i]=ar[i];
        }
        for(int i=0;i<n;i++)
        {
            int temp=ar[i];
            int j=i;
            while(j>0 && temp<ar[j-1])
            {
                ar[j]=ar[j-1];
                j--;
            }
            ar[j]=temp;
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                if(at[i]==ar[j])
                {
                    System.out.print(j+1);
                    System.out.print(" ");
                }
            }
        
    }
    
}
