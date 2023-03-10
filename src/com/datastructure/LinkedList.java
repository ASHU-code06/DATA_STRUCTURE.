package com.datastructure;

public class LinkedList {
    public static void main(String[] args) {
        Node node = new Node();
        node.creation(56);//this is equal to add first
        node.append(70);
        node.traverse();
        node.addAtDesiredPos(30, 2);
        node.traverse();
        boolean checkNode;
        checkNode = node.search(30);
        checkNode = node.search(39);
        if (!checkNode) {
            System.out.println("\nLinked list does not have this node");
        }
        node.addAtDesiredPos(40,3);
        System.out.println("\nCase 9");
        node.delete(40);


    }
}
