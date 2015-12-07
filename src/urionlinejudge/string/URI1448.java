package urionlinejudge.string;

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
public class URI1448 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdTestes = Integer.parseInt(linha);
        for (int i = 0; i < qtdTestes; i++) {
            String fraseCorreta = entrada.readLine();
            String time1 = entrada.readLine();
            String time2 = entrada.readLine();
            int acertosTime1 = contarCoincidenciasLetras(fraseCorreta, time1);
            int acertosTime2 = contarCoincidenciasLetras(fraseCorreta, time2);
            saida.write("Instancia " + (i + 1) + "\n");
            if (acertosTime1 > acertosTime2) {
                saida.write("time 1\n");
            } else if (acertosTime2 > acertosTime1) {
                saida.write("time 2\n");
            } else {
                int timeVencedor = criterioDesempatePrimeiroErroNaoReincidente(
                        fraseCorreta, 
                        time1, 
                        time2);
                if (timeVencedor == 1) {
                    saida.write("time 1\n");
                } else if (timeVencedor == 2) {
                    saida.write("time 2\n");
                } else {
                    saida.write("empate\n");
                }
            }
            saida.newLine();
        }
        saida.flush();
    }

    public static int contarCoincidenciasLetras(String fraseCorreta, String frase) {
        int coincidencias = 0;
        char[] letrasCorretas = fraseCorreta.toCharArray();
        char[] letras = frase.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letrasCorretas[i]) {
                coincidencias++;
            }
        }
        return coincidencias;
    }

    public static int criterioDesempatePrimeiroErroNaoReincidente(String fraseCorreta,
            String time1, String time2) {
        char[] letrasCorretas = fraseCorreta.toCharArray();
        char[] letrasTime1 = time1.toCharArray();
        char[] letrasTime2 = time2.toCharArray();
        for (int i = 0; i < letrasCorretas.length; i++) {
            if (letrasCorretas[i] == letrasTime1[i]
                    && letrasCorretas[i] != letrasTime2[i]) {
                return 1;
            }
            if (letrasCorretas[i] == letrasTime2[i]
                    && letrasCorretas[i] != letrasTime1[i]) {
                return 2;
            }
        }
        return -1;
    }
}
