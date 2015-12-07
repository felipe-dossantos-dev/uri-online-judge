package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class UriOnlineJudge {

    public static Set<String> conjunto;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        conjunto = new TreeSet<>();
        while (linha != null) {
            subs(linha, "", 0);
            for (String ord : conjunto) {
                saida.write(ord);
                saida.newLine();
            }
            saida.newLine();
            conjunto.clear();
            linha = entrada.readLine();
        }
        saida.flush();
    }

    public static void subs(String palavra, String atual, int posAtual) {
        if (atual.length() > 0) {
            conjunto.add(atual);
        }
        if (atual.length() < palavra.length()) {
            for (int i = posAtual; i < palavra.length(); i++) {
                subs(palavra, atual + palavra.charAt(i), i + 1);
            }
        }
    }
}
