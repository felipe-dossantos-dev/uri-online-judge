package urionlinejudge.adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1585
 * @author felipe
 */
public class URI1585 {
     
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
            int x = Integer.parseInt(vet[0]);
            int y = Integer.parseInt(vet[1]);
            int res = x * y / 2;
            saida.write(res + " cm2\n");
        }
        saida.flush();
    }
    
}
