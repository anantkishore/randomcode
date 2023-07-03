package in.kishore.anant.july.day16;

public class KMP {

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";

        int index = strStr(haystack, needle);

        System.out.println(index);
    }

    public static int strStr(String haystack, String needle) {

        int[] lps = new int[needle.length()];

        int i =1;
        int prevLPS = 0;
        while(i < needle.length()){
            if(needle.charAt(i) == needle.charAt(prevLPS))
            {
                lps[i] = prevLPS+1;
                i++;
                prevLPS++;
            }
            else{
                if(prevLPS == 0) {
                    lps[i]=0;
                    i++;
                }
                else{
                    prevLPS = lps[prevLPS-1];
                }
            }
        }

        i =0; int j =0;
        while (i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j==0){
                    i++;
                }
                else{
                    j = lps[j-1];
                }
            }
            if(j == needle.length()){
                return i-j;
            }

        }

        return -1;
    }
}
