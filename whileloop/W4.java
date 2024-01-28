import java.io.*;
import java.util.*;
public class W4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for perfection: ");
        int number = scanner.nextInt();

        int sum = 1; // 1 is always a divisor
        int divisor = 2;

        while (divisor <= number / 2) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        scanner.close();

    }
}
