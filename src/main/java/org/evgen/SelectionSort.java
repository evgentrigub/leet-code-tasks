package org.evgen;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/sorting/694/comparison-based-sorts/4433/
public class SelectionSort {
    public static void run() {
        int[] numbers = {7, 3, 2, 5, 6, 10, 9, 8, 1};
        selectionSort(numbers);
    }

    public static void selectionSort(int[] arr) {
        // Mutates arr so that it is sorted via selecting the minimum element and
        // swapping it with the corresponding index
        int min_index;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("New Iteration");
            System.out.println("i: " + i);
            min_index = i;
            System.out.println("min_index: " + min_index);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("j: " + j);
                boolean change = arr[j] < arr[min_index];
                System.out.println("arr[j] " + arr[j]);
                System.out.println("arr[min_index] " + arr[min_index]);
                System.out.println("change min_index: " + change);
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                    System.out.println("min_index after change: " + min_index);
                    System.out.println("arr[min_index] " + arr[min_index]);
                }
            }
            // Swap current index with minimum element in rest of list
            System.out.println();
            System.out.println("Before swap");
            System.out.println("arr[min_index]: " + arr[min_index]);
            System.out.println("arr[i]: " + arr[i]);
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
            System.out.println("After swap");
            System.out.println(Arrays.toString(arr));
            System.out.println("--------------------------");
        }
        System.out.println("!!! FINAL RESULT !!!");
        System.out.println(Arrays.toString(arr));
    }
}
