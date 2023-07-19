public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void walk() {
        System.out.println(nome + " está andando despreocupado...");
    }

    public String toString() {
        return this.nome + "\n" + this.idade + "\n";
    }
}