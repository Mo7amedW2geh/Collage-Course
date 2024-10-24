package com.Sort;

public class Radix {
    public static void main(String[] args) {
        int[] myArray = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(myArray);

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
    public static void radixSort(int[] arr){
        int[][] radixArray = new int[10][arr.length];
        int[] count = new int[10];
        int exp = 1;

        int max = 0;
        for (int num: arr){
            if(num > max){
                max = num;
            }
        }

        while (max / exp > 0){
            for (int val: arr){
                int radixIndex = (val / exp) % 10;
                radixArray[radixIndex][count[radixIndex]++] = val;
            }

            int pos = 0;
            for (int i = 0; i < 10; i++){
                for (int j = 0; j < count[i]; j++){
                    arr[pos++] = radixArray[i][j];
                }
                count[i] = 0;
            }

            exp *= 10;
        }
    }
}
