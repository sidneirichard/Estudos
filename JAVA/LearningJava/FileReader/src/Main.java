import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*Em Java, a classe FileReader é uma das classes utilizadas para ler caracteres de um arquivo de texto. Ela faz parte da API de E/S (Entrada/Saída) do Java e é especialmente
         útil quando você precisa ler dados de um arquivo de texto.*/

        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
