import java.util.Scanner;

public class ProdutoNumerosReais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a quantidade de números reais: ");
        int count = Integer.parseInt(sc.nextLine());
        int i = 0;
        float prod = 1.0f;
        for (i=0;i<count;i++){
            System.out.print("Entre com um número real: ");
            float x = Float.parseFloat(sc.nextLine());
            prod = prod * x;
        }
        System.out.println("O produto do número é "+prod);
    }
}
