package com.optionalsinjava;

import java.util.Optional;

public class OptionalExemplo {
    public static void main(String[] args) {
        Optional<Gato> gatoOptional = acheGatoPeloNome("Fred");

        gatoOptional.map(Gato::getIdade)
                .orElse(0);
    }

    // O objetivo principal do Optional é evitar as temidas
    // exceções NullPointerException ao acessar um valor que pode ser nulo.
    private static Optional<Gato> acheGatoPeloNome(String nome) {
        return Optional.empty();
    }
}
