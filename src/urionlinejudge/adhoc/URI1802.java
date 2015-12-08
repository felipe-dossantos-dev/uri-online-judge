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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1802
 *
 * @author felipe.santos
 */
public class URI1802 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));

        String linha = entrada.readLine();
        String vet[] = linha.split(" ");
        List<Integer> listaPortugues = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaPortugues.add(new Integer(vet[i]));
        }

        linha = entrada.readLine();
        vet = linha.split(" ");
        List<Integer> listaMatematica = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaMatematica.add(new Integer(vet[i]));
        }

        linha = entrada.readLine();
        vet = linha.split(" ");
        List<Integer> listaFisica = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaFisica.add(new Integer(vet[i]));
        }

        linha = entrada.readLine();
        vet = linha.split(" ");
        List<Integer> listaQuimica = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaQuimica.add(new Integer(vet[i]));
        }

        linha = entrada.readLine();
        vet = linha.split(" ");
        List<Integer> listaBiologia = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaBiologia.add(new Integer(vet[i]));
        }

        List<Integer> listaConjuntos = new ArrayList<>();

        for (Integer bio : listaBiologia) {
            for (Integer fis : listaFisica) {
                for (Integer mat : listaMatematica) {
                    for (Integer por : listaPortugues) {
                        for (Integer quim : listaQuimica) {
                            int soma = bio + fis + mat + por + quim;
                            listaConjuntos.add(soma);
                        }
                    }
                }
            }
        }
        Collections.sort(listaConjuntos, Collections.reverseOrder());
        int soma = 0;
        int iteracoes = Integer.parseInt(entrada.readLine());
        for (int i = 0; i < iteracoes; i++) {
            soma += listaConjuntos.get(i);
        }
        System.out.println(soma);
        saida.flush();
    }
}
