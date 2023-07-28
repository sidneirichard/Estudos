import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploTratamentoExcecoes3 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
