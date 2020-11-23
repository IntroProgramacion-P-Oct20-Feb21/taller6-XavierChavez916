/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String jugador;
        int puntos;
        int faltas;
        int contador = 1;
        String cadena_final="";
        
        while(contador<=10){
            System.out.println("Ingrese el nombre del jugador");
            jugador = entrada.nextLine();
        
            System.out.println("Ingrese la cantidad de puntos que anoto en "
                    + "la temporada");
            puntos = entrada.nextInt();
        
            System.out.println("Ingrese la cantidad de faltas de la temporada");
            faltas = entrada.nextInt();
            entrada.nextLine();
            
            cadena_final  = String.format("%s%s%s%s%s%s\n",cadena_final,jugador
                    ,"\t\t",puntos,"\t",faltas);
            
            contador = contador + 1;
        }
        System.out.printf("%s",cadena_final);
        
    }
    
}
