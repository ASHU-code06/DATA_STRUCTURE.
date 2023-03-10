package com.datastructure;

public class LinkedList {
    public static void main(String[] args) {
    Node node = new Node();
    node.creation(56);
    node.append(70);
    node.traverse();
    node.addAtDesiredPos(30);
    node.traverse();
    node.deleteLast();
    }
}
