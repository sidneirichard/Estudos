package com.staticnonstatic.estudos;

import static com.staticnonstatic.estudos.Gato.getContadorGato;

public class StaticNonStatic {
    public static void main(String[] args) {
        System.out.println("Entrada inicial: " +Gato.getContadorGato());

        Gato meuGato = new Gato("Sidz", 4, 9);
        Gato meuGato2 = new Gato("Jonas", 3, 1);
        Gato meuGato3 = new Gato("Brabo", 2, 6);

        System.out.println("Número de entradas: " + Gato.getContadorGato());

    }
}
