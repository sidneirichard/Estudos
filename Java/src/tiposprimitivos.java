import java.util.Scanner;

public class tiposprimitivos {

    static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            float nota = teclado.nextFloat();
            System.out.printf("A nota de %s é %.1f \n",nome, nota);
            System.out.printf("O menino é brabo!");

        }
}