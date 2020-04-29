package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = new int[]{17, 30, 653, 43, 62, 222, 87, 314, 132, 154, 67, 487, 275, 13, 71, 385};
        // int result = binarySearch(array, 254);
        // System.out.println("Search for: "+result);
        bubbleSort(array);
        // bubbleSortWithoutBreak(array);
    }

    static void bubbleSort(int[] array) {
        boolean byt = true;
        int count = 0;
        while (true) {
            byt = false;
            for (int i = 0;i<array.length-1;i++) {
                if (array[i+1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    byt = true;
                }
                count++;
                System.out.println("Iteration nr. "+count +": "+ Arrays.toString(array));
            }
            if (!byt) {
                System.out.println("Ingen byt - stopper...");
                break;
            }
        }
        System.out.println("Sortering færdig: "+Arrays.toString(array));
    }

    static void bubbleSortWithoutBreak(int[] array) {
        int count = 0;
        for (int i = 0;i<array.length;i++) {
            for (int j = 0;j<array.length;j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                count++;
                System.out.println("Iteration nr. "+count+": "+Arrays.toString(array));
            }
        }
        System.out.println("Sortering færdig: "+Arrays.toString(array));
    }
}
