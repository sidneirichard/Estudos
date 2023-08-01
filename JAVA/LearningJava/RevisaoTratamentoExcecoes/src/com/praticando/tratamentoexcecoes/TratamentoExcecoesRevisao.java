package com.praticando.tratamentoexcecoes;

public class TratamentoExcecoesRevisao {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("brabo!");
            System.out.println("Resultado: " + myInt);
        }
        catch (NumberFormatException e) {
            System.out.println("Erro: Não dá pra fazer isso aí que vc " +
                    "ta tentando...só pára man...\n");
        }
        finally {
            System.out.println("Dentro do bloco 'finally'.");
        }
    }
}