/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge.adhoc;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class URI1987 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int tmp = scan.nextInt();
            int valor = scan.nextInt();
            char[] algarismos = String.valueOf(valor).toCharArray();
            int soma = 0;
            for (int i = 0; i < algarismos.length; i++) {
                soma += algarismos[i] - '0';
            }
            if (soma % 3 == 0) {
                System.out.println(soma + " sim");
            } else {
                System.out.println(soma + " nao");
            }
        }
    }
}
