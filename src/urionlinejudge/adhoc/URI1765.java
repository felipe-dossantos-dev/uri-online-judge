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
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1765
 *
 * @author felipe
 */
public class URI1765 {

    public static void main(String[] args) throws Exception, IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        int t = Integer.parseInt(entrada.readLine());
        while (t != 0) {
            for (int i = 0; i < t; i++) {
                String linha = entrada.readLine();
                String vet[] = linha.split(" ");
                double q = Double.parseDouble(vet[0]);
                double bme = Double.parseDouble(vet[1]);
                double bma = Double.parseDouble(vet[2]);
                double res = q * (((bme + bma) * 5) / 2);
                saida.write("Size #" + (i + 1) + ":\n");
                saida.write(String.format("Ice Cream Used: %.2f cm2\n", res));
            }
            saida.newLine();
            t = Integer.parseInt(entrada.readLine());
        }
        saida.flush();
    }
}
