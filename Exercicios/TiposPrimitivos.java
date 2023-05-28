import java.util.Scanner;

public class TiposPrimitivos {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.printf("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n",nome, nota);
        
    }
}

