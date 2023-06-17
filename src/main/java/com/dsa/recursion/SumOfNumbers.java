package com.dsa.recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Sum :"+sumOfNumber(5));
    }

    private static int sumOfNumber(int n){
        if(n == 0) return 0;
        else return n + sumOfNumber(n-1);
    }
}
