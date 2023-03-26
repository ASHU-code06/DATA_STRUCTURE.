package com.datastructure.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] array) {
        for(int i = array.length-1; i > 0 ; i-- ){
           for(int j = 0 ; j < i ; j++){
               if(array[j] > array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp ;
               }
           }
        }
        System.out.println(Arrays.toString(array));//To aviod warning - Implicit call to 'toString()' on array 'array'
    }
    public static void main(String[] args) {
        int[] array = {89,90,33,1,56,2};
        bubblesort(array);
    }
}
