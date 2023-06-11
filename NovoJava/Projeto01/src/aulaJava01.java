import java.util.Scanner;
public class aulaJava01 {
    public static void main(String[] args) {
        System.out.println("Olá, " + args[0]);
    }

    static void sum(int x, int y) {
        // static void > declaração padrao.
        // sum > Nome da funçao.
        // () > Parenteses usados para indicar o que virá dentro da FUNÇÂO (Parametros)
        // (tipo, nomeDaVariavel)
        // {} > bloco de codigo que será executado

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

    }
}


