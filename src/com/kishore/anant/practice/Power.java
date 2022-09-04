package com.kishore.anant.practice;

public class Power {

    public static void main(String[] args) {

        myPow(123456, 123456);
    }

    public static double myPow(double x, int n) {

        if(n < 0)
        {
            return 1/x*myPow(1/x, -(n+1));
        }
        if(n == 0)
            return 1;
        else{
            return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
        }
    }
}
