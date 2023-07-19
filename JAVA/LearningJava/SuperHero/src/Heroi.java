public class Heroi extends Pessoa {
    String poder;

    Heroi(String nome, int idade, String poder) {
        super(nome, idade);
        this.poder = poder;
    }

    void fly() {
        System.out.println("Voando porque ele é o " + nome + " !");
    }

    public String toString() {
        return super.toString() + this.poder;
    }
}