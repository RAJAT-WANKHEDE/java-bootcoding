package com.bootcoding.java.oops.b106;

public class CopyOddElementsInReverse {
    public static void main(String[] args) {
        int a[] = { 10, 20, 33, 43, 51, 60, 65};
        int oddCount = 0;

        for (int i = 0; i < a.length; i ++) {
            if (a[i] % 2 != 0) {
                oddCount++;
            }
        }

        int newArray [] = new int[oddCount];
        int index = oddCount -1;

        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                newArray[index--] = a[j];
            }

        }

        for (int j = 0; j <oddCount; j++) {
            System.out.println(newArray[j]);
        }
    }
}
