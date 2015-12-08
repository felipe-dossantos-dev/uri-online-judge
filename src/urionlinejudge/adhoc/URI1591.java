package urionlinejudge.adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1591
 *
 * @author felipe
 */
public class URI1591 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        int qtdCasos = Integer.parseInt(entrada.readLine());
        for (int i = 0; i < qtdCasos; i++) {
            String linha = entrada.readLine();
            String vet[] = linha.split(" ");
            int lin = Integer.parseInt(vet[0]);
            int col = Integer.parseInt(vet[1]);
            char matriz[][] = new char[lin][col];
            for (int j = 0; j < lin; j++) {
                linha = entrada.readLine();
                matriz[j] = linha.toCharArray();
            }
            linha = entrada.readLine();
            int palavras = Integer.parseInt(linha);
            char palavra[];
            for (int j = 0; j < palavras; j++) {
                int contPal = 0;
                int pos = 0;
                linha = entrada.readLine();
                int posMax = linha.length();
                palavra = linha.toCharArray();
                //procurar horizontal
                int m;
                for (int k = 0; k < lin; k++) {
                    for (int l = 0; l < col; l++) {
                        pos = 0;
                        for (m = l; m < col && pos < posMax; m++) {
                            if (matriz[k][m] != palavra[pos]) {
                                break;
                            } else {
                                pos++;
                            }
                        }
                        if (pos == posMax) {
                            contPal++;
                        }
                    }
                }
                //procurar vertical
                for (int k = 0; k < col; k++) {
                    for (int l = 0; l < lin; l++) {
                        pos = 0;
                        for (m = l; m < lin && pos < posMax; m++) {
                            if (matriz[m][k] != palavra[pos]) {
                                break;
                            } else {
                                pos++;
                            }
                        }
                        if (pos == posMax) {
                            contPal++;
                        }
                    }
                }
                if (posMax == 1) {
                    contPal /= 2;
                }
                saida.write(contPal + "\n");
            }
        }
        saida.flush();
    }
}
