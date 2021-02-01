package com.br.zup;

import java.util.*;

public class exercicioZoologico {

    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }

    public static void main(String[] args) {

        Map<String, List<String>> dicionarioAnimais = new HashMap<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite: \n1 para cadastrar");
            int resposta = criarScanner().nextInt();

            if (resposta == 1) {
                System.out.println("Qual zoologico vc vai cadastrar? ");
                String zoologico = criarScanner().nextLine();
                List<String> animais = new ArrayList<>();
                String retorno = "";
                do {
                    System.out.println("Digite o nome do animal para cadastrar ou sair para finalizar");
                    retorno = criarScanner().nextLine();
                    if (!retorno.equalsIgnoreCase("sair")) {
                        animais.add(retorno);
                    }
                } while (!retorno.equalsIgnoreCase("sair"));

                dicionarioAnimais.put(zoologico, animais);
            }

        }

    }



}
