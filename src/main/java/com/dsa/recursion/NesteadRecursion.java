package com.dsa.recursion;

public class NesteadRecursion {
    public static void main(String[] args) {
        System.out.println(fun(91));
    }

    public static int fun(int n){
        if(n > 100){
            return n-10;
        }else{
            return fun(fun(n+11));
        }
    }
}
