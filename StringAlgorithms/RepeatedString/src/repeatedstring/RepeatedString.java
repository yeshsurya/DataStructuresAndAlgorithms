package repeatedstring;

public class RepeatedString {

    public static void main(String[] args) {
        // TODO code application logic here
        String a = "aba";
        int count = 10 ; 
        long res = countInfinite(count ,a);
        System.out.println(res);
    }
    public static long countInfinite(int n ,String s ){
        long res = 0 ;
        char[] ch = s.toCharArray();
        long cl = ch.length;
        //Calculate A 
        long a =0 ;
        for(int i =0 ; i < cl ; i++){
            if(ch[i]=='a'){
                a++;
            }
        }
        
        //Calculate B
        long ln = n%cl;
        long p = n-ln;
        long A = (p/cl)*a;
        int k = 0 ;
        long b = 0 ;
        for( int i =0 ; i < ln ; i++){
            if(ch[k]=='a'){
                b++;
            }
            k++;
            if(k==cl){
                k=0;
            }
        }
        return (A+b);
    }
}
