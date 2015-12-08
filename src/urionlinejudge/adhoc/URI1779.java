/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge.adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1779
 *
 * @author felipe.santos
 */
public class URI1779 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdCasos = Integer.parseInt(linha);
        for (int i = 0; i < qtdCasos; i++) {
            linha = entrada.readLine();
            int qtdProvas = Integer.parseInt(linha);
            linha = entrada.readLine();
            String vet[] = linha.split(" ");
            //transformar o vetor em ints
            //fazer a media geral
            int tmp = Integer.parseInt(vet[0]);
            int maiorValor = tmp;
            int contMaiorSeq = 1;
            int contAtual = 1;
            int anterior = tmp;
            for (int j = 1; j < qtdProvas; j++) {
                tmp = Integer.parseInt(vet[j]);
                if (tmp == anterior) {
                    contAtual++;
                    if (tmp == maiorValor && contAtual > contMaiorSeq) {
                        contMaiorSeq = contAtual;
                    }
                } else if (tmp > maiorValor) {
                    maiorValor = tmp;
                    contMaiorSeq = 1;
                    contAtual = 1;
                } else {
                    contAtual = 1;
                }
                anterior = tmp;
            }
            saida.write("Caso #" + (i + 1) + ": " + contMaiorSeq + "\n");
        }
        saida.flush();
    }
}
