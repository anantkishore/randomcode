package com.kishore.anant.sheet.sde.day3;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public static void main(String[] args) {
        List<Integer> result = majorityElement(new int[]{3,3,3,3,1,2,2,2,2});
        System.out.println(result.toString());
    }

    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        int counter1 = 1;
        int counter2 = 1;
        int ele1 = nums[0];
        int ele2 = nums[0];

        /*3,1,1  1,1,2  2,2,2
        e1 3 1
        e2 1 4
        */
        for(int i=1; i< nums.length; i++){

            int x = nums[i];
            if(counter1 > counter2){
                if(ele1 == x){
                    counter1++;
                }
                else{
                    counter1--;
                }
            }
            else{
                if(ele2 == x){
                    counter2++;
                }
                else{
                    counter2--;
                }
            }

            if (counter1 == 0){
                ele1 = i;
                counter1 = 1;
            }
            if (counter2 == 0){
                ele2 = i;
                counter2 = 1;
            }
        }
        if (counter1 > nums.length/3){
            result.add(ele1);
        }
        if (counter2 > nums.length/3){
            result.add(ele2);
        }
        return result;
    }
}
