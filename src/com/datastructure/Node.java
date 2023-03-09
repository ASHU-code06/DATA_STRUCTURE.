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
    public void creation(int d){
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            System.out.println("First node is "+newNode.data);
            return;
        }else{
            //code to add a node at first
            newNode.next=head;//the address inside head is assigned to next of newNode
            head=newNode;//data inside newNode is assigned to head
        }
    }
    public void append( int d){
        Node newNode = new Node(d);
        //below code appends the given node(or add node at last)
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }
    public void addAtDesiredPos(int data){
        System.out.println("In above linked list , Enter the position at which node is to be inserted");
        int p;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        Node new_node = new Node(data);
        Node tempNode=head;
        if (p==1){
            creation(data);
        }
        for (int i=1;i<(p-1);i++) {
            if(tempNode==null){
                System.out.println(" null");
            }
            else{
                tempNode = tempNode.next;
            }
        }
        new_node.next = tempNode.next;
        tempNode.next = new_node;
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