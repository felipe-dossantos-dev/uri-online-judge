package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1588
 *
 * @author felipe
 */
public class URI1588 {

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
            int qtdTimes = Integer.parseInt(vet[0]);
            int qtdJogos = Integer.parseInt(vet[1]);
            Map<String, Time> times = new HashMap<>();
            for (int j = 0; j < qtdTimes; j++) {
                linha = entrada.readLine();
                Time t = new Time();
                t.nome = linha;
                t.pos = j;
                times.put(linha, t);
            }
            for (int j = 0; j < qtdJogos; j++) {
                linha = entrada.readLine();
                vet = linha.split(" ");

                int golA = Integer.parseInt(vet[0]);
                String nomeA = vet[1];
                Time timeA = times.get(nomeA);
                timeA.gols += golA;

                int golB = Integer.parseInt(vet[2]);
                String nomeB = vet[3];
                Time timeB = times.get(nomeB);
                timeB.gols += golB;

                if (golA == golB) {
                    timeA.pontos++;
                    timeB.pontos++;
                } else if (golA > golB) {
                    timeA.pontos += 3;
                    timeA.vitorias++;
                } else {
                    timeB.pontos += 3;
                    timeB.vitorias++;
                }
            }
            ArrayList<Time> lista = new ArrayList<>(times.values());
            Comparator<Time> comp = new Comparator<Time>() {
                @Override
                public int compare(Time t, Time t1) {
                    if (t.pontos > t1.pontos) {
                        return -1;
                    }
                    if (t.pontos < t1.pontos) {
                        return 1;
                    }
                    if (t.vitorias > t1.vitorias) {
                        return -1;
                    }
                    if (t.vitorias < t1.vitorias) {
                        return 1;
                    }
                    if (t.gols > t1.gols) {
                        return -1;
                    }
                    if (t.gols < t1.gols) {
                        return 1;
                    }
                    if (t.pos > t1.pos) {
                        return 1;
                    }
                    if (t.pos < t1.pos) {
                        return -1;
                    }
                    return 0;
                }
            };
            Collections.sort(lista, comp);
            for (Time t : lista) {
                saida.write(t.nome + "\n");
            }
        }
        saida.flush();
    }

    public static class Time {

        public String nome;
        public int pontos;
        public int vitorias;
        public int gols;
        public int pos;

        public Time() {
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 23 * hash + Objects.hashCode(this.nome);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Time other = (Time) obj;
            if (!Objects.equals(this.nome, other.nome)) {
                return false;
            }
            return true;
        }
    }
}
