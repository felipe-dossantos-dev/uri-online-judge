package urionlinejudge.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Locale;

public class URI1120 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        String vet[] = linha.split(" ");
        String digitoFalho = vet[0];
        String valorOrig = vet[1];
        while (!digitoFalho.equals("0") || !valorOrig.equals("0")) {
            vet = valorOrig.split(digitoFalho + "+");
            String join = "";
            for (String str : vet) {
                join += str;
            }
            BigInteger res;
            if (join.isEmpty()) {
                res = BigInteger.ZERO;
            } else {
                res = new BigInteger(join, 10);
            }
            saida.write(res + "\n");
            linha = entrada.readLine();
            vet = linha.split(" ");
            digitoFalho = vet[0];
            valorOrig = vet[1];
        }
        saida.flush();
    }
}
