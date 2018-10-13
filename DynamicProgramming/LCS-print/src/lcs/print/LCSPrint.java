/*
 */
package lcs.print;

/**
 *
 */
public class LCSPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String first = "AGGTAB";
        String second = "GXTXAYB";
        char[] x = first.toCharArray();
        char[] y = second.toCharArray();
        //char r[] = new char[Math.max(x.length,y.length)];
        //int ri=0;
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
        int i =  m ;int j =  n;
        int index = L[m][n];
        char[] res =  new char[index+1];
        while(i > 0 && j > 0){
            if(x[i-1]==y[j-1]){
               res[index-1]=x[i-1];
               index--;
               i--;
               j--;
            }
            else if(L[i-1][j] > L[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        System.out.println(res);
    }  
}
