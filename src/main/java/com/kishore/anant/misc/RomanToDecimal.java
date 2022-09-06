package com.kishore.anant.misc;

public class RomanToDecimal {

    public static void main(String[] args) {

    }

    // XLVII
    // XLIV
    public Integer romanToDecimal(String romanStr){
        Integer result = 0;
        for(int i =0; i<romanStr.length() ; i++)
        {
            String symbol = romanStr.substring(i, i+1);
          /*  if(romanValueMap.get(symbol) == null){
                System.out.println(symbol);
            }
            int currValue = romanValueMap.get(symbol);  // 10, 50, 1, 1
            System.out.println(result);
            if(i+1 < romanStr.length())
            {
                String nextSymbol = romanStr.substring(i+1, i+2); // L, 50, I, I, 5
                if(currValue >= romanValueMap.get(nextSymbol)){
                    result += currValue;  //47
                }
                else{
                    result -= currValue; // 39
                    result += romanValueMap.get(nextSymbol); // 39+5 = 44
                    i++;
                }
            }*/
        }
        return result;
    }
}
