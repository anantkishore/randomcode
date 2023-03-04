package com.kishore.anant.sheet.sde.day3;

public class PowX {

    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }

    public static double myPow(double x, int n) {
        if (n > 0){
            return power(x, n);
        }
        else{
            return 1/power(x, n);
        }
    }

    public static double power(double x, int n){
        if(n==0){
            return 1;
        }
        else{
            return x*power(x, n-1);
        }
    }
}
