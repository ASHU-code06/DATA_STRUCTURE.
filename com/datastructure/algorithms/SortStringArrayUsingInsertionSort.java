package com.datastructure.algorithms;
 class SortStringArrayUsingInsertionSort {
    public static void main(String[] args) {
        String array[] = new String[]{"Delhi","Mumbai","Noida","goa"};
        int count = 0;
        String sortedArray[] = sort_sub(array , array.length);
        for(String i : sortedArray)
        {
            System.out.println(i);
        }
       }
     private static String[] sort_sub(String[] array, int f ){
         String temp="";
         for(int i=0;i<f;i++){
             for(int j=i+1;j<f;j++){
                 if(array[i].compareToIgnoreCase(array[j])>0){
                     temp = array[i];
                     array[i]=array[j];
                     array[j]=temp;
                 }
             }
         }
         return array;
     }
 }