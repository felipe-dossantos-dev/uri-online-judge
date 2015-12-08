package urionlinejudge.adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1612
 * @author felipe
 */
public class URI1612 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        int qtdCasos = Integer.parseInt(entrada.readLine());
        for (int i = 0; i < qtdCasos; i++) {
            int a = Integer.parseInt(entrada.readLine());
            a = (a + 1)/2;
            saida.write(a + "\n");
        }
        saida.flush();
    }
}
