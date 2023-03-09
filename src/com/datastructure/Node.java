package com.datastructure;

import java.util.Scanner;

public class Node {
    Object data;
    Node next;
    Node head ;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
    public void creation(){
        int d,n ;
        do{
            System.out.println("Enter data");
            Scanner input = new Scanner(System.in);
            d = input.nextInt();
            Node newNode = new Node(d);
            if(head==null){
                head = newNode;//if linked list is  empty then create first node to the linked list
            }else{
                newNode.next=head;//the address inside head is assigned to next of newNode
                head=newNode;//data inside newNode is assigned to head
            }
            System.out.println("Do you want to enter more data than press 1 else press 2 to exit");
            n = new Scanner(System.in).nextInt();
        }while (n==1);
    }
    public void traverse(){
        Node tempNode = head;//declaration and initialization a tempNode of type Node
        if(tempNode==null){
            System.out.println("Linked List does not exit");
        }else{
            System.out.println("Link list is ->");
            while(tempNode!=null){//LOOP WILL CONTINUE TILL newNode IS NOT NULL
                System.out.print(tempNode.data+"=>");//Printing data of linked list
                tempNode=tempNode.next;//moving tempNode across the linked list , till null is reached
            }
        }
        System.out.println("null");
    }
}