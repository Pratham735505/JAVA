import java.io.*;
import java.util.*;
public class W6 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for automorphic number: ");
        int number = scanner.nextInt();

        int square = number * number;
        int n = number;

        while (n > 0) {
            if (n % 10 != square % 10) {
                System.out.println(number + " is not an automorphic number.");
                scanner.close();
                return;
            }
            n /= 10;
            square /= 10;
        }

        System.out.println(number + " is an automorphic number.");
        scanner.close();

    }
    
}
