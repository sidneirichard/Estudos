import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploTratamentoExcecoes1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
