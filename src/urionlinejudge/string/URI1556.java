/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author felipe
 */
public class URI1556 {
    
    public static Set<String> conjunto;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        conjunto = new TreeSet<>();
        //1556
        while (linha != null) {
            subs(linha, "", 0);
            for (String ord : conjunto) {
                if (!ord.isEmpty()) {
                    saida.write(ord);
                    saida.newLine();
                }
            }
            saida.newLine();
            conjunto.clear();
            linha = entrada.readLine();
        }
        saida.flush();
    }

    public static void subs(String palavra, String atual, int posAtual) {
        if (!conjunto.contains(atual)) {
            conjunto.add(atual);
            for (int i = posAtual; i < palavra.length(); i++) {
                subs(palavra, atual + palavra.charAt(i), i + 1);
            }
        }
    }
}
