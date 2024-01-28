import java.io.*;
import java.util.*;
class Do2{
    public static void main(String args[])
    throws IOException{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int guess;
        
        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != targetNumber);

        System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
     scanner.close();   
    }
}