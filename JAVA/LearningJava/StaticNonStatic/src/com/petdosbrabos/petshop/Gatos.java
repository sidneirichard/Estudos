package com.staticnonstatic.estudos;

public class Gato {
    private static int contadorGato = 0;
    public String nome;
    public int idade;
    public int vidasRestantes;

    public Gato(String nome, int idade, int vidasRestantes) {
        this.nome = nome;
        this.idade = idade;
        this.vidasRestantes = vidasRestantes;
        contadorGato++;
    }

    public void miar() {
        System.out.println("Meow");
    }
    public static int getContadorGato() {
        return contadorGato;
    }
}
