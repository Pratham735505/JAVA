import java.util.Scanner;
import java.io.*;
public class Do6 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();
        
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= n);
        
        scanner.close();
    }
}
