/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge.adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1769
 *
 * @author felipe.santos
 */
public class URI1769 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (linha != null) {
            String vet[] = linha.split("-");
            long digitoVerificador1 = 0;
            long digitoVerificador2 = 0;
            int cont = 1;
            for (char letra : vet[0].toCharArray()) {
                if (letra != '.') {
                    digitoVerificador1 += cont * (letra - '0');
                    digitoVerificador2 += (10 - cont) * (letra - '0');
                    cont++;
                }
            }

            digitoVerificador1 = digitoVerificador1 % 11;
            digitoVerificador2 = digitoVerificador2 % 11;

            if (digitoVerificador1 == 10) {
                digitoVerificador1 = 0;
            }
            if (digitoVerificador2 == 10) {
                digitoVerificador2 = 0;
            }

            long digitosVerificadores = digitoVerificador1 * 10 + digitoVerificador2;
            long digitoEntrada = Long.parseLong(vet[1]);

            if (digitosVerificadores == digitoEntrada) {
                saida.write("CPF valido\n");
            } else {
                saida.write("CPF invalido\n");
            }
            linha = entrada.readLine();
        }
        saida.flush();
    }
}
