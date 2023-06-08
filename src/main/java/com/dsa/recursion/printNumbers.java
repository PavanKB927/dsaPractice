package com.dsa.recursion;

public class printNumbers {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){

        if(n > 0){
            System.out.print(n);
            print(n-1);
        }
    }
}
