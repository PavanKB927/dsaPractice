package com.dsa.recursion;

public class TailRecursion {
    public static void main(String[] args) {
        tailRecusion(10);
    }

    // Tail Recursion: call recursion at the end
    private static void tailRecusion(int n){
        if(n == 0) return;
        else{
            System.out.print(n+" ");
            tailRecusion(n-1);
        }
    }
}
