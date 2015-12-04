package urionlinejudge.adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1945
 * @author felipe.santos
 */
public class URI1945 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        //1945
        String linha = entrada.readLine();
        Map<String, Integer> mapa = new HashMap<>();
        int soma = 0;
        while (linha != null) {
            String vet[] = linha.split(" := ");
            if (vet[1].contains("+")) {
                //to numa soma
                String vars[] = vet[1].split("\\s\\+\\s");
                soma = 0;
                for (String var : vars) {
                    if (var.matches("\\d+")) {
                        soma += Integer.parseInt(var);
                    } else {
                        soma += mapa.get(var);
                    }
                    mapa.put(vet[0], soma);
                }
            } else {
                //atribuicao
                //a := 21
                soma = Integer.parseInt(vet[1]);
                mapa.put(vet[0], soma);
            }
            linha = entrada.readLine();
        }
        saida.write(soma + "\n");
        saida.flush();
    }
}
