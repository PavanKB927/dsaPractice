package com.dsa.recursion;

public class nCr {
    public static void main(String[] args) {
        System.out.println("nCr :"+C(3, 2));
    }

    // using pascals triangle
    /*
        1
       1 1
      1 2 1
     1 3 |3| 1
   */
    private static int C(int n, int r){
        if(n == r || r == 0) return 1;
        else
            return C(n-1,r-1) + C(n-1,r);
    }
}
