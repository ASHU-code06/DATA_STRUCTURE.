package com.bst;

public class Main {
    public static void main(String[] args) {
        MyBinaryNode mbn = new MyBinaryNode();
        mbn.insert(56);
        mbn.insert(30);
        mbn.insert(70);
        System.out.println(mbn.root.left.value);
    }
}