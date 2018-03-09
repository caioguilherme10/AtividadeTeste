/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.questao2;

/**
 *
 * @author caio
 */
public class Chassi {
    
    public Chassi(){
        
    }
    
    public static int verificarchassi(String chassi){
        
        char letras[];
        letras = chassi.toCharArray();
        
        if(letras.length == 17){
            switch (letras[9]) {
            case 'A':
                return 2010;
            case 'B':
                return 2011;
            case 'C':
                return 2012;
            default:
                return 1;
            }
        }else{
            return 0;
        }
        
    }
}
