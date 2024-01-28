import java.util.Scanner;
import java.io.*;
public class W1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 1;
        int count = 0;
        while (count < n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        scanner.close();

    }
}
