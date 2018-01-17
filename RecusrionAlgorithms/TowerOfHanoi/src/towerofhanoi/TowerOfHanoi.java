
package towerofhanoi;
import java.util.*;
public class TowerOfHanoi {
    
    
    public static void main(String[] args) {
        TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
       System.out.print("Enter number of discs: ");
       Scanner scanner = new Scanner(System.in);
       int discs = scanner.nextInt();
       towersOfHanoi.solve(discs, "A", "B", "C");
    }
    public void solve(int n, String start, String auxiliary, String end) {
       if (n == 1) {
           System.out.println(start + " -> " + end); //Imagine one disc
       } else {
           solve(n - 1, start, end, auxiliary);
           System.out.println(start + " -> " + end); //Imagine two discs
           solve(n - 1, auxiliary, start, end);
       }
}
}


   
   
