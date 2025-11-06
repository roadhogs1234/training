package com.example;
import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

   
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

 
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(data));

        countingSort(data);

        System.out.println("Sorted array: " + Arrays.toString(data));

        int[] data2 = {9, 1, 5, 0, 7, 3, 2, 6, 8, 4};
        System.out.println("Original array 2: " + Arrays.toString(data2));
        countingSort(data2);
        System.out.println("Sorted array 2: " + Arrays.toString(data2));
    }
}