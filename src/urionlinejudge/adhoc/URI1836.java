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
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1836
 *
 * @author felipe.santos
 */
public class URI1836 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));

        String linha = entrada.readLine();
        int qtdTestes = Integer.parseInt(linha);
        for (int i = 0; i < qtdTestes; i++) {
            linha = entrada.readLine();
            String vet[] = linha.split(" ");
            String nome = vet[0];
            int level = Integer.parseInt(vet[1]);
            int hp = (int) calcularHP(entrada.readLine(), level);
            int at = (int) calcularS(entrada.readLine(), level);
            int df = (int) calcularS(entrada.readLine(), level);
            int sp = (int) calcularS(entrada.readLine(), level);
            saida.write("Caso #" + (i + 1) + ": " + nome + " nivel " + level + "\n");
            saida.write("HP: " + hp + "\n");
            saida.write("AT: " + at + "\n");
            saida.write("DF: " + df + "\n");
            saida.write("SP: " + sp + "\n");
        }
        saida.flush();
    }

    public static double calcularS(String linha, int level) {
        String vet[] = linha.split(" ");
        double bs = Double.parseDouble(vet[0]);
        double vi = Double.parseDouble(vet[1]);
        double ev = Double.parseDouble(vet[2]);
        double valor = (vi + bs + Math.sqrt(ev) / 8) * level / 50 + 5;
        return valor;
    }

    public static double calcularHP(String linha, int level) {
        String vet[] = linha.split(" ");
        double bs = Double.parseDouble(vet[0]);
        double vi = Double.parseDouble(vet[1]);
        double ev = Double.parseDouble(vet[2]);
        double valor = (vi + bs + Math.sqrt(ev) / 8 + 50) * level / 50 + 10;
        return valor;
    }
}
