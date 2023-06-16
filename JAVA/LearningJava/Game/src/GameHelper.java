import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt) {
        System.out.println(prompt + ": ");  // Chama o 'prompt' para interação do usuário
        Scanner scanner = new Scanner(System.in);  // // Cria uma instância do Scanner para ler a entrada do usuário
        return scanner.nextInt();  // Lê e retorna o próximo número inteiro fornecido pelo usuário
    }
}