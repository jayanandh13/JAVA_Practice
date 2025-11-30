import java.util.Random;
import java.util.Scanner;

public class Random_game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int  guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomnumber = random.nextInt(min,max);

        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomnumber){
                System.out.println("Too Low");
            } else if (guess > randomnumber) {
                System.out.println("Too High");
            }
            else {
                System.out.println("Correct the number was : " + guess);
                System.out.println("# Attempts : " + attempts);
            }

        }while (guess != randomnumber);

        scanner.close();
    }
}
