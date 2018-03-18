/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist01;

/**
 *
 * @author ynagaraj
 */
public class LinkedList01 {

    Node head;  // head of list
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }
     public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        /* Start with the empty list. */
        LinkedList01 llist = new LinkedList01();
 
        llist.head  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
 
        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link second node with the third node
        llist.printList();
    }
   
}

