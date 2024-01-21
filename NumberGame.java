import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String args []) {
        Random random= new Random();
        Scanner sc= new Scanner(System.in);
        int maxAttempts=10;
        int score=0;
        System.out.println("***🎰Welcome to our Number Guessing Game🎰***");
        System.out.println("-------------------------------------------------");
        
        do {
            int x = random.nextInt(100);
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("NOTE📝: you will get only 10 attempts to guess the correct number");
            System.out.println("Guess the number between 0-100.");
            while (attempts <= maxAttempts && !guessedCorrectly) {
                System.out.println("enter your guess:");
                int guess = sc.nextInt();
                attempts++;

                if (x == guess) {
                    System.out.println("you guessed it right👍");
                    guessedCorrectly = true;
                    score++;
                    System.out.println("number of attempts is: " +attempts);
                } else if (x < guess) {
                    System.out.println("your guess is too high");
                } else {
                    System.out.println("your guess is too low");
                }

            }
            if (!guessedCorrectly) {
                System.out.println("sorry!☹️,you ran out of attempts. The correct answer was :" + x);
            }
            System.out.println("Do you want to play again ? yes/no :");
            String playAgain = sc.next();
            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Thanks for Playing!!");
                System.out.println("Hope you enjoyed the Game😊");
                break;
            }
            else if(playAgain.equalsIgnoreCase("yes")){
                continue;
            }
            else {
                System.out.println("invalid input");
                System.out.println("Thanks for Playing!!");
                break;
            }
        } while(true);
    }
}

