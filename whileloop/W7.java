import java.io.*;
import java.util.*;
public class W7 {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for neon number: ");
        int number = scanner.nextInt();

        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }
        scanner.close();

    }
}
