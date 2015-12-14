package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
//        BufferedReader entrada = new BufferedReader(new InputStreamReader(
//                System.in));
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                new FileInputStream("/home/felipe/entradas.txt")));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (linha != null) {
            String vet[] = linha.split(" ");
            int numMaxLinhasPorPag = Integer.parseInt(vet[1]);
            int numMaxCharPorLinha = Integer.parseInt(vet[2]);
            linha = entrada.readLine();
            int qtdCharsLinha = 0;
            int qtdCharsPalavra = 0;
            int qtdLinha = 1;
            int qtdPag = 1;
            for (char c : linha.toCharArray()) {
                if (c == ' ') {
                    if (qtdCharsPalavra + qtdCharsLinha + 1 <= numMaxCharPorLinha) {
                        qtdCharsLinha += qtdCharsPalavra + 1;
                    } else if (qtdCharsPalavra + qtdCharsLinha <= numMaxCharPorLinha) {
                        qtdCharsLinha += qtdCharsPalavra;
                    } else {
                        qtdLinha++;
                        qtdCharsLinha = qtdCharsPalavra + 1;
                    }
                    qtdCharsPalavra = 0;
                } else {
                    qtdCharsPalavra++;
                }
                //linha 39 eh maior que numMaxCharsPorLinha
                if (qtdCharsLinha > numMaxCharPorLinha) {
                    qtdLinha++;
                    qtdCharsLinha = Math.max(qtdCharsLinha - numMaxCharPorLinha, 0);
                } 
                if (qtdCharsLinha == numMaxCharPorLinha) {
                    qtdLinha++;
                    qtdCharsLinha = 0;
                }
                if (qtdLinha > numMaxLinhasPorPag) {
                    qtdLinha = 1;
                    qtdPag++;
                }
            }
            if (qtdCharsPalavra + qtdCharsLinha > numMaxCharPorLinha) {
                qtdLinha++;
            }
            if (qtdLinha > numMaxLinhasPorPag) {
                qtdPag++;
            }
            saida.write(qtdPag + "\n");
            linha = entrada.readLine();
        }
        saida.flush();
    }
}
