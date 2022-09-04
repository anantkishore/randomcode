package com.kishore.anant.aisera;

import java.util.ArrayList;
import java.util.List;

public class IntegerToWord {

    public static void main(String[] args) {
        // TODO document why this method is empty
        /*

        123675
->
One Lakh twenty Three Thousand, Six Hundred and Seventy Five



00      00          000

Lakhs  thousands   Hundreds
         */

        int number = 123675;

        int base = 10;
        int count = 0;
        int temp = number;
        while (temp > 0) {
            temp = temp / base;
            count++;
        }

        List<Integer> blocks = new ArrayList<>();


        temp = number;
        blocks.add(temp % 1000);
        temp = temp / 1000;
        count -= 3;
        base = 100;
        while (count > 0) {
            blocks.add(number % base);
            number /= 100;
            count -= 2;
        }

        // blocks 675, 23 ,1


    }
}
