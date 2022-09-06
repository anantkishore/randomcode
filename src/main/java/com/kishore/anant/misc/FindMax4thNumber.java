package com.kishore.anant.misc;

public class FindMax4thNumber {
    public static void main(String[] args) {
        int[] arr = {1,20,3,4,5,6,7};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            int number = arr[i];
            if(number > max1)
            {
                max4 = max3;
                max3 = max2;
                max2 = max1;
                max1 = number;
            }
            if(number > max2 && number < max1)
            {
                max4 = max3;
                max3 = max2;
                max2 = number;
            }
            if(number > max3 && number < max2)
            {
                max4 = max3;
                max3 = number;
            }
            if(number > max4 && number < max3)
            {
                max4 = number;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        System.out.println(max4);
    }
}
