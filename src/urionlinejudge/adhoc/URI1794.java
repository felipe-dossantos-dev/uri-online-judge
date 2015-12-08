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
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1794
 *
 * @author felipe.santos
 */
public class URI1794 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int n = Integer.parseInt(linha);
        linha = entrada.readLine();
        String vet[] = linha.split(" ");
        int la = Integer.parseInt(vet[0]);
        int lb = Integer.parseInt(vet[1]);
        linha = entrada.readLine();
        vet = linha.split(" ");
        int sa = Integer.parseInt(vet[0]);
        int sb = Integer.parseInt(vet[1]);
        if (n < la || n > lb || n < sa || n > sb) {
            saida.write("impossivel\n");
        } else {
            saida.write("possivel\n");
        }
        saida.flush();
    }
}
