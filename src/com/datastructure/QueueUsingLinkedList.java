package com.datastructure;

public class QueueUsingLinkedList extends Node {
    Node front = null;
    Node rear=null;
    void enqueue(Object data) {
        append(data);
    }
    void display() {
        Node temp = front;//pointer of type Node
        if (front == null) {
            System.out.println("This queue is empty");}
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    void append(Object data) {
        Node new_node = new Node(data);
        if (front == null) {
            front = new_node;
            rear = new_node;
        } else {
            rear.next=new_node;
            rear=new_node;
        }
    }

}
