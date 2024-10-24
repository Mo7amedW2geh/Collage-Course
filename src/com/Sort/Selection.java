package com.Sort;

public class Selection {
    public static void main(String[] args) {

        int[] myArray = {64, 34, 25, 5, 22, 11, 90, 12};

        for (int i = 0; i < myArray.length - 1; i++) {
            int min = i, j = i, temp;
            for (; j < myArray.length; j++) {
                if (myArray[j] < myArray[min]) {
                    min = j;
                }
            }
            temp = myArray[i];
            myArray[i] = myArray[min];
            myArray[min] = temp;
        }

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}
