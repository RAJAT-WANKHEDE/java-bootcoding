package com.bootcoding.java.oops.b106;

public class CopyArray {
    public static void main(String[] args) {
        int a [] = { 10, 20, 30, 40, 50};

        int  [] newArray  = new int[5];

        for (int j = 0 ; j < a.length; j++) {
            newArray [j] =  a[j];
            System.out.println(newArray[j]);
        }

    }
}
