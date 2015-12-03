package urionlinejudge.adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 *
 * @author felipe.santos
 */
public class URI1953 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (linha != null) {
            int epr = 0;
            int ehd = 0;
            int outros = 0;
            int qtd = Integer.parseInt(linha);
            for (int i = 0; i < qtd; i++) {
                linha = entrada.readLine();
                String vet[] = linha.split(" ");
                if (vet[1].equals("EPR")) {
                    epr++;
                } else if (vet[1].equals("EHD")) {
                    ehd++;
                } else {
                    outros++;
                }
            }
            saida.write("EPR: " + epr + "\n");
            saida.write("EHD: " + ehd + "\n");
            saida.write("INTRUSOS: " + outros + "\n");
            linha = entrada.readLine();
        }
        saida.flush();
    }
}
