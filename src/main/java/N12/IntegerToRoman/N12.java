package N12.IntegerToRoman;

/*12. Integer to Roman

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones' added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.



Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
        Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/
public class N12 {


    public static String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        int n = num;

        if (n / 1000 != 0) {


            for (int j = 0; j < n / 1000; j++) {
                str = str.append("M");
            }
            n = n % 1000;
        }

        if (n / 500 != 0) {
            if (n / 900 == 1) {
                str = str.append("CM");
                n = n % 900;
            } else if (n / 500 < 2) {
                str.append("D");
                n = n % 500;
            }

        }
        if (n / 100 != 0) {
            if (n / 100 == 4) {
                str.append("CD");
            } else if (n / 100 == 9) {
                str.append("CM");

            } else {
                for (int j = 0; j < n / 100; j++) {
                    str = str.append("C");
                }
            }
            n = n % 100;

        }
        if (n / 50 != 0) {

            if (n / 90 == 1) {
                str = str.append("XC");
                n = n % 90;
            } else
            if (n / 50 < 2) {
                str.append("L");
                n = n % 50;
            }

        }
        if (n / 10 != 0) {
            if (n / 10 == 9) {
                str = str.append("XC");
            } else if (n / 10 == 4) {
                str = str.append("XL");
            } else {
                for (int j = 0; j < n / 10; j++) {
                    str = str.append("X");
                }
            }
            n = n % 10;
        }

        if (n / 1 != 0) {
            switch (n) {
                case 1:
                    str.append("I");
                    break;
                case 2:
                    str.append("II");
                    break;
                case 3:
                    str.append("III");
                    break;
                case 4:
                    str.append("IV");
                    break;
                case 5:
                    str.append("V");
                    break;
                case 6:
                    str.append("VI");
                    break;
                case 7:
                    str.append("VII");
                    break;
                case 8:
                    str.append("VIII");
                    break;
                case 9:
                    str.append("IX");
                    break;
            }

        }

        return String.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1995));
    }
}