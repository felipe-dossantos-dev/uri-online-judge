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
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author felipe
 */
public class URI1367 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdTestes = Integer.parseInt(linha);
        Map<String, Integer> mapa = new HashMap<>();
        while (qtdTestes != 0) {
            int qtdAcertos = 0;
            int qtdTempo = 0;
            for (int i = 0; i < qtdTestes; i++) {
                linha = entrada.readLine();
                String vet[] = linha.split(" ");
                //0 - ident
                //1 - tempo
                //2 - correct or incorrect
                if (vet[2].equals("correct")) {
                    qtdAcertos++;
                    qtdTempo += Integer.parseInt(vet[1]);
                    if (mapa.containsKey(vet[0])) {
                        qtdTempo += mapa.get(vet[0]);
                    }
                } else {
                    if (mapa.containsKey(vet[0])) {
                        mapa.put(vet[0], mapa.get(vet[0]) + 20);
                    } else {
                        mapa.put(vet[0], 20);
                    }
                }
            }
            saida.write(qtdAcertos + " " + qtdTempo + "\n");
            linha = entrada.readLine();
            qtdTestes = Integer.parseInt(linha);
            mapa.clear();
        }
        saida.flush();
    }
}
