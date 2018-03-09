/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculodigitoverificador;

/**
 *
 * @author caio
 */
public class NewClass {
    
    public static void main(String[] args){
        
        int primeiroDigito;
        int segundoDigito;
        
        long a = 33312498740L;
        
        long b = 9686170421L;
        
        long aux = b;
        
        long novocpf[] = new long[11];
        
        for(int i=0; i < 11; i++){
            novocpf[i] = (aux%10);
            aux = aux/10;
        }
        
        for(int i=0; i < 11; i++){
            System.out.println(novocpf[i]);
        }
        
//        int soma = 0;
//        int valor = 10;
//        System.out.println(novocpf[10]);
//        System.out.println(valor);
//        System.out.println(novocpf[10] * valor);
//        for(int i = 10; i > 1 ; i --){
//            soma = (int) (soma + (novocpf[i] * valor));
//            System.out.println(soma);
//            valor = valor -1;
//        }
//        System.out.println(soma);
        
        
        primeiroDigito = calcularDigito1(novocpf);
        System.out.println(primeiroDigito);
        if(primeiroDigito%11 < 2){
            primeiroDigito = 0;
        }else{
            primeiroDigito = 11 - (primeiroDigito%11);
        }
        
        System.out.println(primeiroDigito);
        
        segundoDigito = calcularDigito2(novocpf);
        System.out.println(segundoDigito);
        if(segundoDigito%11 < 2){
            segundoDigito = 0;
        }else{
            segundoDigito = 11 - (segundoDigito%11);
        }
        
        System.out.println(segundoDigito);
        
//        System.out.println(novocpf[1]);
        
        
    }
    
    private static int calcularDigito1(long[] novocpf) {
        
        int soma = 0;
    
            int valor = 10;
            for(int i = 10; i > 1 ; i --){
                soma = (int) (soma + (novocpf[i] * valor));
                -- valor;
            }
            return soma;
        
    }
    
    private static int calcularDigito2(long[] novocpf) {
        
        int soma = 0;
        int valor = 11;
        for(int i = 10; i > 0 ; i --){
            soma = (int) (soma + (novocpf[i] * valor));
            -- valor;
        }
        return soma;
        
    }
    
}
