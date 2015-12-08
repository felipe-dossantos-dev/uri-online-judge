package urionlinejudge.adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1728
 *
 * @author felipe
 */
public class URI1728 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (!linha.equals("0+0=0")) {
            String vet[] = linha.split("[+=]");
            for (int i = 0; i < vet.length; i++) {
                String tmp = vet[i];
                String nova = "";
                for (int j = tmp.length() - 1; j >= 0; j--) {
                    nova += tmp.charAt(j);
                }
                vet[i] = nova;
            }
            int a = Integer.parseInt(vet[0]);
            int b = Integer.parseInt(vet[1]);
            int c = Integer.parseInt(vet[2]);
            if (a + b == c) {
                saida.write("True\n");
            } else {
                saida.write("False\n");
            }
            linha = entrada.readLine();
        }
        saida.write("True\n");
        saida.flush();
    }
}
