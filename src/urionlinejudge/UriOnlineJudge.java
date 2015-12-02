package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

//1867
public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        String vet[] = linha.split(" ");
        int a = Integer.parseInt(vet[0]);
        int b = Integer.parseInt(vet[1]);
        a = numeroEmUmAlgarismo(a);
        b = numeroEmUmAlgarismo(b);
        if (a > b) {
            saida.write("1");
        } else if (a < b) {
            saida.write("2");
        } else {
            saida.write("0");
        }
        saida.flush();
    }
    
    public static int numeroEmUmAlgarismo(int num) {
        while (num > 9) {
            int tmp = num;
            int soma = 0;
            while (tmp > 0) {
                soma += tmp % 10;
                tmp /= 10;
            }
            num = soma;
        }
        return num;
    }
}
