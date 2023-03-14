package com.bstreedatastructure;

public class Main {
    public static void main(String[] args) {
        MyBinaryNode mbn = new MyBinaryNode();
        mbn.insert(56);
        mbn.insert(30);
        mbn.insert(70);
        mbn.insert(22);
        mbn.insert(40);
        mbn.insert(11);
        mbn.insert(3);
        mbn.insert(16);
        mbn.insert(60);
        mbn.insert(95);
        mbn.insert(65);
        mbn.insert(63);
        mbn.insert(67);
        System.out.println(mbn.root.left.value);
        System.out.println(mbn.root.right.value);
        System.out.println(mbn.root.left.left.left.left.value);
        System.out.println(mbn.root.right.left.right.right.value);
        System.out.println(mbn.root.right.left.right.left.value);

    }
}
