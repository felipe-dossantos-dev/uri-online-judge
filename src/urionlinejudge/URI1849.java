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
public class URI1849 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));

        String linha = entrada.readLine();
        String vet[] = linha.split(" ");
        int vals[] = new int[4];
        for (int i = 0; i < 4; i++) {
            vals[i] = Integer.parseInt(vet[i]);
        }
        int maior = 1;
        int lado1 = vals[0] + vals[2];
        int lado2 = Math.min(vals[1], vals[3]);
        int min = Math.min(lado1, lado2);
        if (min > maior) {
            maior = min;
        }
        lado1 = vals[0] + vals[3];
        lado2 = Math.min(vals[1], vals[2]);
        min = Math.min(lado1, lado2);
        if (min > maior) {
            maior = min;
        }
        
        lado1 = vals[0] + vals[3];
        lado2 = Math.min(vals[1], vals[2]);
        min = Math.min(lado1, lado2);
        if (min > maior) {
            maior = min;
        }
        
        lado1 = vals[1] + vals[2];
        lado2 = Math.min(vals[0], vals[3]);
        min = Math.min(lado1, lado2);
        if (min > maior) {
            maior = min;
        }
        
        lado1 = vals[1] + vals[3];
        lado2 = Math.min(vals[0], vals[2]);
        min = Math.min(lado1, lado2);
        if (min > maior) {
            maior = min;
        }
        System.out.println(maior * maior);
        //saida.flush();
    }
}
