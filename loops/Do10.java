import java.util.Scanner;
import java.io.*;
public class Do10 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the size of the hollow square: ");
            int size = scanner.nextInt();

            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (i == 1 || i == size || j == 1 || j == size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.print("Do you want to print another pattern? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));

        scanner.close();
    }
}
