package praticando.hashmapmap;

import java.util.HashMap;
import java.util.Map;

public class ContadorDePalavras {
    public static void main(String[] args) {
        String texto = "Este é um exemplo de texto. " +
                "É importante contar as palavras neste texto.";
        String[] palavras = texto.split(" ");
        Map<String, Integer> contagemPalavras = new HashMap<>();

        for (String palavra : palavras) {
            palavra = palavra.replace("[.,]", "");

            if (contagemPalavras.containsKey(palavra)) {
                int contagemAtual = contagemPalavras.get(palavra);
                contagemPalavras.put(palavra, contagemAtual + 1);
            } else {
                contagemPalavras.put(palavra, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
