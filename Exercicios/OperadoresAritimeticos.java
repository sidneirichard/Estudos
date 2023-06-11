public class OperadoresAritimeticos {
    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2; // operador '+' adição
        System.out.println("A media é igual a " + m);  // operador '+' concatenado pq é uma string*/

        /*int numero = 10;
        int valor = 4 + numero--;  // '++' e '--' operadores unários incremento/decremento  / ++n pre incremento
        System.out.println(valor);
        System.out.println(numero);*/

        /*int x = 4;
        x += 2;  // isso e igual a: x = x + 2 x recebe ele mesmo (operadores) 2
        System.out.println(x);*/

        /*float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);*/

        double ale = Math.random();  // gera aleatoriamente um numero entre 0 e 1
        int n = (int) (1 + ale * (20-1)); // para gerar um numero random de 1 a 20
        System.out.println(n);

    }
}
