import java.util.Random;
import java.util.Scanner;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        int numOfGuess = 0;
        Random random = new Random();
        SimpleStartup dot = new SimpleStartup();  // Instância da classe SimpleStartup
        int startingLocation = random.nextInt(5);  // Gera um número aleatório entre 0 e 4
        int[] locations = new int[]{startingLocation,
                startingLocation + 1, startingLocation + 2};  // Cria um Array com as posições das células
        dot.setLocationsCells(locations);  // Define as cúlulas no objeto SimpleStartup
        boolean isAlive = true;  // Variável para controlar o estado do jogo
        while (isAlive) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();  // Obtém o palpite do usuário
            String result = dot.checkYourself(userGuess);  // Verifica o palpite do usuário
            numOfGuess++;  // Incrementa o número de palpites
            if (result.equals("kill")) {  // Verifica se o resultado é 'kill'
                isAlive = false;  // Finaliza o loop
                System.out.println("You took " + numOfGuess + " guesses.");
            }
        }
    }
}
