package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1787
 *
 * @author felipe.santos
 */
public class URI1787 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdRodadas = Integer.parseInt(linha);
        while (qtdRodadas != 0) {
            int uilton = 0;
            int rita = 0;
            int ingred = 0;
            int uiltonPontos = 0;
            int ritaPontos = 0;
            int ingredPontos = 0;
            for (int i = 0; i < qtdRodadas; i++) {
                linha = entrada.readLine();
                String vet[] = linha.split(" ");
                uilton = Integer.parseInt(vet[0]);
                rita = Integer.parseInt(vet[1]);
                ingred = Integer.parseInt(vet[2]);
                int max = Math.max(uilton, Math.max(rita, ingred));
                if (isPotencia2(uilton)) {
                    uiltonPontos++;
                    if (max == uilton) {
                        uiltonPontos++;
                    }
                }
                if (isPotencia2(rita)) {
                    ritaPontos++;
                    if (max == rita) {
                        ritaPontos++;
                    }
                }
                if (isPotencia2(ingred)) {
                    ingredPontos++;
                    if (max == ingred) {
                        ingredPontos++;
                    }
                }
            }
            int max = Math.max(uiltonPontos, Math.max(ritaPontos, ingredPontos));
            if ((max == uiltonPontos && max == ritaPontos)
                    || (max == uiltonPontos && max == ingredPontos)
                    || (max == ingredPontos && max == ritaPontos)) {
                saida.write("URI");
            } else if (max == uiltonPontos) {
                saida.write("Uilton");
            } else if (max == ritaPontos) {
                saida.write("Rita");
            } else if (max == ingredPontos) {
                saida.write("Ingred");
            }
            saida.newLine();
            linha = entrada.readLine();
            qtdRodadas = Integer.parseInt(linha);
        }
        saida.flush();
    }

    public static boolean isPotencia2(int num) {
        if (num == 1) {
            return false;
        }
        double log = Math.log(num) / Math.log(2);
        double pow = Math.pow(2, Math.round(log));
        return pow == num;
    }
}
