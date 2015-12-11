package urionlinejudge.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class URI1768 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (linha != null) {
            int tamanhoArvore = Integer.parseInt(linha);
            for (int i = 1; i <= tamanhoArvore; i += 2) {
                int qtdEspacos = (tamanhoArvore - i) / 2;
                if (i == 1 && tamanhoArvore == 2) {
                    qtdEspacos = 1;
                }
                for (int j = 0; j < qtdEspacos; j++) {
                    saida.write(' ');
                }
                for (int j = 0; j < i; j++) {
                    saida.write('*');
                }
                saida.newLine();
            }
            //base
            int posicaoBase = (tamanhoArvore) / 2;
            for (int i = 0; i < posicaoBase; i++) {
                saida.write(' ');
            }
            saida.write('*');
            saida.newLine();
            posicaoBase -= 1;
            for (int i = 0; i < posicaoBase; i++) {
                saida.write(' ');
            }
            for (int i = 0; i < 3; i++) {
                saida.write('*');
            }
            linha = entrada.readLine();
            saida.newLine();
            saida.newLine();
        }
        saida.flush();
    }
}
