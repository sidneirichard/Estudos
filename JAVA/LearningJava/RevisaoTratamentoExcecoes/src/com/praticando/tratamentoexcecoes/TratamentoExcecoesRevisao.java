package com.praticando.tratamentoexcecoes;

public class TratamentoExcecoesRevisao {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida!");
        }
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}