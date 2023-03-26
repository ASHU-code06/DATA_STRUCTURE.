package com.datastructure.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutation {

    // Iterative method to find all permutations of a string
    public static List<String> permutationsIterative(String str) {
        List<String> result = new ArrayList<String>();
        result.add(Character.toString(str.charAt(0)));
        /*str.charAt(0) returns the first character of the input string str.
         Character.toString(char) returns a string representation of the char argument.
         In this case, it converts the first character of the input string, which is a char, into a String.
         result.add(String) adds the String representation of the first character of the input string to the result list.
         */
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            int size = result.size();
            for (int j = 0; j < size; j++) {
                String perm = result.remove(0);
                for (int k = 0; k <= perm.length(); k++) {
                    String newPerm = perm.substring(0, k) + c + perm.substring(k);
                    result.add(newPerm);
                }
            }
        }
        return result;
    }

    // Recursive method to find all permutations of a string
    public static List<String> permutationsRecursive(String str) {
        List<String> result = new ArrayList<String>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }
        char c = str.charAt(0);
        String remaining = str.substring(1);
        List<String> perms = permutationsRecursive(remaining);
        for (String perm : perms) {
            for (int i = 0; i <= perm.length(); i++) {
                String newPerm = perm.substring(0, i) + c + perm.substring(i);
                result.add(newPerm);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        // Test the iterative method
        String str = "abc";
        List<String> iterPerms = permutationsIterative(str);
        System.out.println("Iterative permutations of " + str + ": " + Arrays.toString(iterPerms.toArray()));

        // Test the recursive method
        List<String> recurPerms = permutationsRecursive(str);
        System.out.println("Recursive permutations of " + str + ": " + Arrays.toString(recurPerms.toArray()));

        // Compare the two lists to see if they are equal
        boolean isEqual = iterPerms.equals(recurPerms);
        System.out.println("The two lists are equal: " + isEqual);
    }
}

