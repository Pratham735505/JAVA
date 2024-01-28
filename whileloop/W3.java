import java.io.*;
import java.util.*;
import java.math.*;
public class W3 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for Armstrong: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3); // For a 3-digit Armstrong number
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        scanner.close();

    }
}
