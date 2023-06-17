package com.kishore.anant.interviews.epam;

public class Epam2 {

    public static void main(String[] args) {
        int[] arr={-3,-1,1,4,5};
        System.out.println(findSmallestMissingNum(arr));
    }

    static int findSmallestMissingNum(int[] arr){
        int num = 0;
        for (int i: arr) {
            if(i > 0){
                if(i != num+1){
                    return num+1;
                }
                num++;
            }
        }
        if(arr.length > 0 && arr[arr.length-1] <= 0){
            return 1;
        }else {
            return num+1;
        }
    }
}
