package com.datastructure.algorithms;

import java.util.ArrayList;

public class PrimeInRange {
    ArrayList<Integer> arrayPrime = new ArrayList();

    public static void main(String[] args) {
        PrimeInRange primeInRange = new PrimeInRange();
        int[] array = new int[10001];
        for (int i = 0; i <= 1000; i++) {
            array[i] = i;
            primeInRange.prime(i);
        }
        System.out.println("prime numbers between 0 to 1000");
        System.out.print(primeInRange.arrayPrime);
        primeInRange.pallindrome(primeInRange.arrayPrime);
    }

    public void prime(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            printPrime(number);
        }
    }

    public void printPrime(int number) {
        arrayPrime.add(number);
    }

    public void pallindrome(ArrayList checkPrimePallindrome) {
        // Check each number in the ArrayList
        for (Object number : checkPrimePallindrome) {

            // Convert the number to a string
            String numberStr = Integer.toString((Integer) number);

            /*StringBuilder(numberStr).reverse().toString() takes the input string numberStr, creates a StringBuilder object with that string,
            reverses the order of its characters using the reverse() method, and then converts it back to a String using the toString() method.
            This results in a new string called reversedNumberStr that contains the reversed version of the original number string.
            We are using this reversed string to check if the original string is a palindrome
            */
            String reversedNumberStr = new StringBuilder(numberStr).reverse().toString();//Reverse the string

            // Check if the reversed string is equal to the original string
            if (numberStr.equals(reversedNumberStr)) {
                System.out.println(number + " is a Prime and palindrome.");
            }
        }
    }
}
