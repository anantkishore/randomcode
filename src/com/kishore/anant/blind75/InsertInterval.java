package com.kishore.anant.blind75;

import java.util.Arrays;

public class InsertInterval {

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {6,9}};

        int[] newInterval = {2,5};
        System.out.println(Arrays.toString(insert(intervals, newInterval)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] resultIntervals = new int[intervals.length][2];
        int j = 0;
        int i =0;
        while(i < intervals.length) {
            int[] interval = intervals[i];
            int start = interval[0];
            int end = interval[1];
            if(start <= newInterval[0] && newInterval[0] <= end)
            {
                end = Math.max(end, newInterval[1]);
                while( i < interval.length-1 && end >= intervals[i+1][0])
                {
                    end = Math.max(end, intervals[i+1][1]);
                }
                int[] result = new int[2];
                result[0] = start;
                result[1] = end;
                resultIntervals[j] = result;
                j++;
            }
        }
        return intervals;
    }


}
