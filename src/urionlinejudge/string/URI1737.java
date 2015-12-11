package urionlinejudge.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class URI1737 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdLinhas = Integer.parseInt(linha);
        while (qtdLinhas != 0) {
            double total = 0;
            Map<String, Integer> mapa = new HashMap<>();
            char anterior = 'a';
            for (int i = 0; i < qtdLinhas; i++) {
                linha = entrada.readLine();
                char[] letras = linha.toCharArray();
                if (i != 0) {
                    String chave = "";
                    chave += anterior;
                    chave += letras[0];
                    if (mapa.containsKey(chave)) {
                        mapa.put(chave, mapa.get(chave) + 1);
                    } else {
                        mapa.put(chave, 1);
                    }
                    total++;
                }
                for (int j = 0; j < letras.length - 1; j++) {
                    String chave = "";
                    chave += letras[j];
                    chave += letras[j + 1];
                    if (mapa.containsKey(chave)) {
                        mapa.put(chave, mapa.get(chave) + 1);
                    } else {
                        mapa.put(chave, 1);
                    }
                    total++;
                }
                anterior = letras[letras.length - 1];
            }
            //fazer as divisoes
            List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapa.entrySet());
            Collections.sort(lista, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if (o2.getValue().compareTo(o1.getValue()) == 0) {
                        if (o2.getKey().compareTo(o1.getKey()) == 0) {
                            return 0;
                        } else {
                            return o1.getKey().compareTo(o2.getKey());
                        }
                    } else {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                }
            });
            for (int i = 0; i < 5; i++) {
                Map.Entry<String, Integer> e = lista.get(i);
                double frequencia = e.getValue() / total;
                saida.write(String.format("%s %d %.6f\n", e.getKey(), e.getValue(), frequencia));
            }
            saida.newLine();
            linha = entrada.readLine();
            qtdLinhas = Integer.parseInt(linha);
        }
        saida.flush();
    }
}
