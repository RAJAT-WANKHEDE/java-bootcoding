package com.bootcoding.java.Sorting;

public class BubbleSort {

    public static void main(String[] args) {


        int arr[] = {35, 24, 45, 12, 76, 50, 98, 34, 99};
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for(int j = 0 ; j < n - i - 1; j++ ){
                if( arr[j] > arr [j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}