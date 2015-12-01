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
        
        String linha = entrada.readLine();
        String vet[] = linha.split(" ");
        List<Integer> listaPortugues = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaPortugues.add(new Integer(vet[i]));
        }
        
        linha = entrada.readLine();
        vet = linha.split(" ");
        List<Integer> listaMatematica = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaMatematica.add(new Integer(vet[i]));
        }
        
        linha = entrada.readLine();
        vet = linha.split(" ");
        List<Integer> listaFisica = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaFisica.add(new Integer(vet[i]));
        }
        
        linha = entrada.readLine();
        vet = linha.split(" ");
        List<Integer> listaQuimica = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaQuimica.add(new Integer(vet[i]));
        }
        
        linha = entrada.readLine();
        vet = linha.split(" ");
        List<Integer> listaBiologia = new ArrayList<>();
        for (int i = 1; i < vet.length; i++) {
            listaBiologia.add(new Integer(vet[i]));
        }
        
        listaBiologia.sort(Collections.reverseOrder());
        listaFisica.sort(Collections.reverseOrder());
        listaMatematica.sort(Collections.reverseOrder());
        listaPortugues.sort(Collections.reverseOrder());
        listaQuimica.sort(Collections.reverseOrder());

        linha = entrada.readLine();
        int iteracoes = Integer.parseInt(linha);
        int soma = 0;
        int menorDif = 999999;
        
        while(iteracoes != 0) {
            
            iteracoes--;
        }
        
        
        saida.flush();
    }
}
