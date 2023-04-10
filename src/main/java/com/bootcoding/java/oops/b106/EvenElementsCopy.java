package com.bootcoding.java.oops.b106;

public class EvenElementsCopy {
    public static void main(String[] args) {


        int a[] = {10, 15, 20, 23, 29, 50};
        int evenNumbers = 0;

        for ( int k = 0; k < a.length; k++){
            if (a[k] % 2 == 0 ){
                evenNumbers++;
            }
        }
        int newArray[] = new int[evenNumbers];
        int index = 0;

        for (int k = 0; k < a.length; k++) {
            if (a[k] % 2 == 0) {
                newArray[index++] = a[k];
            }
        }

        System.out.println("Old Array");
        for (int k = 0; k <a.length; k++ ){
            System.out.print(a[k] + ",");
        }
        System.out.println();

        System.out.println("New Array");
        for (int k = 0; k < newArray.length; k++) {
            System.out.print(newArray[k] + ",");
        }
    }
}