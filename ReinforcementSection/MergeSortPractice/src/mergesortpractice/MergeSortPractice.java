
package mergesortpractice;
import java.util.Scanner;
public class MergeSortPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i < n ;i++){
            arr[i] = scan.nextInt();
        }
         for(int i =0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println();
        for(int i =0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int[] arr,int i, int j){
        if(i < j){
            
            int k =i+(j-i)/2;
            mergeSort(arr,i,k);
            mergeSort(arr,k+1,j);
            merge(arr,i,k,j);
            
        }
    }
    public static void merge(int[] arr,int i,int k,int j){
        int lft = k-i+1;
        int rgt = j-k;
        int[] L = new int[lft];
        int[] R = new int[rgt];
        for(int p=0;p< lft;p++){
            L[p]=arr[i+p];
        }
        for(int p=0;p < rgt;p++){
            R[p]=arr[k+1+p];
        }
        int a=0,b=0,c=i;
        while( a < lft && b < rgt){
           if(L[a]<=R[b]){
               arr[c]=L[a];
               a++;
           }else{
               arr[c]=R[b];
               b++;
           }
           c++;
        }
        while(a < lft){
            arr[c]=L[a];
            c++;a++;
        }
        while(b < rgt){
            arr[c]=R[b];
            c++;b++;
        }
    }
 }
    
