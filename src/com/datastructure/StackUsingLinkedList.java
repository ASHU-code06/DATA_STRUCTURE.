package com.datastructure;

public class StackUsingLinkedList extends Node {
    Node top = null;
    void push(Object data){
        add(data);
    }
    void add(Object data){
        Node newNode = new Node(data);
        if (top==null){
            top=newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Pushed successfully");
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        top=top.next;
        System.out.println("Popped sucessfully");
        display();
    }
    void display(){
       Node tempNode = top;
       while(tempNode!=null){
           System.out.println(tempNode.data);
           tempNode = tempNode.next;
       }
    }

}
