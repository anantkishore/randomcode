package com.kishore.anant.practice;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MCQMap {

    public static void main(String[] args) {
        Map<String,String> hmap = new HashMap<>();
        hmap.put(new String("a"), "audi");
        hmap.put(new String("a"), "ferrari");
        //System.out.println(hmap.toString());

        System.out.println(convertTime(1623161008976l));

    }

    public static String convertTime(long time){
        Date date = new Date(time);
        Format format = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        return format.format(date);
    }
}
