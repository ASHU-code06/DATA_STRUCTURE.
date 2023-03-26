package com.datastructure.algorithms;

public class InsertionSort {
    public void insertionSort(int[] array) {
        int temp ;
      for (int i = 1 ; i < array.length ; i++){
           temp = array[i];
           int j = i - 1;
           while(j > -1 && temp < array[j]){
             array[j+1] = array[j];
             array[j] = temp;
             j--;
           }
      }
      for(int print : array){
          System.out.println(print);
      }
    }
    public static void main(String[] args) {
        int a[] = new int[]{67,33,12,13,14};
        InsertionSort is = new InsertionSort();
        is.insertionSort(a);
    }
}
