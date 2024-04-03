package N14.LongestCommonPrefix;
/*
Напишите функцию для поиска самой длинной строки общего префикса среди массива строк.
Если общего префикса нет, верните пустую строку "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/


public class N14 {


    public static String longestCommonPrefix(String[] strs) {
        if (strs[0].length() == 1 && strs.length == 1) return strs[0];
        int min = Integer.MAX_VALUE;
        String min_prefix = "";

        for (int i = 0; i < strs.length; i++) {
            if (i + 1 >= strs.length) break;

            StringBuilder pref = new StringBuilder();

            char[] charArrayI = strs[i].toCharArray();

            char[] charArrayJ = strs[i + 1].toCharArray();

            for (int j = 0; j < charArrayI.length; j++) {
                if (j > charArrayJ.length - 1) break;

                if (charArrayI[j] == charArrayJ[j]) {
                    pref.append(charArrayI[j]);
                } else break;

            }


            if (String.valueOf(pref).length() < min) {
                min_prefix = String.valueOf(pref);
                min = min_prefix.length();
            }
        }

        return min_prefix;
    }

    public static String prefix(String i1, String i2) {
        StringBuilder pref = new StringBuilder();

        char[] charArrayI = i1.toCharArray();

        char[] charArrayJ = i2.toCharArray();

        for (int i = 0; i < i1.length(); i++) {
            if (i > charArrayJ.length - 1) break;


            if (charArrayI[i] == charArrayJ[i]) {
                pref.append(charArrayI[i]);
            } else break;

        }


        return String.valueOf(pref);
    }


    public static void main(String[] args) {
        String[] strs = {"a"};

        //  System.out.println(longestCommonPrefix(strs));

        String str = "hello";


        /*int min = Integer.MAX_VALUE;
        String prefix="";
        String min_prefix="";

        for (int i = 0; i < strs.length; i++) {
            if(i+1>=strs.length)break;
            prefix= prefix(strs[i], strs[i+1]);
            if(prefix.length()<min){
                min_prefix = prefix;
                min=prefix.length();
            }
        }

        System.out.println(min_prefix);*/
    }
}
