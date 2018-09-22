/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removekthelementoflinikedlist;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
public class RemoveKthElementOfLinikedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List names = new LinkedList();
	names.add("Rams");
	names.add("Posa");
	names.add("Chinni");
        names.add(2011);
	//System.out.println("Enter the lenght of array ");
        //Scanner scanner = new Scanner(System.in);
        //String length = scanner.next();
        //int len = Integer.parseInt(length);	
        int k =2 ; 
        Iterator i = names.iterator();
        while(k!=0 && i.hasNext()){
            k--;
            if(k==0){
                System.out.println(i.next());
            }
            i.next();
        }
	System.out.println("LinkedList content: " + names);
	System.out.println("LinkedList size: " + names.size());
    }
    
}
