package com.mru.assign;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        int[] arr = {123, 456, 789};
        int[] digitSums = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            digitSums[i] = sumOfDigits(arr[i]);
        }
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sum of Digits: " + Arrays.toString(digitSums));
    }
    
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

