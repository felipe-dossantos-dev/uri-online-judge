/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1911
 * @author felipe.santos
 */
public class URI1911 {
     public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        int qtdAlunos = entrada.nextInt();
        Map<String, String> mapa = new HashMap<>();
        while (qtdAlunos != 0) {
            for (int i = 0; i < qtdAlunos; i++) {
                mapa.put(entrada.next(), entrada.next());
            }
            int qtdAssinaturas = entrada.nextInt();
            int qtdFalsas = 0;
            for (int i = 0; i < qtdAssinaturas; i++) {
                String assinatura = mapa.get(entrada.next());
                String a = entrada.next();
                int diffs = 0;
                for (int j = 0; j < assinatura.length(); j++) {
                    char cNome = assinatura.charAt(j);
                    char cAssinado = a.charAt(j);
                    if (cNome != cAssinado) diffs++;
                }
                if (diffs > 1) qtdFalsas++;
            }
            saida.write(qtdFalsas + "\n");
            qtdAlunos = entrada.nextInt();
            mapa.clear();
        }
        saida.flush();
    }
}
