import java.io.*;
import java.util.*;
public class W5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm);
                break;
            }
            lcm++;
        }
        scanner.close();

    }
    
}
