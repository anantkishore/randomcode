package in.kishore.anant.july.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        //int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals = {{1, 4}, {0, 0}};

        for (int[] interval : intervals) {
            System.out.println(interval[0] + "," + interval[1]);
        }

        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(interval[0] + "," + interval[1]);
        }
    }

    public static int[][] merge(int[][] intervals) {

        for (int j = 0; j < intervals.length; j++) {
            for (int i = 0; i < intervals.length-1; i++) {
                if (intervals[i][0] > intervals[i + 1][0]) {
                    int start = intervals[i + 1][0];
                    int end = intervals[i + 1][1];
                    intervals[i + 1][0] = intervals[i][0];
                    intervals[i + 1][1] = intervals[i][1];
                    intervals[i][0] = start;
                    intervals[i][1] = end;
                }
            }
        }

        ArrayList<ArrayList<Integer>> mergedIntervals = new ArrayList<>();
        List<Integer> prevInterval = new ArrayList<>();

        prevInterval.add(intervals[0][0]);
        prevInterval.add(intervals[0][1]);

        mergedIntervals.add((ArrayList<Integer>) prevInterval);

        for (int i = 0; i < intervals.length; i++) {

            int intervalStart = intervals[i][0];
            int intervalEnd = intervals[i][1];

            if (prevInterval.get(1) >= intervalStart) {
                prevInterval.set(0, Math.min(intervalStart, prevInterval.get(0)));
                prevInterval.set(1, Math.max(intervalEnd, prevInterval.get(1)));
            } else {
                List<Integer> newInterval = new ArrayList<>();
                newInterval.add(intervals[i][0]);
                newInterval.add(intervals[i][1]);
                mergedIntervals.add((ArrayList<Integer>) newInterval);
                prevInterval = newInterval;
            }
        }

        int[][] result = new int[mergedIntervals.size()][2];
        int i =0;
        for (ArrayList<Integer> interval : mergedIntervals) {
            result[i][0] = interval.get(0);
            result[i][1] = interval.get(1);
            i++;
        }
        return result;
    }
}
