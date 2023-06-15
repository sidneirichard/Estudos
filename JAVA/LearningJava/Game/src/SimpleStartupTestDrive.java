import java.util.Random;
import java.util.Scanner;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        int numOfGuess = 0;
        Random random = new Random();
        SimpleStartup dot = new SimpleStartup();
        int startingLocation = random.nextInt(5);
        int[] locations = new int[]{startingLocation, startingLocation + 1, startingLocation + 2};
        dot.setLocationsCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            String result = dot.checkYourself(userGuess);
            numOfGuess++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses.");
            }
        }
    }
}
