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
        int sum = 0;
        int previous = 0;
        for (byte b : s.getBytes()) {
            switch (b) {
                case 73:
                    sum = sum + 1;
                    previous = 1;
                    break;
                case 86:
                    if (previous == 1) {
                        sum = sum + 3;
                        previous = 0;
                    } else {
                        sum = sum + 5;
                        previous = 5;
                    }
                    break;
                case 88:
                    if (previous == 1) {
                        sum = sum + 8;
                        previous = 0;
                    } else {
                        sum = sum + 10;
                        previous = 10;
                    }
                    break;
                case 76:
                    if (previous == 10) {
                        sum = sum + 30;
                        previous = 0;
                    } else {
                        sum = sum + 50;
                        previous = 50;
                    }
                    break;
                case 67:
                    if (previous == 10) {
                        sum = sum + 80;
                        previous = 0;
                    } else {
                        sum = sum + 100;
                        previous = 100;
                    }
                    break;
                case 68:
                    if (previous == 100) {
                        sum = sum + 300;
                        previous = 0;
                    } else {
                        sum = sum + 500;
                        previous = 500;
                    }
                    break;
                case 77:
                    if (previous == 100) {
                        sum = sum + 800;
                        previous = 0;
                    } else {
                        sum = sum + 1000;
                        previous = 1000;
                    }
                    break;
            }

        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }


}

