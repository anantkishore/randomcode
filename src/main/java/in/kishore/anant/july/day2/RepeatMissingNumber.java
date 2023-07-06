package in.kishore.anant.july.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatMissingNumber {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);

        List<Integer> result =
                repeatedNumber(list);
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }
    public static List<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();

        int actualSum = 0;
        for(Integer i: A){
            actualSum += i;
        }

        int actualSquareSum = 0;
        for(Integer i: A){
            actualSquareSum += Math.pow(i, 2);
        }

        int naturalSum = (A.size()*A.size()+1)/2;

        int naturalSquareSum = 0;
        for (int i = 1; i <= A.size(); i++) {
            naturalSquareSum += Math.pow(i, 2);
        }

        int x = actualSum - naturalSum;
        int y = (actualSquareSum - naturalSquareSum)/x;



        return null;
    }
}
