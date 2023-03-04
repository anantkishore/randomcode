package com.kishore.anant.blind75.interval;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class InsertInterval {

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] result = insert(intervals, newInterval);
        for (int[] interval: result)
            System.out.println(Arrays.toString(interval));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        int newIntervalStart = newInterval[0];
        int newIntervalEnd = newInterval[1];

        LinkedList<ArrayList<Integer>> result = new LinkedList<>();
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newIntervalStart){
            ArrayList<Integer> interval = new ArrayList<>();
            interval.add(intervals[i][0]);
            interval.add(intervals[i][1]);
            result.add(interval);
            i++;
        }

        while(i < intervals.length && intervals[i][0] <= newIntervalEnd){
            newIntervalStart = Math.min(intervals[i][0], newIntervalStart);
            newIntervalEnd = Math.max(intervals[i][1], newIntervalEnd);
            i++;
        }

        ArrayList<Integer> interval = new ArrayList<>();
        interval.add(newIntervalStart);
        interval.add(newIntervalEnd);
        result.add(interval);

        while(i< intervals.length){
            interval = new ArrayList<>();
            interval.add(intervals[i][0]);
            interval.add(intervals[i][1]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
