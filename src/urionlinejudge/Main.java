package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
//        BufferedReader entrada = new BufferedReader(new InputStreamReader(
//                new FileInputStream("/home/felipe/entradas.txt")));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        List<String> lista = new ArrayList<>();
        while (linha != null) {
            lista.add(linha);
            linha = entrada.readLine();
        }
        Collections.sort(lista, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        saida.write(lista.get(0));
        saida.newLine();
        saida.flush();
    }
}
