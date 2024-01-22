import java.io.*;
import java.util.*;

public class W9 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for spy number: ");
        int number = scanner.nextInt();

        int sum = 0, product = 1;
        int n = number;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        if (sum == product) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }
        scanner.close();

    }
}
