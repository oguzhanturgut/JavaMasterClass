package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
        System.out.println("Min Value : "+ findMin(myIntegers));

//        System.out.println(Arrays.toString(sortIntegers(myIntegers)));

        int[] array = {1, 4, 3, 5, 77, 4, 45};
        System.out.println("Array: "+Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array: "+Arrays.toString(array));

    }

    public static int[] getIntegers(int size) {
        int[] values = new int[size];
        System.out.println("Enter " + size +" integer values:\r");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " : " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        // Copy array
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;


    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static void reverse(int[] array) {
//        int[] cloneArray = Arrays.copyOf(array, array.length);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = cloneArray[array.length - i];
//        }

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
