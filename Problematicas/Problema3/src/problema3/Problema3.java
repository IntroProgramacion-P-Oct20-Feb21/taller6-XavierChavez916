/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        String nombre_empleado;
        int numero_dias;
        double costo_dia;
        String cadena_final = "";
        double resultado;
        
        while (contador <= 5){
            System.out.println("Ingrese el nombre del empleado");
            
            nombre_empleado = entrada.nextLine();
            System.out.println("Ingrese el numero de dias trabajados");
            
            numero_dias = entrada.nextInt();
            System.out.println("Ingrese el costo del dia trabajado");
            costo_dia =  entrada.nextDouble();
            resultado = numero_dias * costo_dia;
            cadena_final = String.format("%s%s%s%s%s%s%s%s\n",cadena_final,
                    nombre_empleado ,"\t" ,numero_dias ,"\t$",costo_dia,
                    "\t$",resultado,"\n");
            contador =  contador + 1;
            entrada.nextLine(); 
        }
        System.out.printf("%s",cadena_final);
    }
    
}
