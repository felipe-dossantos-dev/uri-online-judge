package urionlinejudge.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class URI1898 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha1 = entrada.readLine();
        String linha2 = entrada.readLine();
        String vet1[] = linha1.split("[^\\d.]+");
        String vet2[] = linha2.split("[^\\d.]+");
        String cpf = "";
        String num1 = "";
        String num2 = "";
        String join1 = "";
        for (String str : vet1) {
            join1 += str;
        }
        String join2 = "";
        for (String str : vet2) {
            join2 += str;
        }
        int contPosVirgula = 0;
        boolean posVirgula = false;
        for (char c : join1.toCharArray()) {
            if (cpf.length() < 11) {
                cpf += c;
            } else {
                if (posVirgula && contPosVirgula < 2) {
                    num1 += c;
                    contPosVirgula++;
                } else if (c == '.') {
                    num1 += c;
                    posVirgula = true;
                } else if (!posVirgula) {
                    num1 += c;
                }
            }
        }
        contPosVirgula = 0;
        posVirgula = false;
        for (char c : join2.toCharArray()) {
            if (posVirgula && contPosVirgula < 2) {
                num2 += c;
                contPosVirgula++;
            } else if (c == '.') {
                num2 += c;
                posVirgula = true;
            } else if (!posVirgula) {
                num2 += c;
            }
        }
        double d1 = Double.parseDouble(num1);
        double d2 = Double.parseDouble(num2);
        d1 += d2;
        saida.write("cpf " + cpf + "\n");
        saida.write(String.format("%.2f", d1));
        saida.newLine();
        saida.flush();
    }
}
