package com.kishore.anant.misc;

import java.util.ArrayList;

public class CSVParser {

   /* public static void main(String[] args) {
        ArrayList<ArrayList<String>> csv = parseCsv("one,\"two wraps\n" +
                "onto \"\"two\"\" lines\",three\n" +
                "4,,6" , "," , "\"");
        for (ArrayList<String> row: csv){
            System.out.println(row.toString());
        }
    }*/
/*
    public static ArrayList<ArrayList<String>> parseCsv(
            String csv,
            String separator,
            String quote
    ) {

        ArrayList<ArrayList<String>> csvList = new ArrayList<>();

        if(!csv.trim().isEmpty()){
            String[] rows = csv.split("\n");
            for (int i = 0; i < rows.length; i++) {
                if(rowString.contains("\"")){
                    //get next line till end not found
                    boolean endQuoteNotFound = true;
                    while(endQuoteNotFound) {
                        String nextLineString = rows[i++];
                        nextLineString = nextLineString.replaceAll("\"\"", "");
                        if (nextLineString.contains("\"")){
                            endQuoteNotFound = false;
                            nextLineString.replaceAll("\"", "");
                        }

                    }
                }
                ArrayList<String> rowList = new ArrayList<>();
                String[] cols = rowString.split(separator);
                for (String column : cols){
                    rowList.add(column);
                }
                csvList.add(rowList);
            }
        }

        if(csvList.size() == 0){
            csvList.add(new ArrayList<String>());
        }

        return csvList;
    }*/
}
