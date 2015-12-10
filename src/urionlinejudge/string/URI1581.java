package urionlinejudge.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class URI1581 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdTestes = Integer.parseInt(linha);
        Set<String> conj = new HashSet<>();
        for (int i = 0; i < qtdTestes; i++) {
            linha = entrada.readLine();
            int qtdLinhas = Integer.parseInt(linha);
            for (int j = 0; j < qtdLinhas; j++) {
                linha = entrada.readLine();
                conj.add(linha);
            }
            if (conj.size() == 1) {
                for (String conj1 : conj) {
                    saida.write(conj1);
                }
            } else {
                saida.write("ingles");
            }
            saida.newLine();
            conj.clear();
        }
        saida.flush();
    }
}
