import java.util.Scanner;

public class PatternTriangle {
    static void row(int i, int n) {
        if (i <= n) {
            space(1, i, n);
            col(1, i, n);
            System.out.println();
            row(i + 1, n);
        }
    }

    static void space(int j, int i, int n) {
        if (j <= n - i) {
            System.out.print(" ");
            space(j + 1, i, n);
        }
    }

    static void col(int j, int i, int n) {
        if (j <= 2 * i - i) {
            System.out.print(" *");
            col(j + 1, i, n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any value");
        int n = in.nextInt();
        row(1, n);
        in.close();
    }
}
