package com.dsa.recursion;

public class indirectRecursion {
    public static void main(String[] args) {
        A(20);
    }

    public static void A(int n){
        if(n > 0){
            System.out.println(n);
            B(n-1);
        }
    }

    public static void B(int n){
        if(n > 1){
            System.out.println(n);
            A(n/2);
        }
    }
}

