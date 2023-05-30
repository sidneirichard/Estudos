public class Funcao01 {
    static void soma (int a, int b){
        int s = a+b;
        System.out.println("A soma é "+s);
    }
    public static void main(String[] args) {
        System.out.println("O método 'main' é executado antes do procedimento 'soma'");
        soma(5,2);

    }
}
