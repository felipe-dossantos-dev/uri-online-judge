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
public class URI1893 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        String vet[] = linha.split(" ");
        int a = Integer.parseInt(vet[0]);
        int b = Integer.parseInt(vet[1]);
        if (b <= 2) {
            saida.write("nova");
        } else if (b >= 97) {
            saida.write("cheia");
        } else {
            if (a > b) {
                saida.write("minguante");
            } else {
                saida.write("crescente");
            }
        }
        saida.newLine();
        saida.flush();
    }
}
