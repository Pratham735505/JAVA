import java.util.Scanner;
import java.io.*;
public class Do9 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the number of rows for the pyramid: ");
            int rows = scanner.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.print("Do you want to build another pyramid? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));

        scanner.close();
    }
}
