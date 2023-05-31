import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int x = num%2;
        if(x==0){
            System.out.println("O número é PAR.");
        }
        else{
            System.out.println("O número é IMPAR.");
        }
    }
}
