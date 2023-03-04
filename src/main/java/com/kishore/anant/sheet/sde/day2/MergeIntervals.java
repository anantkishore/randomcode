package com.kishore.anant.sheet.sde.day2;

import java.util.Arrays;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        // [[1,3],[2,6],[8,10],[15,18]]
        int[][] result = merge(intervals);
        for (int[] interval: result){
            System.out.println(interval[0]+"::"+interval[1]);
        }
    }

    public static int[][] merge(int[][] intervals) {
        int[][] result = new int[intervals.length][2];

        Arrays.sort(intervals, (int[] a, int[] b)->{
            return Integer.compare(a[0], b[0]);
        });

        for (int[] interval: intervals){
            System.out.println(interval[0]+"::"+interval[1]);
        }

        int i =0, j=0;
        while (i < intervals.length){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while (i+1 < intervals.length && end > intervals[i+1][0]){
                end = Math.max(end, intervals[i+1][1]);
                i++;
            }
            result[j][0] = start;
            result[j++][1] = end;
            i++;
        }
        if(j < i){
            int[][] newResult = new int[j][2];
            for (int k = 0; k < j; k++) {
                newResult[k][0] = result[k][0];
                newResult[k][1] = result[k][1];
            }
            result = newResult;
        }
        return result;
    }
}
