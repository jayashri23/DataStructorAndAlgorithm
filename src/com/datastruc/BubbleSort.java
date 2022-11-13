package com.datastruc;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = {23, 4, 1, 65, 19, 20, 11, 31, 9, 5};
        System.out.println();
        System.out.println("Before Bubble Sort:");
        for (int s : arr) {
            System.out.println(s + "");
        }
        System.out.println();
        //sorting array using bubble sort
        bubbleSort(arr);

        //Printing the array
        System.out.println("After  Bubble Sort:");
        for (int s : arr) {
            System.out.println(s + "");
        }
    }

    //method for bubble sort
    public static <T extends Comparable> void bubbleSort(T[] arr) {
        T temp;  //used for swapping
        for (int i = 0; i < arr.length; i++) ;
        {
            for (int j = 1; j < arr.length - 1; j++) {

                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = (T) arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = (T) temp;
                }
            }
        }
    }
}