package com.dsa.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(4,1,2,3);
    }

    /*
    * A = source
    * B = helper
    * C = destination
    * */
    private static void TOH(int n,int A, int B, int C){
        if(n > 0){
            TOH(n-1, A,C,B);
            System.out.println(A +" -> "+C);
            TOH(n-1,B,A,C);
        }
    }
}
