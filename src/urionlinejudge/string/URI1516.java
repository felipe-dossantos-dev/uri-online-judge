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
public class URI1516 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        String vet[] = linha.split(" ");
        int n = Integer.parseInt(vet[0]);
        int m = Integer.parseInt(vet[1]);
        while (n != 0 && m != 0) {
            char[][] desenho = new char[n][m];
            for (int i = 0; i < n; i++) {
                desenho[i] = entrada.readLine().toCharArray();
            }
            linha = entrada.readLine();
            vet = linha.split(" ");
            int a = Integer.parseInt(vet[0]);
            int b = Integer.parseInt(vet[1]);

            int multplicadorColuna = b / m;
            int multplicadorLinha = a / n;

            String retorno = "";

            for (int i = 0; i < n; i++) {
                String novaLinha = "";
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < multplicadorColuna; k++) {
                        novaLinha += desenho[i][j];
                    }
                }
                novaLinha += "\n";
                for (int j = 0; j < multplicadorLinha; j++) {
                    retorno += novaLinha;
                }
            }
            saida.write(retorno);
            saida.newLine();
            linha = entrada.readLine();
            vet = linha.split(" ");
            n = Integer.parseInt(vet[0]);
            m = Integer.parseInt(vet[1]);
        }
        saida.flush();
    }
}
