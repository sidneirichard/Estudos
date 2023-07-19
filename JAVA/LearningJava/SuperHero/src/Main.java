public class Main {
    public static void main(String[] args) {
        // super = palavra-chave que se refere a uma superclass de um objeto
        //          similar a palavra-chave '.this'.

        Heroi heroi1 = new Heroi("Braboman", 34, "ser brabo demais!");
        Heroi heroi2 = new Heroi("Superman", 41, "Homem de aço faz tudo!");

        Pessoa pessoa1 = new Pessoa("Richard", 34);

        System.out.println(heroi1.toString());
    }
}