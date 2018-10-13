/*
 Given two sequence find the longest common subsequence
 */
package longestcommonsubsequence;

/**
 *
 */
public class LongestCommonSubSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String first = "AGGTAB"; 
        String second = "GXTXAYB"; 
        char[] x = first.toCharArray();
        char[] y = second.toCharArray();
        int result = LCS(x,y,x.length,y.length);
        System.out.print(result);
        
        
    }
    public static int LCS(char[] x,char[] y,int m,int n){
        if(m==0 || n==0){
                return 0;
        }
        if(x[m-1]==y[n-1]){
            return 1+LCS(x,y,m-1,n-1);
        }
        else{
            return Math.max(LCS(x,y,m-1,n), LCS(x,y,m,n-1));
        }
    }
    
}
