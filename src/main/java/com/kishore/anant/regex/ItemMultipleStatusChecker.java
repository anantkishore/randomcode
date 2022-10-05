package com.kishore.anant.regex;

public class ItemMultipleStatusChecker {

    public static void main(String[] args) {
            int result = divide(10,5);

            System.out.println(result);
    }

    static int divide(int x, int y){
        return x/y;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    static int subtract(int a, int b){
        return a-b;
    }

    static int add(int a, int b){
        return a+b;
    }
}

























/*

    String line = "2022-09-02 01:23:56,009 INFO main cli.service.impl.CheckService:169 - GF00CA002-DOC-0000-r0p0-40eac0 : IPW CERTIFIED : AWS <DOES NOT EXIST>";
    Matcher itemMultipleStatusMatcher = ITEM_MULTIPLE_STATUS_REGEX.matcher(line);
        if (itemMultipleStatusMatcher.find()) {
                String item_name = itemMultipleStatusMatcher.group("item");
                String item_ipw_status = itemMultipleStatusMatcher.group("ipwstatus");
                String item_connect_status = itemMultipleStatusMatcher.group("awsstatus");


                System.out.println(item_name);
                System.out.println(item_ipw_status);
                System.out.println(item_connect_status);
*/
