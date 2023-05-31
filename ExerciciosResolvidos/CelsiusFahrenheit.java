import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        System.out.print("Coloque a temperatura em Célcios: ");
        Scanner sc = new Scanner(System.in);
        int c = Integer.parseInt(sc.nextLine());
        float f = ((9f*c)/5f)+32;
        System.out.println("A temperatura em Fahrenheit é " +f);
    }
}
