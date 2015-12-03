package urionlinejudge.adhoc;

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
public class URI1943 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int a = Integer.parseInt(linha);
        saida.write("Top ");
        if (a == 1) {
            saida.write("1");
        } else if (a <= 3) {
            saida.write("3");
        } else if (a <= 5) {
            saida.write("5");
        } else if (a <= 10) {
            saida.write("10");
        } else if (a <= 25) {
            saida.write("25");
        } else if (a <= 50) {
            saida.write("50");
        } else {
            saida.write("100");
        }
        saida.newLine();
        saida.flush();
    }
}
