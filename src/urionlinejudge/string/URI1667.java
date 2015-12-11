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
 * @author felipe
 */
public class URI1667 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        boolean pulouLinha = true;
        int tamanhoLinha = 0;
        while (linha != null) {
            String[] tokens = linha.split("\\s+");
            for (int j = 0; j < tokens.length; j++) {
                String token = tokens[j];
                if (!token.isEmpty()) {
                    if (token.equals("<br>")) {
                        saida.newLine();
                        pulouLinha = true;
                        tamanhoLinha = 0;
                    } else if (token.equals("<hr>")) {
                        if (!pulouLinha) {
                            saida.newLine();
                            pulouLinha = true;
                        }
                        for (int i = 0; i < 80; i++) {
                            saida.write("-");
                        }
                        saida.newLine();
                        tamanhoLinha = 0;
                    } else {
                        tamanhoLinha += token.length();
                        if (tamanhoLinha >= 80) {
                            saida.newLine();
                            tamanhoLinha = token.length();
                            pulouLinha = true;
                        }
                        if (!pulouLinha) {
                            saida.write(" ");
                            tamanhoLinha++;
                        }
                        saida.write(token);
                        pulouLinha = false;
                    }
                }
            }
            linha = entrada.readLine();
        }
        saida.newLine();
        saida.flush();
    }
}
