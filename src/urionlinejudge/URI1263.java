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
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1263
 *
 * @author felipe.santos
 */
public class URI1263 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (linha != null) {
            int contAliteracao = 0;
            boolean jaContou = false;
            String vet[] = linha.split(" ");
            String primeiraLetraAnterior = "*";
            for (String palavra : vet) {
                if (palavra.startsWith(primeiraLetraAnterior)) {
                    if (!jaContou) {
                        contAliteracao++;
                    }
                    jaContou = true;
                } else {
                    primeiraLetraAnterior = palavra.substring(0, 1).toLowerCase();
                    jaContou = false;
                }
            }
            saida.write(contAliteracao + "\n");
            linha = entrada.readLine();
        }
        saida.flush();
    }
}
