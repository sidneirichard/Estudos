public class Vetor01 {
    public static void main(String[] args) {
        int n[]={3,5,9,8,7,1};  // 'n[]' vetor // '{...}' indices  // vetor de 6 numeros vai de 0 a 5
        System.out.println("Total de índices de 'N' é: " +n.length);
        for (int c=0;c<=n.length-1;c++){
            System.out.println("Na posição "+ c +" temos o valor "+n[c]+""); // imprime 'n' na posicao de 'c' / sinal de '+' nao é adicao, aqui ele e 'concatenacao'
        }
    }
}
