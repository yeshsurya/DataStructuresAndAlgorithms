/*
 *1.Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?

 */

package arrayaddupto;
import java.util.*;
/**
 *
 * @author ynagaraj
 */
public class ArrayAddUpTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the lenght of array ");
        Scanner scanner = new Scanner(System.in);
        String length = scanner.next();
        int len = Integer.parseInt(length);
        List<Integer> ints = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            ints.add(scanner.nextInt());
        }
        System.out.println("Enter the value of K");
        int k = scanner.nextInt();
        Collections.sort(ints);
        int i=len-1,j=0;
        int tres=0;
        while(j<i){
            if(ints.get(i)+ints.get(j)>k){
                i--;
            }
            else if(ints.get(i)+ints.get(j)<k){
                j++;
            }
            else{
                //Printing the result
                System.out.println("The result is : ");
                System.out.println(ints.get(i));
                System.out.println(ints.get(j));
                break;
            }
        }
        
}
}