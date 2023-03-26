package com.datastructure.algorithms;

import java.util.Arrays;

public class MergeSortString {
    public static void main(String[] args) {
        String[] originalArray = {"red",  "blue", "yellow","green"};
        String[] sortedArray = mergeSort(originalArray);
        System.out.println("\nOriginal Array : " + Arrays.toString(originalArray));
        System.out.println("\nSorted Array : " + Arrays.toString(sortedArray));
    }
    public static String[] merge(String[] array1, String[] array2) {
        String[] combined = new String[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i].compareToIgnoreCase(array2[i]) < 0) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }

    public static String[] mergeSort(String[] array) {
        if (array.length == 1) return array;
        int midindex = array.length / 2;
        String[] left = mergeSort(Arrays.copyOfRange(array, 0, midindex));
        String[] right = mergeSort(Arrays.copyOfRange(array, midindex, array.length));
        return merge(left, right);
    }

}


