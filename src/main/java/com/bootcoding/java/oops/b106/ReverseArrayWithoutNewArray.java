package com.bootcoding.java.oops.b106;

public class ReverseArrayWithoutNewArray {
    public static void main(String[] args ) {
        int nums [] = {10, 15, 20, 25, 35, 75, 80, 95 };

        for (int k = 0; k < nums.length/2; k++ ) {

            int temp = nums [k];
            nums[k] = nums [nums.length-k-1];
            nums [nums.length-k-1] = temp;
        }

        for (int p = 0 ; p < nums.length; p++) {
            System.out.println (nums[p]);
        }
    }
}
