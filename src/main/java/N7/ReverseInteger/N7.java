package N7.ReverseInteger;

/*Дано 32-разрядное целое число со знаком x, верните x его цифры в обратном порядке.
Если обращение вспять x приводит к выходу значения за пределы диапазона
32-разрядных целых чисел со знаком [-231, 231 - 1], затем верните 0.

Предположим, что среда не позволяет хранить 64-разрядные целые числа (со знаком или без знака).*/
public class N7 {

    public static int reverse(int x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return 0;
        }

        byte[] bytes = String.valueOf(x).getBytes();
        byte[] end = new byte[bytes.length];
        int i = 1;
        for (byte b : bytes) {

            if (b == 45) {
                end[0] = b;
            } else {
                end[end.length - i] = b;
                i++;
            }
        }

        return Integer.parseInt(new String(end));
    }
    public static int reverse_(int x) {
        int sum = 0;

        int n;

        while (x != 0) {
            n = x % 10;
            x = x / 10;
            if (sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE / 10 && n > 7))
                return 0;
            if (sum  < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && n < -8))
                return 0;
            sum = sum * 10 + n;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(reverse_(1534236469));
        }
    }
