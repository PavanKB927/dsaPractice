package com.dsa.recursion;

public class recursionWithStatic {
    static int x = 0;
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    public static int fun(int n){
        if(n > 0){
            x++;
            return fun(n-1)+x;
        }
        return 0;
    }
}
