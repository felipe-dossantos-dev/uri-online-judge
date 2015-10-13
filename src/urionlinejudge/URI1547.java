package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1547
 * @author felipe
 */
public class URI1547 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        int qtdTestes = Integer.parseInt(entrada.readLine());
        while (qtdTestes != 0) {
            String linha = entrada.readLine();
            String vet[] = linha.split(" ");
            int qtdAlunos = Integer.parseInt(vet[0]);
            int secreto = Integer.parseInt(vet[1]);
            int distMenor = Integer.MAX_VALUE;
            int posMenor = -1;
            linha = entrada.readLine();
            vet = linha.split(" ");
            for (int i = 0; i < qtdAlunos; i++) {
                int atual = Integer.parseInt(vet[i]);
                int a = Math.abs(secreto - atual);
                if (a < distMenor) {
                    distMenor = a;
                    posMenor = i + 1;
                }
            }
            saida.write(posMenor+"\n");
            qtdTestes--;
        }
        saida.flush();
    }
}
