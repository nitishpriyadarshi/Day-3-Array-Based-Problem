package com.bridgelab;

public class PresentOnAnEvenPosition {
    public static void main(String[] args) {


        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };// declaration and initialization of array.

        for (int i = 1; i < arr.length; i = i + 2) { // iterating through the array using for loop

            System.out.println(arr[i]);  // print element to the console

        }

    }
}
