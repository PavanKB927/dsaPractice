package com.dsa.recursion;

public class HeadRecursion {
    public static void main(String[] args) {
        headRecursion(10);
    }

    // Head Recursion: calling recursion first followed by work
    private static void headRecursion(int n){
        if(n == 0) return;
        else {
            headRecursion(n-1);
            System.out.print(n+" ");
        }
    }
}
