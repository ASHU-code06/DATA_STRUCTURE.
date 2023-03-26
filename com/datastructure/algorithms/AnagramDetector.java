package com.datastructure.algorithms;
import java.util.Arrays;
public class AnagramDetector {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the strings have different lengths, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        // Compare sorted arrays
        return Arrays.equals(c1, c2);
        }

        public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
        String ss1 = "checked";
        String ss2 = "check";
        if (!areAnagrams(ss1, ss2)) {
            System.out.println(ss1 + " and " + ss2 + " are not anagrams.");
        } else {
            System.out.println(ss1 + " and " + ss2 + " are anagrams.");
        }
        }
    }


