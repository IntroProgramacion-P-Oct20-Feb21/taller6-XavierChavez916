/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author xavierchavez
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
        String cadena_final = "";
        int den = 19;
        
        while(contador <=6){
            if((contador % 2)==0){
                den = den + 10;
                cadena_final = String.format("%s%s%s%s\n",
                        cadena_final,
                        contador,
                        "/" ,den );    
            }else{
                den = den - 9;
                cadena_final = String.format("%s%s%s%s\n",
                        cadena_final,
                        contador,
                        "/", den);
            }
            contador = contador + 1;
    }
        System.out.printf("%s",cadena_final);
    }  
}
