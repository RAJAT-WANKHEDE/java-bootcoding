package com.bootcoding.java.oops.b106;

public class CopyEvenIndex {
    public static void main(String[] args) {
        int a [] = {10, 15, 30, 45, 50, 70};
        int evenIndexCount = 0;

        for (int i = 0; i < a.length ; i++) {
            if (i % 2 == 0) {
                evenIndexCount++;
            }
        }

        int newArray[] = new int[evenIndexCount];
        int index = 0;


        for (int i = 0; i < a.length; i++){
            if (i % 2 == 0) {
                newArray[index++] = a[i];
            }
        }

        for (int i = 0; i < evenIndexCount; i++) {
            System.out.println(newArray[i]);
        }
    }
}
