package urionlinejudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Locale;
<<<<<<< HEAD
import java.util.Stack;
=======
import java.util.Set;
>>>>>>> 4a9c0fc2d074f375ab55e6fd6ee50c29b1b0dc73

public class UriOnlineJudge {

    public static String resposta;

    public static void main(String[] args) throws Exception, IOException {
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(
                System.out));
        String linha = entrada.readLine();
<<<<<<< HEAD
=======
        
>>>>>>> 4a9c0fc2d074f375ab55e6fd6ee50c29b1b0dc73
        saida.flush();
    }
}
