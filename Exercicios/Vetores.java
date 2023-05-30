public class Vetores {
    public static void main(String[] args) {
        int n[]={3,5,9,8,7,1};
        System.out.println("O total de casas de 'N' é: " +n.length);
        for (int c=0;c<=5;c++){
            System.out.println("Na posição "+ c +" temos o valor "+n[c]+""); // imprime 'n' na posicao de 'c' / sinal de '+' nao é adicao, aqui ele e 'concatenacao'
        }
    }
}
