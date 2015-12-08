/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge;

import java.util.Set;

/**
 *
 * @author felipe
 */
public class PowerSets {
    
    public static Set<String> conjunto;
    
    //powerSet("tudo", "", 0)
    public static void powerSetStringSemAlterarOrdem(String palavra, String atual, int posAtual) {
        if (!conjunto.contains(atual)) {
            conjunto.add(atual);
            for (int i = posAtual; i < palavra.length(); i++) {
                powerSetStringSemAlterarOrdem(palavra, atual + palavra.charAt(i), i + 1);
            }
        }
    }
    
    
}
