package com.bootcoding.java.oops.b106;

public class CopyInReverseOrder {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int n = a.length;
        int newArray[] =  new int[a.length];

        for (int i = n-1; i >= 0; i--){
            System.out.print(a[i] + ",");
        }

        System.out.println();

        for (int i = n-1; i>= 0; i--){
            newArray[i] = a[i];

        }
        for (int i = n-1 ; i >=0; i--) {
            System.out.println(newArray[i]);
        }

    }
}
