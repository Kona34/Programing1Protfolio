
import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // generates a random number between 1 and 100
        int guess = 0;
        Scanner sc = new Scanner(System.in);

        while (guess != numberToGuess) {
            System.out.println("Guess a number between 1 and 100: ");
            guess = sc.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }
    }
}