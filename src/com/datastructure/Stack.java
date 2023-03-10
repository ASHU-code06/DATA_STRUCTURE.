package com.datastructure;

public class Stack {
    public static void main(String[] args) {
        StackUsingLinkedList object = new StackUsingLinkedList();
        object.push(70);
        object.push(30);
        object.push(56);
        object.display();
        object.peek();
        object.pop();
        object.pop();
        object.pop();
        try{
            object.pop();
        }catch(Exception e){
            System.out.println("");
        }
    }
}
