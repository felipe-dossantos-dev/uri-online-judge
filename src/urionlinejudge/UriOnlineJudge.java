package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class UriOnlineJudge {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
        while (linha != null) {
            String vet[] = linha.split(" ");
            int cont = vet.length - 1;
            int res = 0;
            boolean flag = true;
            while (cont > 0) {
                try {
                    int b = Integer.parseInt(vet[cont--]);
                    int a = Integer.parseInt(vet[cont--]);
                    if (a > 9 || b > 9) {
                        throw new NumberFormatException();
                    }
                    String oper = vet[cont];
                    switch (oper) {
                        case "/":
                            if (a == 0)
                                throw new ArithmeticException();
                            else 
                                res = b / a;
                            break;
                        case "*":
                            res = b * a;
                            break;
                        case "-":
                            res = b - a;
                            break;
                        case "+":
                            res = b + a;
                            break;
                    }
                    vet[cont] = Integer.toString(res);
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    saida.write("Invalid expression.\n");
                    flag = false;
                    break;
                } catch (ArithmeticException e) {
                    saida.write("Division by zero.\n");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                saida.write("The answer is " + res + ".\n");
            }
            linha = entrada.readLine();
            saida.flush();
        }
        
    }
}
