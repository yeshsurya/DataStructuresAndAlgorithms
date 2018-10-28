
package arraybribeinque;

public class ArrayBribeInQue {

    public static void main(String[] args) {
        
        int[] q ={1,2,5,3,7,8,6,4};
        int count = 0;
        for(int i =0 ;i< q.length;i++){
            int k=i;
            while(k<q.length){
                k++;
                if(k==q.length){
                    break;
                }
                if(q[k]<q[i]){
                    count++;
                }
            }
            
        }
        System.out.println("Out : "+(count));
        
    }
    
}
