package N13.RomanToInteger;

/*13. Перевод с латинского на целое число

Римские цифры представлены семью различными символами: I, V, X, L C, D M,,, и ,,.

Значение символа
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
Например, 2 записывается как II римскими цифрами, просто складываются две единицы. 12 записывается как XII, что означает просто X + II. Число 27 записывается как XXVII, что является XX + V + II.

Римские цифры обычно записываются от наибольшего к наименьшему слева направо. Однако цифра для четырех таковой не является IIII. Вместо этого число четыре записывается как IV. Поскольку единица стоит перед пятеркой, мы вычитаем ее, получая четыре. Тот же принцип применим к числу девять, которое записывается как IX. Существует шесть случаев, когда используется вычитание:

I может быть помещен перед V (5) и X (10), чтобы получились 4 и 9.
X может быть помещен перед L (50) и C (100), чтобы составить 40 и 90.
C может быть помещен перед D (500) и M (1000), чтобы получить 400 и 900.
Если задана римская цифра, преобразуйте ее в целое число.*/
public class N13 {
    public static int romanToInt(String s) {
        int i = 1;      //73
        int v = 5;      //86
        int x = 10;     //88
        int l = 50;     //76
        int c = 100;    //67
        int d = 500;    //68
        int m = 1000;   //77
        int sum = 0;
        int previous = 0;

        byte[] bytes;
        bytes = s.getBytes();
        for (byte b : bytes) {
            switch (b) {
                case 73:
                    sum = sum + i;
                    previous = i;
                    break;
                case 86:
                    if (previous == i) {
                        sum = sum + v - 2;
                        previous = 0;
                    } else {
                        sum = sum + v;
                        previous = v;
                    }
                    break;
                case 88:
                    if (previous == i) {
                        sum = sum + x - 2;
                        previous = 0;
                    } else {
                        sum = sum + x;
                        previous = x;
                    }
                    break;
                case 76:
                    if (previous == x) {
                        sum = sum + l - 20;
                        previous = 0;
                    } else {
                        sum = sum + l;
                        previous = l;
                    }
                    break;
                case 67:
                    if (previous == x) {
                        sum = sum + c - 20;
                        previous = 0;
                    } else {
                        sum = sum + c;
                        previous = c;
                    }
                    break;
                case 68:
                    if (previous == c) {
                        sum = sum + d - 200;
                        previous = 0;
                    } else {
                        sum = sum + d;
                        previous = d;
                    }
                    break;
                case 77:
                    if (previous == c) {
                        sum = sum + m - 200;
                        previous = 0;
                    } else {
                        sum = sum + m;
                        previous = m;
                    }
                    break;
            }

        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));

    }


}

