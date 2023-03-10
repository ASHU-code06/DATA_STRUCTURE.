package com.datastructure;

public class LinkedList {
    public static void main(String[] args) {
    Node node = new Node();
    node.creation(56);
    node.append(70);
    node.traverse();
    node.addAtDesiredPos(30,2);
    node.traverse();
    node.deleteLast();
    boolean checkNode = node.search(39);
    if(!checkNode){
        System.out.println("Linked list does not have the node");
    }
    }
}
