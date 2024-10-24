package com.Sort;

public class Bubble {
    public static void main(String[] args) {

        int[] myArray = {7, 3, 9, 12, 11};

        for (int j = 1; j < myArray.length; j++) {
            boolean swapped = false;
            for (int i = 0; i < myArray.length - j; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }

    }
}
