import java.io.*;
import java.util.*;
public class Do4 {
    public static void main(String args[]) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1-4): ");
            choice= scanner.nextInt();
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
           
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            
            System.out.print("Do you want to perform another operation? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        scanner.close();
    }   
}
