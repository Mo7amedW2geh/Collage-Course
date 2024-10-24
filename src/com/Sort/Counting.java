package com.Sort;

public class Counting {
    public static void main(String[] args) {
        int[] myArray = {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};
        countingSort(myArray);

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
    public static void countingSort(int[] arr){
        int max = arr[0];
        for (int num: arr) {
            if (max < num) {
                max = num;
            }
        }

        int[] counter = new int[max + 1];

        int index = 0;
        for (int i: arr){
            counter[i]++;
        }
        for (int i = 0; i <= max; i++){
            while (counter[i]-- > 0){
                arr[index] = i;
            }
        }
    }
}
