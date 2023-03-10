package com.datastructure;

public class Queue {
    public static void main(String[] args) {
        QueueUsingLinkedList ql = new QueueUsingLinkedList();
        ql.enqueue(56);
        ql.enqueue(30);
        ql.enqueue(70);
        ql.display();
    }
}
