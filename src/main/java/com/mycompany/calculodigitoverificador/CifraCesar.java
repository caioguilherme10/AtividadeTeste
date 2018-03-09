/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.criptografiadecesar;

/**
 *
 * @author caio
 */
public class CifraCesar {
    
    public CifraCesar(){
        
    }
    
    public String encriptar(int chave, String texto){
      StringBuilder textoCifrado = new StringBuilder();
      int tamanhoTexto = texto.length();
      
      for(int c=0; c < tamanhoTexto; c++){
         int letraCifradaASCII = ((int) texto.charAt(c)) + chave;
         
         while(letraCifradaASCII > 126)
            letraCifradaASCII -= 94;

         textoCifrado.append( (char)letraCifradaASCII );
      }
      
      return textoCifrado.toString();
   }
   

   public String decriptar(int chave, String textoCifrado){
      StringBuilder texto = new StringBuilder();
      int tamanhoTexto = textoCifrado.length();
      
      for(int c=0; c < tamanhoTexto; c++){
         int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;
         
         while(letraDecifradaASCII < 32)
            letraDecifradaASCII += 94;

         texto.append( (char)letraDecifradaASCII );
      }
      
      return texto.toString();
   }

    
}
