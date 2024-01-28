import java.io.*;
import java.util.*;
class Do1{
    public static void main(String args[])
    throws IOException{
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}