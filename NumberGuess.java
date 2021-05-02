import java.util.Scanner;
import java.math.*;

public class NumberGuess {

    static int userNumber = 0;
    static int userScore = 0;
    static int count = 1;
    static int i;
    static int randomNumber = (int) (Math.random() * 100 + 1);
    static Scanner sc = new Scanner(System.in);

    private static void startGuessing() {
        System.out.println("\nEnter any natural number between 1 and 100");
        userNumber = sc.nextInt();

        for (i = 1; i <= 3; i++) {
            if (userNumber == randomNumber && count < 4) {
                break;
            } else if (userNumber < randomNumber && count < 3) {

                System.out.println("Entered number is less than our number.Guess another number.");
                count++;
                userNumber = sc.nextInt();

            } else if (userNumber > randomNumber && count < 3) {

                System.out.println("Entered number is larger than our number.Guess another number.");
                count++;
                userNumber = sc.nextInt();

            }

        }
    }

    public static void main(String args[]) {

        System.out.println("Welcome to Number Guess 1.0");
        System.out.println("\nYou will get 10 rounds to score.");
        System.out.println("You have to guesss the number within three attempts(Number is between 1 and 100)");
        System.out.println(
                "For a correct guess you will get 10 marks and for incorrect guess a penalty of -10  per round");
        System.out
                .println("--**--**--**--**--**--**--**----**--**--**--**--**--**--**----**--**--**--**--**--**--**--");

        for (int j = 0; j < 10; j++) {
            startGuessing();

            if (userNumber != randomNumber) {
                System.out.println("All attempts are incorrect");
                System.out.println("Our number is " + randomNumber);
                System.out.println("10 points will be deducted from your score");
                randomNumber = (int) (Math.random() * 100 + 1);
                if (userScore > 0) {
                    userScore -= 10;
                }
                count = 1;
                userNumber = 0;

            } else {
                System.out.println("Hooray ! You guess the number correctly");
                System.out.println("Our number is " + randomNumber);
                System.out.println("10 points will be added to your score");
                randomNumber = (int) (Math.random() * 100 + 1);
                userScore += 10;
                count = 1;
                userNumber = 0;
            }
            System.out.println(
                    "\n==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--");
        }
        System.out.println("\n===========================================");
        System.out.println("\nYour final score out of 100 is " + userScore);
        System.out.println("\n===========================================");

    }
}