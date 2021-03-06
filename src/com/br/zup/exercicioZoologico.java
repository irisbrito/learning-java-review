package com.br.zup;

import java.util.*;

public class exercicioZoologico {

    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }

    public static List<String> criarListaDeAnimais(){
        List<String> animais = new ArrayList<>();
        String retorno = "";
        do{
            System.out.println("Digite o nome do animal para cadastrar ou sair para finalizar");
            retorno = criarScanner().nextLine();
            if(!retorno.equalsIgnoreCase("sair")){
                animais.add(retorno);
            }
        }while (!retorno.equalsIgnoreCase("sair"));
        return animais;
    }

    public static void main(String[] args) {

        Map<String, List<String>> dicionarioAnimais = new HashMap<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite: \n1 para cadastrar \n2 para pesquisar \n3 para sair");
            int resposta = criarScanner().nextInt();

            if (resposta == 1) {
                System.out.println("Qual zoologico vc vai cadastrar? ");
                String zoologico = criarScanner().nextLine();
                List<String> animais = criarListaDeAnimais();
                String retorno = "";

                dicionarioAnimais.put(zoologico, animais);
            }else if(resposta == 2){
                System.out.println("Digite o nome do Zoológico");
                String nomeZoologico = criarScanner().nextLine();
                if(dicionarioAnimais.containsKey(nomeZoologico)){
                    System.out.println("No zoologico " + nomeZoologico + " tem os seguintes animais: "
                            +dicionarioAnimais.get(nomeZoologico));

                } else {
                    System.out.println("O zoológico "+ nomeZoologico + " não existe.");
                }
            } else if(resposta == 3){
                continuar = false;
                System.out.println("Que pena que vc vai embora. Volte Sempre");
            }

        }

    }

}
