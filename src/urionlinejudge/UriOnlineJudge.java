package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class UriOnlineJudge {
    
    public static Set<String> conjunto;

    public static void main(String[] args) throws IOException {
        //1556
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        conjunto = new HashSet<>();
        while (linha != null) {
            subs(linha.toCharArray(), 0, 0, linha.length(), linha.length());
            List<String> listaOrdenada = new ArrayList<>(conjunto);
            Collections.sort(listaOrdenada);
            for (String ord : listaOrdenada) {
                saida.write(ord);
                saida.newLine();
            }
            saida.newLine();
            conjunto.clear();
            linha = entrada.readLine();
        }
        saida.flush();
    }
    
    public static void subs(char[] letras, int i1, int f1, int i2, int f2) {
        if (i1 != f1) {
            String a = new String(letras, i1, f1 - i1);
        }
    }
}
