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
public class VerificaCPF {

    private static int primeiroDigito;
    private static int segundoDigito;
    
    public VerificaCPF(){
        
    }
    
    
    public boolean verificaCPF(long cpf){
        
        long novocpf[] = new long[11];
        
        for(int i=0; i < 11; i++){
            novocpf[i] = (cpf%10);
            cpf = cpf/10;
        }
        
        primeiroDigito = calcularDigito1(novocpf);
        if(primeiroDigito%11 < 2){
            primeiroDigito = 0;
        }else{
            primeiroDigito = 11 - primeiroDigito%11;
        }
        
        segundoDigito = calcularDigito2(novocpf);
        if(segundoDigito%11 < 2){
            segundoDigito = 0;
        }else{
            segundoDigito = 11 - segundoDigito%11;
        }
        
        if(novocpf[0] == segundoDigito){
            return novocpf[1] == primeiroDigito;
        }
        return false;
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
