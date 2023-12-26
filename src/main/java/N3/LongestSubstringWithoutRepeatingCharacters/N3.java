package N3.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class N3 {
    /*Учитывая строку s, найдите длину самой длинной подстроки
    без повторения символов.*/
    /*public static int recurs(char i) {
    return recurs()
    }*/

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));

                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }


    public static void main(String[] args) {
        String str = "accdffgkvcceyn";
        System.out.println(lengthOfLongestSubstring(str));


    }
}