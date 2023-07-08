import java.util.Scanner;

public class Array_InputfromUser {
    public static void main(String[] args) {
        int length;
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends name that are gona enter");
        length = input.nextInt();
        String[] names = new String[length];
        for (int counter = 0; counter < length; counter++) {
            System.out.println("Enter the name of friend" + (counter + 1));
            names[counter] = input.next();

        }
        input.close();
        System.out.println("your friend name");
        for (int counter = 0; counter < length; counter++) {
            System.out.println(names[counter]);

        }

    }

}
