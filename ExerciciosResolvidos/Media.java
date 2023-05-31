import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a contagem de números: ");
        int count = Integer.parseInt(sc.nextLine());
        int i = 0;
        double m = 0;

        for(i=0;i<count;i++){
            System.out.print("Digite um número: ");
            int x =  Integer.parseInt(sc.nextLine());
            m += x;
        }

        double avg = m/count;
        System.out.println("A média é "+ avg);
    }
}
