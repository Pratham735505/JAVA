import java.util.Scanner;
import java.io.*;
public class Do7 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        char choice;
        
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            sum += number;
            count++;
            
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of entered numbers: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
        
        scanner.close();
    }
}
