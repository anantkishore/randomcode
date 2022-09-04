package com.kishore.anant.nirmata;
// 11000000 00000000
// 11000000 10101000 00000000
// 11000000 10101000 00000001
// 11000000 10101000 00000011
// 11000000 10101000 00000011
public class IPEncodeDecode {

    private static int encode(String ipStr) {
        String[] ipParts = ipStr.split("\\.");
        int result = 0;
        int counter =0;
        int[] singleByteArr = new int[8];
        for (String ipPart:ipParts
        ) {

            int ipInt = Integer.parseInt(ipPart);

            result = result | ipInt;
            counter++;
            if(counter <3)
                result = result << 8;

        }
        System.out.println(Integer.toBinaryString(result));
        return result;
    }

    private static String decode(int ipInt) {
        // 000000 000000 000000 0000000
        int base = 255;
        int ipPart = ipInt & base;
        System.out.print(ipPart);
        String ipPartStr = Integer.toString(ipPart);
        //System.out.print(ipPartStr);


        return ipPartStr;
    }

    public static void main(String[] args) {

        System.out.println("Size of int: " + (Integer.SIZE / 8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE / 8) + " bytes.");


        String ip = "192.168.1.2"; //

        int ipInt = encode(ip);


        /*StringBuilder sb = new StringBuilder();

        while(ipInt > 0)
        {
            int rem = (int) (ipInt %2);
            sb.append(rem);
            ipInt /= 2;
        }*/

    }


}
