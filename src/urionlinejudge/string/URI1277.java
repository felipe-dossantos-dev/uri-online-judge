/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge.string;

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
public class URI1277 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        //1277
        String linha = entrada.readLine();
        int qtdTeste = Integer.parseInt(linha);
        for (int i = 0; i < qtdTeste; i++) {
            linha = entrada.readLine();
            int qtdAlunos = Integer.parseInt(linha);
            linha = entrada.readLine();
            String nomes[] = linha.split(" ");
            linha = entrada.readLine();
            String presencas[] = linha.split(" ");
            String resp = "";
            for (int j = 0; j < qtdAlunos; j++) {
                char[] presenca = presencas[j].toCharArray();
                int qtdPresenca = 0;
                int qtdAtestado = 0;
                for (char q : presenca) {
                    if (q == 'P') {
                        qtdPresenca++;
                    }
                    if (q == 'M') {
                        qtdAtestado++;
                    }
                }
                if (((double) qtdPresenca) / (presenca.length - qtdAtestado) < 0.75) {
                    resp += nomes[j] + " ";
                }
            }
            if (resp.length() > 1) {
                resp = resp.substring(0, resp.length() - 1);
            }
            saida.write(resp);
            saida.newLine();
        }
        saida.flush();
    }
}
