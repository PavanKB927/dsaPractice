package com.dsa;

public class Main {
    public static void main(String[] args) {
        //System.out.println(isPrime(21));
        sumOfArray(new int[]{2,3,4,5,6});


    }

    //given number is prime or not
    public static boolean isPrime(int N){
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }

    //sum of numbers present in array
    public  static void sumOfArray(int[] A){
        int length = A.length;
        int sum = 0;
        for(int i=0;i<length;i++){
            sum += A[i];
        }
        System.out.println("sum of numbers present in Array : "+sum);
        return;
    }
}