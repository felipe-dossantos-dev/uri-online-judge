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
public class URI1309 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (linha != null) {
            int inteira = Integer.parseInt(linha);
            linha = entrada.readLine();
            int decimal = Integer.parseInt(linha);
            String formatada = "";
            while (inteira > 999) {
                int tres = inteira % 1000;
                if (tres < 10) {
                    formatada = ",00" + tres + formatada;
                } else if (tres < 100) {
                    formatada = ",0" + tres + formatada;
                } else {
                    formatada = "," + tres + formatada;
                }
                inteira /= 1000;
            }
            formatada = "$" + inteira + formatada + "."
                    + String.format("%02d", decimal);
            saida.write(formatada);
            saida.newLine();
            linha = entrada.readLine();
        }
        saida.flush();
    }
}
