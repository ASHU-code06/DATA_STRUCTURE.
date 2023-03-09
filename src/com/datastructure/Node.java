package com.datastructure;

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
        }
        //below code appends the given node
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
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