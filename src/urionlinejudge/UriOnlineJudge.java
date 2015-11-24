package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1779
 * @author felipe.santos
 */
public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        int qtdCasos = Integer.parseInt(linha);
        for (int i = 0; i < qtdCasos; i++) {
            linha = entrada.readLine();
            int qtdProvas = Integer.parseInt(linha);
            linha = entrada.readLine();
            String vet[] = linha.split(" ");
            //transformar o vetor em ints
            //fazer a media geral
            int maiorValor = 0;
            int contMaiorSeq = 0;
            int contAtual = 1;
            int anterior = -1;
            int tmp = -1;
            for (int j = 0; j < qtdProvas; j++) {
                tmp = Integer.parseInt(vet[j]);
                if (tmp != anterior) {
                    if (tmp > maiorValor) {
                        maiorValor = tmp;
                        contMaiorSeq = contAtual;
                    } else if (anterior == maiorValor) {
                        contMaiorSeq = contAtual;
                    }
                    contAtual = 1;
                } else {
                    contAtual++;
                }
                anterior = tmp;
            }
            if (tmp == maiorValor && contAtual > contMaiorSeq) {
                contMaiorSeq = contAtual;
            }
            saida.write("Caso #" + (i + 1) + ": " + contMaiorSeq + "\n");
        }
        saida.flush();
    }
}
