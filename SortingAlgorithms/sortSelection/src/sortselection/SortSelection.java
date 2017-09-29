/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortselection;
import java.util.*;
/**
 * Strategy : Finding right side minimum and and swap with the present element.
 * @author PC
 */
public class SortSelection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
            ar[i]=scan.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            count++;
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[j]<ar[min])
                    min=j;
            }
            int temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;
            if(count==x)
                break;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]);
            System.out.print(" ");
        }
    }
    
}
