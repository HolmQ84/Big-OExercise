package com.company;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{17, 30, 653, 43, 62, 222, 87, 314, 132, 154, 67, 487, 275, 13, 71, 385};
        selectionSort(array);
    }

    static void selectionSort(int[] array) {
        int counter = 1;
        for (int i = 0;i<array.length-1;i++) {
            int current = i;
            for (int j = i+1;j<array.length;j++) {
                if (array[j] < array[current]) {
                    current = j;
                }
                System.out.println("Iteration nr. "+counter +": "+ Arrays.toString(array));
                counter++;
            }
            int temp = array[current];
            array[current] = array[i];
            array[i] = temp;
        }
        System.out.println("Færdig med sortering: "+Arrays.toString(array));
    }
}
