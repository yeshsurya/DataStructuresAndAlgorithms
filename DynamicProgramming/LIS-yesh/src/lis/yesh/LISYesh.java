/*
 */
package lis.yesh;
/**
 */
public class LISYesh {

    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
        int n = arr.length;
        int ref = arr[0];
        int res = 1 ; 
        for(int i =0 ; i< n ; i++){
           if( arr[i] > ref ){
               res++;
               ref = arr[i];
           }
        }
        System.out.println("result is : "+res);
    }
    
}
