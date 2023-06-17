package com.dsa.recursion;

import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = -1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("fibonacci val :"+fib(4,arr));
    }

    private static int fib(int n, int[] arr){
        if(n <= 1) {
            arr[n] = n;
            return n;
        }
        else {
            if(arr[n-2] == -1){
                arr[n-2] = fib(n-2, arr);
            }
            if(arr[n-1] == -1){
               arr[n-1] = fib(n-1,arr);
            }

            return arr[n-2]+arr[n-1];

        }
    }
}
