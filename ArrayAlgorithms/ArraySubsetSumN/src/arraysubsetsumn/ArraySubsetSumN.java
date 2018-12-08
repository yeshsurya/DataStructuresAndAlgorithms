package arraysubsetsumn;
/*
Given a list of integers and a number K, return which contiguous elements of the list sum to K.
For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4].
*/
public class ArraySubsetSumN {
    public static void printArray(int[] arr, int i , int j){
        for(int k=i;k<=j;k++){
            System.out.print(arr[k]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={1,2,3,4,5};
        int n=5;
        int rsum=9;
        boolean foundSum=false;
        for(int len=1;len<=n;len++){
            int i=0;
            int j=n-len-1;
            for(int k=i;k<=j;k++){
                int tsum=0;
                for(int p=k;p<=k+len;p++){
                    //System.out.print(arr[p]);
                     tsum+=arr[p];
                    if(tsum==rsum){
                        foundSum=true;
                        printArray(arr,k,p);
                        System.out.println("");
                        //break;
                    }
                }
                if(foundSum){
                    //break;
                }
               // System.out.println("");
            }
            if(foundSum){
               // break;
            }
        }
        if(!foundSum){
            System.out.println("Required sum doesn't exists in the array");
        }
    }
    
}
