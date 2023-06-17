package com.dsa.recursion;

public class TaylorStream {
    static double p =1, f=1,s = 1;
    public static void main(String[] args) {
        System.out.println("using bruteForce :"+calculat_e(2,10));
        System.out.println("using optimized version:"+OptimizedCalculate_e(2,10));

    }

    //brute force approach using recursion
    /*
    * Time Complexity for below
    * Taylor series means : 1+(x/1)+(x/2!)+(x/3!)+....+n
    * if n = 3
    * the number of multiplications will be
    * 1 + (x/1) + (x*x / 2*1) + (x*x*x / 3*2*1)
    * multipllication:
    * 0 + 0     +   2   + 4
    * total multiplication = 6
    * i.e. for n = 3. the TC is O(n^2)
    * */
    private static double calculat_e(int x, int n){
        double r =0;
        if(n ==0) return 1;
        else {
            r = calculat_e(x,n-1);
            p = p*x;
            f = f*n;
            return r+p/f;
        }
    }

    // optimized version of taylor series
    /*
    * for same example, n = 3
    * the equation will be like : 1 + (x/1) + (x*x / 2*1) + (x*x*x / 3*2*1)
    * take x/1 common : 1+(x/1)*((1 + x/2 + (x*x / 3*2) )
    * take x/2 common: (1+(x/1))*((1+x/2) * (1 + x/3))
    * total multiplications is 2
    * */
    private static double OptimizedCalculate_e(int x, int n){
        if(n == 0) return s;
        else {
            s =  1+ x*s/n;
            return OptimizedCalculate_e(x, n-1);
        }
    }

}
