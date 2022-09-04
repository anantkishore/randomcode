package com.kishore.anant.bhaanju;

public class AddTwoNumbers {

    public static void main(String[] args) {

        String num1 = "11", num2 = "123";

        int num1Len = num1.length();
        int num2Len = num2.length();

        int resultLen = ((num1Len > num2Len) ? num1Len+1 : num2Len+1);
        char[] result = new char[resultLen];



        while(num1Len > 0 && num2Len > 0){

            int carry = 0;
            int a = (int) num1.charAt(num1Len-1)-48;
            int b = (int) num2.charAt(num2Len-1)-48;

            int sum = a+b+carry;

            if( sum >= 10){
                carry = 1;
                sum %= 10;
            }

            result[resultLen-1] = (char) sum;


            num1Len--;
            num2Len--;
            resultLen--;
        }
        int carry =0;
        if (num1Len > 0){

            while (num1Len > 0)
            {
                int a = (int) num1.charAt(num1Len--)-48;
                if (carry > 0){
                    a++;
                    carry = 0;
                }
                result[resultLen--] = (char)a;

            }
        }

        if (num2Len > 0){

            while (num2Len > 0)
            {
                int b = (int)num2.charAt(num2Len--)-48;
                if (carry > 0 ){
                    b++;
                    carry =0;
                }
                result[resultLen--] = (char)b;
                carry = 0;
            }
        }

        System.out.println(new String(result));
    }
}
/*
    Input: head = [3,2,0,-4], pos = 1
    output 1

    Node slowPtr = head;
    Node fastPtr = head;
    boolean loop = false;

    while(fastPtr != null && fastPtr.next != null){
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next.next;

        if(slowPtr == fastPtr){
            loop = true;
            break;
        }
    }

    if(loop){
        HashSet<Node> set = new HashSet<>();

        set.add(slowPtr);
        slowPtr = slowPtr.next;
        while(fastPtr != slowPtr){
            set.add(slowPtr);
            slowPtr = slowPtr.next;
        }

        Node loopStartPtr = head;
        while(true){
            if(!set.add(loopStartPtr)){
                break;
            }
            loopStartPtr = loopStartPtr.next;
        }
    }
    return loopStartPtr;


 */