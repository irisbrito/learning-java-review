package com.br.zup;

import java.util.HashMap;
import java.util.Map;

public class forComMap {
    public static void main(String[] args){
        Map<String, String> comidasFavoritas = new HashMap<>();
        comidasFavoritas.put("Angela", "bolo");
        comidasFavoritas.put("Camille", "strogonoff");
        comidasFavoritas.put("Lola", "carne");

        for(Map.Entry<String, String> comida : comidasFavoritas.entrySet()){
            System.out.println(comida);
        }

        //OU
        /*para (nome da string: comidasFavoritas.keySet ()){
            Sistema. out .println (nome + "gosta de" + comidasFavoritas.get (nome)) ; }
        } }
        */


    }
}
