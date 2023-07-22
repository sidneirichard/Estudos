import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Que animal você quer?");
        System.out.print("1 para cachorros ## 2 para gatos: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            animal = new Cachorro();
            System.out.println("Escolheu um cachorro");
            animal.falar();
        } else if (escolha == 2) {
            animal = new Gato();
            System.out.println("Escolheu um gato");
            animal.falar();
        } else {
            animal = new Animal();
            System.out.println("Escolha inválida...");
            animal.falar();
        }
    }
}
