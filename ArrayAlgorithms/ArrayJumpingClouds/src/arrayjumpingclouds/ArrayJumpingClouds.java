package arrayjumpingclouds;

public class ArrayJumpingClouds {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] ar = {0,0,0,1,0,0};
        int count = jumpingClouds(6,ar);
        System.out.println(count);
    }
    public static int jumpingClouds(int n, int[] ar){
        int count = 0 ; 
        int k =0;
        int a = 0 ; int b =0 ; 
        while(k<n-1){
            a = k+2 ;
            b = k+1;
            
            if(ar[a]==1){
                k=b;
                count++;
            }
            else{
                k=a;
                count++;
            }
        }
        return count;
    }
}
