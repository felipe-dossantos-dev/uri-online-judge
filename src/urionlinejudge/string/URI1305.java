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
public class URI1305 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        //
        String linha = entrada.readLine();
        while (linha != null) {
            double num = Double.parseDouble(linha);
            linha = entrada.readLine();
            double cutoff = Double.parseDouble(linha);
            int numInt = (int) num;
            if (num - numInt > cutoff) {
                numInt++;
            }
            saida.write(numInt + "\n");
            linha = entrada.readLine();
        }
        saida.flush();
    }
}
