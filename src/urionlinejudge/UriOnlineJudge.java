package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        List<List<Integer>> listas = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            String linha = entrada.readLine();
            String vet[] = linha.split(" ");
            int qtd = Integer.parseInt(vet[0]);
            List<Integer> listaAtual = new ArrayList<>();
            for (int j = 0; j < qtd; i++) {
                listaAtual.add(new Integer(vet[j + 1]));
            }
            Collections.sort(listaAtual);
            listas.add(listaAtual);
        }
        String linha = entrada.readLine();
        int qtdConj = Integer.parseInt(linha);
        int pos = -1;
        int menorDistancia = 100000;
        while (qtdConj != 0) {
            qtdConj--;
        }
        saida.flush();
    }

}
