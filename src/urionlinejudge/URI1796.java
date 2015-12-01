/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge;

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
public class URI1796 {
     public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtd = Integer.parseInt(linha);
        linha = entrada.readLine();
        String vet[] = linha.split(" ");
        int contagem = 0;
        for (int i = 0; i < qtd; i++) {
            if (vet[i].equals("1")) {
                contagem--;
            } else {
                contagem++;
            }
        }
        if (contagem > 0) {
            saida.write("Y\n");
        } else {
            saida.write("N\n");
        }
        saida.flush();
    }
}
