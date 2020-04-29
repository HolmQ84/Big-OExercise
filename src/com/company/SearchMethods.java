package com.company;

import java.util.Arrays;

public class SearchMethods {

    public static void main(String[] args) {
        int[] array1 = new int[]{17, 30, 653, 43, 62, 222, 87, 314, 132, 154, 67, 487, 275, 13, 71, 385};           // Assorteret liste.
        int[] array2 = new int[]{17, 31, 53, 143, 162, 222, 287, 314, 365, 454, 467, 487, 575, 613, 671, 785};      // Sorteret liste.
        search(array1, 71);
        binarySearch(array2, 487);
    }

    // Søger efter en specifik tal-værdi ved at køre listen slavisk igennem 1 step af gangen.
    static void search(int[] array, int number) {
        int counter = 1;
        for (int i = 0;i<array.length;i++) {
            System.out.println("Antal gange kørt: "+counter);
            counter++;
            if (array[i] == number) {
                System.out.println("Tal "+number+" er fundet på index: "+i);
                break;
            }
            if (array[i] == array.length-1) {
                System.out.println("Tallet blev ikke fundet.");
            }
        }
    }

    // Søger efter en specifik tal værdi, på en sorteret liste.
    static void binarySearch(int[] array, int number) {
        boolean found = false;
        int low = 0;
        int high = array.length-1;
        while (low <= high) {
            int mid = (low+high) / 2;
            System.out.println("Nuværende index: "+mid);
            if (array[mid] < number) {
                low = mid + 1;
            } else if (array[mid] > number) {
                high = mid - 1;
            } else if (array[mid] == number) {
                System.out.println("Tal fundet på index: "+mid);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Tallet er ikke i listen.");
        }
    }
}
