/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        String cadena_final="";
        String nom_estudiante;
        double promedio;
        int contador = 1;
        
        while(contador <= 4 ){
            System.out.println("Ingresar el nombre del estudiante");
            nom_estudiante = entrada.nextLine();
            
            System.out.println("Ingresar el promedio del estudiante");
            promedio = entrada.nextDouble();
            
            if(promedio >= 7 && promedio <= 10){
                cadena_final = String.format("%s%s%s%s%s%s\n",
                        cadena_final,nom_estudiante,"\t",
                        promedio,"\t","Aprobado\n");
            }else{
                cadena_final = String.format("%s%s%s%s%s%s\n",
                        cadena_final,nom_estudiante,"\t",
                        promedio,"\t","Reprobado\n");
            }
            contador = contador + 1;
            entrada.nextLine();
        }
        System.out.printf("%s",cadena_final);
    }
    
}
