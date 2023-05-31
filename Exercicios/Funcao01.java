public class Funcao01 {
    static int soma (int a, int b){
        int s = a+b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("O método 'main' é executado antes do procedimento 'soma'");
        int sm = soma(999,1);
        System.out.println("A soma é: "+sm);

    }
}
