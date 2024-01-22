import java.util.Scanner;
import java.io.*;
public class Do8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        do {
            System.out.print("Enter a non-negative integer: ");
            int n = scanner.nextInt();
            
            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
                continue;
            }
            
           
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            System.out.println("Factorial of " + n + ": " + factorial);
            
            System.out.print("Do you want to calculate another factorial? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));
        
        scanner.close();
    }
}
