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
public class URI1867 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        String vet[] = linha.split(" ");
        while (!vet[0].equals("0") || !vet[1].equals("0")) {
            long a = numeroEmUmAlgarismo(vet[0]);
            long b = numeroEmUmAlgarismo(vet[1]);
            if (a > b) {
                saida.write("1");
            } else if (a < b) {
                saida.write("2");
            } else {
                saida.write("0");
            }
            saida.newLine();
            linha = entrada.readLine();
            vet = linha.split(" ");
        }
        saida.flush();
    }

    public static long numeroEmUmAlgarismo(String valor) {
        char[] algarismos = valor.toCharArray();
        long soma = 0;
        for (int i = 0; i < algarismos.length; i++) {
            soma += algarismos[i] - '0';
        }
        while (soma > 9) {
            long tmp = 0;
            while (soma > 0) {
                tmp += soma % 10;
                soma /= 10;
            }
            soma = tmp;
        }
        return soma;
    }
}
