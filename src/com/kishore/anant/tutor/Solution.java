package com.kishore.anant.tutor;

import java.util.ArrayList;
import java.util.List;

/* 5*3

         A A A
         B C F
         R J P
         W E B
         I J P

         input:
         Single dimensional array
         Range - (1,5)

         {2, 3, 4}

         B R
         B J
         B P
         R B

         */
public class Solution {

    public static List<String> result = new ArrayList<>();

    public static void main(String[] args) {

        char[][] matrix = {{'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'W', 'M', 'B'},
                {'I', 'J', 'P'},
                {'R', 'K', 'L'}};

        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(1);
        input.add(2);
        input.add(3);

        int row = matrix.length;
        int column = matrix[0].length;

        findAllCombinations(matrix, input, row, column);

        System.out.println(result.size());

    }

    private static void findAllCombinations(char[][] matrix, List<Integer> input, int row, int column) {
        List<String> rowList = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            rowList.add(getRowString(matrix, input.get(i), column));
        }

        findCombinationsRecursively(rowList, "", 0, input);

    }

    public static String findCombinationsRecursively(List<String> rowList, String str, int counter, List<Integer> input) {

        if (input.size() <= counter) {
            result.add(str);
            return "";
        }
        String row = rowList.get(counter);
        for (int i = 0; i < row.length(); i++) {
            char c = row.charAt(i);
            findCombinationsRecursively(rowList, str + c, counter + 1, input);
        }
        return str;
    }

    public static String getRowString(char[][] matrix, int row, int column) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < column; i++) {
            sb.append(matrix[row][i]);
        }
        return sb.toString();
    }


}
