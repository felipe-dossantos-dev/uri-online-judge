package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1574
 * @author felipe
 */
public class URI1574 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        int teste = Integer.parseInt(entrada.readLine());
        for (int i = teste; i > 0; i--) {
            int qtdMov = Integer.parseInt(entrada.readLine());
            int pos = 0;
            String vet[] = new String[qtdMov + 1];
            for (int j = 0; j < qtdMov; j++) {
                String linha = entrada.readLine();
                vet[j] = linha;
                while (!linha.equals("LEFT") && !linha.equals("RIGHT")) {
                    String todos[] = linha.split(" ");
                    linha = todos[todos.length - 1];
                    int a = Integer.parseInt(linha) - 1;
                    linha = vet[a];
                }
                if (linha.contains("LEFT")) {
                    pos--;
                } else if (linha.contains("RIGHT")) {
                    pos++;
                }

            }
            saida.write(pos + "\n");
        }
        saida.flush();
    }
}
