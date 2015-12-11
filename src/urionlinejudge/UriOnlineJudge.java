package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
//        BufferedReader entrada = new BufferedReader(new InputStreamReader(
//                new FileInputStream("/home/felipe/entradas.txt")));
        //1737
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdLinhas = Integer.parseInt(linha);
        while (qtdLinhas != 0) {
            Map<String, Integer> mapa = new HashMap<>();
            for (int i = 0; i < qtdLinhas; i++) {
                linha = entrada.readLine();
                char[] letras = linha.toCharArray();
                for (int j = 0; j < letras.length - 1; j++) {
                    String chave = "";
                    chave += letras[j] + letras[j + 1];
                    if (mapa.containsKey(chave)) {
                        mapa.put(chave, mapa.get(chave) + 1);
                    } else {
                        mapa.put(chave, 1);
                    }
                }
            }
            int total = 0;
            for (Integer i : mapa.values()) {
                total += i;
            }
            linha = entrada.readLine();
            qtdLinhas = Integer.parseInt(linha);
        }
        saida.newLine();
        saida.flush();
    }
}
