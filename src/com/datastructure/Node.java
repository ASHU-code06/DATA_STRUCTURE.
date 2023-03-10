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
    public void addAtDesiredPos(int data, int position){
        Node new_node = new Node(data);
        Node tempNode=head;
        if (position==1){
            creation(data);
        }
        for (int i=1;i<(position-1);i++) {
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
    public void delete(int data){

      if(head==null){
          System.out.println("Linked list is empty");
      }
        System.out.println("\nThis is a deletion method  to delete any node");
        System.out.println("Enter 1 to delete from begining");
        System.out.println("Enter 2 to delete from end");
        System.out.println("Enter 3 to delete from desired position");
        int choice = new Scanner(System.in).nextInt();
        switch (choice){
            case 1:
                deletefirst();
                break;
            case 2:
                deleteLast();
                break;
            case 3:
                deleteAtDesiredPosition();
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    public boolean search(int data){
        Node searchNode = new Node(data);
        Node tempNode = head;//declaration and initialization a tempNode of type Node
        if(tempNode==null){
            System.out.println("Linked List does not exit");
        }else{
            while(tempNode!=null){//LOOP WILL CONTINUE TILL tempNode IS NOT NULL
             if(tempNode.data==searchNode.data) {
                 System.out.println("Yes linked has this node ");
                 System.out.print(tempNode.data + "=>");
                 return true;
             }
                tempNode=tempNode.next;//moving tempNode across the linked list , till null is reached
            }
        }
        return false;
    }
    public void deleteAtDesiredPosition(){
        Scanner input = new Scanner(System.in);
        int p=0;
        System.out.println("Enter position");
        p=input.nextInt();
        Node current_node=head;
        Node previous_node=current_node.next;
        for(int i=0;i<p-2;i++){
            current_node=previous_node;
            previous_node=previous_node.next;
        }
        current_node.next=previous_node.next;
    }
    public void deleteLast(){
        Node tempNode = head;//it is a temporary node that is equal to head
        Node pointerNode = tempNode.next;//it is a pointer node that points to next node address (has  address/next of temporary node)
        while(pointerNode.next!=null){
            tempNode=pointerNode;
            pointerNode=pointerNode.next;
        }
        tempNode.next=null;
        System.out.println("Deleted successfully, Final ");
        traverse();
    }

    public void deletefirst(){
        Node temporaryNode = head;
        temporaryNode=temporaryNode.next;
        head=temporaryNode;
        System.out.println("Deleted successfully, Final ");
        traverse();
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