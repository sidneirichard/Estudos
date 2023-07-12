import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        double numero1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Entre com o segundo número: ");
        double numero2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Que tipo de operação voce quer?: ");
        String operacao = scanner.nextLine();

        if (operacao.equals("soma")) {
            System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
        } else if (operacao.equals("sub")) {
            System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
        } else if (operacao.equals("mult")) {
            System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
        } else if (operacao.equals("div")) {
            if (numero2 == 0) {
                System.out.println("Não pode ser dividido por zero.");
            } else {
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
            }
        }
        scanner.close();
    }
}