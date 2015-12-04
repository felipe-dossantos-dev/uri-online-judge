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
        //1272
        String linha = entrada.readLine();
        int qtdTeste = Integer.parseInt(linha);
        for (int i = 0; i < qtdTeste; i++) {
            linha = entrada.readLine();
            String vet[] = linha.split("\\s+");
            String ret = "";
            for (int j = 0; j < vet.length; j++) {
                if (vet[j].length() > 0) {
                    ret += vet[j].substring(0, 1);
                }
            }
            saida.write(ret);
            saida.newLine();
        }
        saida.flush();
    }
}
