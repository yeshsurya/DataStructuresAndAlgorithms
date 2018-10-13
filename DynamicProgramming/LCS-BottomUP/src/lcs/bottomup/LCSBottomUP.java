/*f55
 */
package lcs.bottomup;
/**
 */
public class LCSBottomUP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String first = "AGGTAB";
        String second = "GXTXAYB";
        char[] x = first.toCharArray();
        char[] y = second.toCharArray();
        int m = x.length;
        int n = y.length;
        int L[][] = new int[m+1][n+1] ;
        for(int i =0 ; i <= m  ; i++){
            for(int j = 0 ; j <= n ; j++){
                if(i==0 || j == 0 ){
                    L[i][j]=0;
                }
                else if ( x[i-1]== y[j-1]){
                    L[i][j]= L[i-1][j-1]+1 ; 
                }
                else{
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
                }
            }
        }
        System.out.println(L[m][n]);
    }
    
}
