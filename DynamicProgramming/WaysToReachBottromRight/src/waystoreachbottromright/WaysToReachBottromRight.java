/*
PROBLEM : 
There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner. 
You can only move right or down.
 */

package waystoreachbottromright;
import java.util.Scanner;
public class WaysToReachBottromRight {
    static int sum=0;
  /*Recursive version  
    public static int reachBottomLeft(int n,int m){
        if(n==1|| m==1){
            return 1;
        }
        return reachBottomLeft(n-1,m)+reachBottomLeft(n,m-1);
    }*/
    /* DP with space optimized
     static int numberOfPaths(int m, int n) 
    { 
        // Create a 1D array to store results of subproblems 
        int[] dp = new int[n]; 
        dp[0] = 1; 
  
        for (int i = 0; i < m; i++) { 
          for (int j = 1; j < n; j++) { 
            dp[j] += dp[j - 1]; 
          } 
        } 
  
        return dp[n - 1]; 
    } 
    */
     public static int reachBottomLeft(int n,int m){
        int[][] t= new int[n][m];
       for(int i=0;i<n;i++)
           for(int j=0;j<m;j++){
               if(i==0 || j==0){
                   t[i][j]=1;
               }
               else{
                t[i][j]=t[i-1][j]+t[i][j-1];
               }
               
           }
       return t[n-1][m-1];
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int res = reachBottomLeft(n,m);
        System.out.println(res);
    }   
}
