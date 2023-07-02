package in.kishore.anant.july.day1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> res = generate(5);
        for (List<Integer> list: res){
            for (Integer i: list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(1);

        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);

        result.add(row1);
        if(numRows>1)
            result.add(row2);

        List<Integer> prevRow = row2;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i-2; j++) {
                row.add(prevRow.get(j)+ prevRow.get(j+1));
            }
            row.add(1);
            result.add(row);
            prevRow = row;
        }
        return result;
    }
}
