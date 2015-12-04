/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

/**
 *
 * @author felipe.santos
 */
public class URI1845 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));

        int letra = entrada.read();
        boolean estadoExcluir = false;
        while (letra != -1) {
            //linha = linha.replaceAll("[JSPBVXZF][JSPBVXZFjspbvxzf]*", "F");
            switch (letra) {
                case 'J':
                case 'S':
                case 'P':
                case 'B':
                case 'V':
                case 'X':
                case 'Z':
                case 'F':
                    if (!estadoExcluir) {
                        estadoExcluir = true;
                        saida.write('F');
                    }
                    break;
                case 'j':
                case 's':
                case 'p':
                case 'b':
                case 'v':
                case 'x':
                case 'z':
                case 'f':
                    if (!estadoExcluir) {
                        estadoExcluir = true;
                        saida.write('f');
                    }
                    break;
                default:
                    saida.write(letra);
                    estadoExcluir = false;
                    break;
            }
            letra = entrada.read();
        }
        saida.flush();
    }
}
