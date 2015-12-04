package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdTestes = Integer.parseInt(linha);
        while (qtdTestes != 0) {
            for (int i = 0; i < qtdTestes; i++) {
                linha = entrada.readLine();
                String vet[] = linha.split(" ");
                
            }

            linha = entrada.readLine();
            qtdTestes = Integer.parseInt(linha);
        }
        saida.flush();
    }
}
