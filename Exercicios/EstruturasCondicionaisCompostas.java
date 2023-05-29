import java.util.Scanner;

public class EstruturasCondicionaisCompostas {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int nasc = t.nextInt();
        int i = 2023 - nasc;
        System.out.println("Sua idade é: "+i+" anos");
        if (i>18){
            System.out.println("Maior de Idade.");
        }else{  // abre o else(senao) e ja fecha//
            System.out.println("Menor de Idade.");
        }
    }
}
