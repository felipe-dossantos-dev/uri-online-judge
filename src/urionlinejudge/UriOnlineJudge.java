package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Locale;

public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        int qtd = Integer.parseInt(entrada.readLine());
        while (qtd != 0) {
            long[] somas = new long[qtd];
            int[] valores = new int[qtd];
            String nomes[] = new String[qtd];

            for (int i = 0; i < qtd; i++) {
                String linha = entrada.readLine();
                nomes[i] = linha;
                int valor = 0;
                char letras[] = linha.toCharArray();
                for (char letra : letras) {
                    valor += letra;
                }
                valores[i] = valor;
                if (i == 0) {
                    somas[i] = valor;
                } else {
                    somas[i] = somas[i - 1] + valor;
                }
            }
            //buscas
            long busca = somas[qtd - 1] / 2 + 1;
            int busca2 = Arrays.binarySearch(somas, busca);
            if (busca2 < 0)
                busca2 += qtd;
            if (busca > somas[busca2])
                busca2++;

            long timeA = 0;
            int cont = 1;
            for (int i = busca2; i >=0 ; i--) {
                timeA += valores[i] * cont;
                cont++;
            }
            long timeB = 0;
            cont = 1;
            for (int i = busca2 + 1; i < qtd; i++) {
                timeB += valores[i] * cont;
                cont++;
            }
            if (timeB != timeA) {
                saida.write("Impossibilidade de empate.\n");
            } else {
                saida.write(nomes[busca2] + "\n");
            }
            qtd = Integer.parseInt(entrada.readLine());
        }
        saida.flush();
    }
}
