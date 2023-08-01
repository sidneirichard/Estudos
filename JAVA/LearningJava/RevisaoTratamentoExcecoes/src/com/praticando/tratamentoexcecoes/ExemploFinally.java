package com.praticando.tratamentoexcecoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploFinally {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;
            while((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        }
        catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
        }
        finally {
            try {
                if(bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo. Arquivo não encontrado.");
            }
        }
    }
}
