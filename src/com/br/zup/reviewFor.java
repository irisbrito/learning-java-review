package com.br.zup;

public class reviewFor {
    public static void main(String[] args){
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int numero : numeros){
            if(numero%2 == 0){
                System.out.println("pi");
            }else{
                System.out.println(numero);
            }
    }
    }
}
/*int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int controle = 0; controle < numeros.length; controle++){
            if(numeros[controle]%2 == 0){
                System.out.println("pi");
            }else{
                System.out.println(numeros[controle]);
            }
        }*/