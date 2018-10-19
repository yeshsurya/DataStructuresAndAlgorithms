package arraycountvalleys;
import java.util.Scanner;
public class ArrayCountValleys {

    public static void main(String[] args) {
        // TODO code application logic here\
      //Scanner sc = new Scanner(System.in);
      int n = 8 ; 
      //char[] sc = {'U','D','D','D','U','D','U','U'};
      String s = "UDDDUDUU";
     // String s = ""
      int count = countingValleys(s); 
      System.out.println(count);
    }
    public static int countingValleys(String s){
        int count =0 ;
        char[] c = s.toCharArray();
        boolean up, down ; 
        up= false;
        int uc,dc; 
        uc=0 ; dc = 0 ;
        down = false;
        for(int i = 0 ;  i < c.length ; i++){
            if(!up && !down){
                if(c[i]=='U'){
                    up = true;  down = false;
                }
                else{
                    up = false; down = true ; 
                    count++;
                }
            }
            if(up){
                if(c[i]=='U'){
                    uc++;
                }
                else{
                    uc--;
                }
            }
            else{
                if(c[i]=='D'){
                    dc++;
                }
                else{
                    dc--;
                }
            }
            if(uc==0 && dc ==0 ){
                up = false ; down = false ;
            }
        }
        
        return count;
    }
    
}
