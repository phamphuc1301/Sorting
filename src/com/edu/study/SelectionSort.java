package com.edu.study;

public class SelectionSort {
    public static void main(String[] args) {
        print(sortInt(new int[] {9, 8, 10, 6, 100, 10, 20, 80, 200}));
    }

    static int[] sortInt(int[] input) {
        for (int i = 0; i < input.length; i ++) {
            System.out.println("Checking " + input[i]);
            int minIndex = i;// min = input[i]
            for (int j = i; j < input.length ; j++) {
                if (input[j] < input[minIndex]) {//kiem tra tat ca cac phan tu trong mang tu j[input [i]]
                    minIndex = j;//minIndex = j[1] = j[3]
                }
            }

            int temp = input[i];//input i = input[0] = 9
            input[i] = input[minIndex];// input[0] = 6;
            input[minIndex] = temp;//input[3] = 9 => 

            print(input);
        }
        return input;
    }
    static void print(int[] input) {
        for (int j : input) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
