import java.io.*;
import java.util.*;
public class W8 {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int product = 1;
        int n = number;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }

        System.out.println("Product of digits: " + product);
        scanner.close();

    }
}
