import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro lado do triangulo: ");
        int a= sc.nextInt();

        System.out.print("Digite o segundo lado do triangulo: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro lado do triangulo: ");
        int c = sc.nextInt();

        if((a+b)>c && (a+c)>b && (b+c)>a){
            double s=(a+b+c)/2.0;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("A area do triangulo é: "+ area);
        }
        else
            System.out.println("A area do triangulo não existe.");
        }
    }
