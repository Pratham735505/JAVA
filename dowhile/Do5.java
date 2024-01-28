import java.util.Scanner;
import java.io.*;
public class Do5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = number;
        
        do {
            sum += temp % 10;
            temp /= 10;
        } while (temp != 0);
        
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
