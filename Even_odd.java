import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("this is even number");

        } else {
            System.out.println("This is odd number");

        }
    }

}
