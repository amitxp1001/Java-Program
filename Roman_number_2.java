mport java.util.Scanner;

public class Roman_number_2 {
    public static String roman(int n) {
        int value[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String symbols[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (n > 0) {
            if (n - value[i] >= 0) {
                s.append(symbols[i]);
                n -= value[i];
            } else {
                i++;
            }
        }
        return s.toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(roman(n));
        in.close();

    }

}
