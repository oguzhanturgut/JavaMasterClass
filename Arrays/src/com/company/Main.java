package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[4] = 6;
        double[] myDoubleArray = new double[10];
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myDoubleArray));

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter "+ number+ " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double)sum / (double)values.length;
    }


}
