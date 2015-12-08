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
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1873
 *
 * @author felipe.santos
 */
public class URI1873 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        int qtdCasos = Integer.parseInt(entrada.readLine());
        Map<String, String[]> mapa = gerarMapa();
        while (qtdCasos != 0) {
            String linha = entrada.readLine();
            String vet[] = linha.split(" ");
            if (vet[0].equals(vet[1])) {
                saida.write("empate\n");
            } else {
                boolean rajeshGanhou = false;
                boolean sheldonGanhou = false;
                String rajeshGanha[] = mapa.get(vet[0]);
                for (String ganha : rajeshGanha) {
                    if (vet[1].equals(ganha) && !rajeshGanhou) {
                        rajeshGanhou = true;
                    }
                }
                if (!rajeshGanhou) {
                    String sheldonGanha[] = mapa.get(vet[1]);
                    for (String ganha : sheldonGanha) {
                        if (vet[0].equals(ganha) && !sheldonGanhou) {
                            sheldonGanhou = true;
                        }
                    }
                }
                if (rajeshGanhou == sheldonGanhou) {
                    saida.write("empate\n");
                }
                if (rajeshGanhou) {
                    saida.write("rajesh\n");
                }
                if (sheldonGanhou) {
                    saida.write("sheldon\n");
                }
            }
            qtdCasos--;
        }

        saida.flush();
    }

    public static Map<String, String[]> gerarMapa() {
        Map<String, String[]> mapa = new HashMap<>();
        String vet[] = {"papel", "lagarto"};
        mapa.put("tesoura", vet);
        String vet2[] = {"pedra", "spock"};
        mapa.put("papel", vet2);
        String vet3[] = {"lagarto", "tesoura"};
        mapa.put("pedra", vet3);
        String vet4[] = {"spock", "papel"};
        mapa.put("lagarto", vet4);
        String vet5[] = {"pedra", "tesoura"};
        mapa.put("spock", vet5);
        return mapa;
    }
}
