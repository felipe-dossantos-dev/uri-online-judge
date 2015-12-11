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
                new FileInputStream("C:\\Users\\felipe.santos\\Documents\\entrada.txt")));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (linha != null) {
            String vet[] = linha.split(" ");
            int numPalavras = Integer.parseInt(vet[0]);
            int numMaxLinhasPorPag = Integer.parseInt(vet[1]);
            int numMaxCharPorLinha = Integer.parseInt(vet[2]);
            
            linha = entrada.readLine();
            int qtdCharsLinha = 0;
            int qtdCharsPalavra = 0;
            int qtdLinha = 0;
            int qtdPag = 1;
            for (char c : linha.toCharArray()) {
                if (c == ' ') {
                    if (qtdCharsPalavra + qtdCharsLinha <= numMaxCharPorLinha) {
                        
                    } else {
                        
                    }
                    qtdCharsPalavra = 0;
                } else {
                    qtdCharsPalavra++;
                }
            }
            saida.write(qtdPag + "\n");
            linha = entrada.readLine();
        }
        saida.flush();
    }
}
