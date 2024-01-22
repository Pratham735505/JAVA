import java.util.Scanner;
import java.io.*;
public class W2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = 1;
        int i = 1;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        System.out.println("GCD of " + num1 + " and " + num2 + ": " + gcd);
        scanner.close();

    }
}
