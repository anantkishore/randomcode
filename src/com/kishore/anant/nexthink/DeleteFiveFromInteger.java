package com.kishore.anant.nexthink;

import java.util.ArrayList;

public class DeleteFiveFromInteger {

    public static void main(String[] args) {

        System.out.println(solution(15958));
        System.out.println(solution(-5859));
        System.out.println(solution(-5000));
    }

    public static int solution(int N) {


        String str = Integer.toString(N);

        ArrayList<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }


        char[] chrArr = str.toCharArray();
        int max_num = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (chrArr[i] == '5') {
                list.remove(i);
                char[] tempArr = new char[str.length() - 1];
                int j = 0;
                for (char c : list) {
                    tempArr[j++] = c;
                }
                String temp = new String(tempArr);
                //System.out.println(temp);
                if (max_num < Integer.parseInt(temp.toString())) {
                    max_num = Integer.parseInt(temp.toString());
                }
                list.add(i, '5');
            }
        }

        return max_num;
    }
}
