package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
//        BufferedReader entrada = new BufferedReader(new InputStreamReader(
//                System.in));
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\felipe.santos\\Documents\\entrada.txt")));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int contPalavras = 0;
        int contBullshit = 0;
        Set<String> conj = new HashSet<>();
        while (linha != null) {
            linha = linha.toUpperCase();
            String vet[] = linha.split("\\W+");
            for (String vet1 : vet) {
                if (vet1.contains("BULLSHIT")) {
                    contBullshit++;
                    contPalavras += conj.size();
                    conj.clear();
                } else if (!vet1.isEmpty()){
                    conj.add(vet1);
                }
            }
            linha = entrada.readLine();
        }
        //fracao
        int menor = Math.min(contBullshit, contPalavras);
        while (contBullshit % menor != 0 || contPalavras % menor != 0) {
            menor--;
        }
        contBullshit /= menor;
        contPalavras /= menor;
        saida.write(contPalavras + " / " + contBullshit);
        saida.newLine();
        saida.flush();
    }
}
