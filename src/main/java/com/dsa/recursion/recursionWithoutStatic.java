package com.dsa.recursion;

public class recursionWithoutStatic {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    public static int fun(int n){
        if(n > 0){
            return fun(n-1)+n;
        }
        return 0;
    }
}