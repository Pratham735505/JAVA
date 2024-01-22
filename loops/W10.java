import java.io.*;
import java.util.*;
public class W10 {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for pronic number: ");
        int number = scanner.nextInt();

        int i = 0;
        while (i * (i + 1) <= number) {
            if (i * (i + 1) == number) {
                System.out.println(number + " is a pronic number.");
                scanner.close();
                return;
            }
            i++;
        }

        System.out.println(number + " is not a pronic number.");
        scanner.close();

    }
}
