package com.dsa.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(4,4));
        System.out.println(optimizedPower(4,4));
    }

    private static int power(int a,int b){
        if(b == 0){
            return 1;
        }else{
            return power(a,b-1)*a;
        }
    }

    private static int optimizedPower(int a,int b){
        if(b == 0) return 1;
        if(b%2 == 0) return optimizedPower(a*a,b/2);
        else return  a*optimizedPower(a*a,(b-1)/2);

    }
}
