package com.praticando.leituraescrita;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeituraEscrita {
    public static void main(String[] args) throws FileNotFoundException {
        String nomeArquivo = "arquivo.txt";
        try(FileReader fileReader = new FileReader(nomeArquivo)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
        } ;
    }
}