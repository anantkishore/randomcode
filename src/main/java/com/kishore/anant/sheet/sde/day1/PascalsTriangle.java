package com.kishore.anant.sheet.sde.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> rows = generate(5);
        for (List<Integer> row : rows){
            System.out.println(row.toString());
        }
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> previousRow = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        rows.add(firstRow);
        previousRow.add(1);
        previousRow.add(1);
        rows.add(previousRow);
        for (int i = 3; i <= numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 0; j < previousRow.size()-1; j++) {
                currentRow.add(previousRow.get(j)+previousRow.get(j+1));
            }
            currentRow.add(1);
            rows.add(currentRow);
            previousRow = currentRow;
        }
        return rows;
    }
}
