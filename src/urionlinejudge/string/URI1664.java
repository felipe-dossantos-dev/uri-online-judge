package urionlinejudge.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class URI1664 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int contPalavras = 0;
        int contBullshit = 0;
        Set<String> conj = new HashSet<>();
        while (linha != null) {
            linha = linha.toUpperCase();
            String vet[] = linha.split("[^A-Za-z]+");
            for (String vet1 : vet) {
                if (!vet1.isEmpty()) {
                    if (vet1.contains("BULLSHIT")) {
                        contBullshit++;
                        contPalavras += conj.size();
                        conj.clear();
                    } else {
                        conj.add(vet1);
                    }
                }
            }
            linha = entrada.readLine();
        }
        //fracao
        int maior = Math.max(contBullshit, contPalavras);
        int div = 1;
        for (int i = 2; i < maior; i++) {
            if (contBullshit % i == 0 && contPalavras % i == 0) {
                div = i;
            }
        }
        contBullshit /= div;
        contPalavras /= div;

        saida.write(contPalavras + " / " + contBullshit);
        saida.newLine();
        saida.flush();
    }
}
