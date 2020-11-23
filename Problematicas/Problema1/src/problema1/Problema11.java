/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadena_final = "";
        String cliente;
        String empresa;
        int contador = 1;
        int mensualidades;
        double netflix = 10;
        double disney = 6;
        double apple = 5;
        double amazon = 4.50;
        double valor_total;
        double iva;
        
        System.out.println("Ingrese su nombre por favor");
        cliente = entrada.nextLine();
        
        System.out.println("Ingrese el numero de mensualidades "
                + "que va a cancelar");
        mensualidades = entrada.nextInt();
        
        System.out.println("Ingrese la empresa que va a pagar");
        entrada.nextLine();
        empresa = entrada.nextLine();
        
        switch(empresa){
            case "Netflix":     
                while (contador <= mensualidades){
                    cadena_final = "";
                    iva = (netflix * contador) * 10/100;
                    valor_total = (contador * netflix) + iva;
                    cadena_final = String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s%s"
                            + "%s%s%s%s\n",
                            cadena_final,
                            "Usuario: ",cliente,"\n",
                            "Empresa: ",empresa,"\n",
                            "Precio base: ","$",netflix,"\n",
                            "Impuesto: ","$",iva,"\n",
                            "Total a cancelar: ","$",valor_total);
                    contador = contador + 1;          
                }
                break;
            case "Disney plus":
                while(contador<=mensualidades){
                    cadena_final ="";
                    iva = (disney * contador)*12/100;
                    valor_total = (contador * disney) + iva;
                    cadena_final = String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s%s"
                            + "%s%s%s%s\n",
                            cadena_final,
                            "Usuario: ",cliente,"\n",
                            "Empresa: ",empresa,"\n",
                            "Precio base: ","$",disney,"\n",
                            "Impuesto: ","$",iva,"\n",
                            "Total a cancelar: ","$",valor_total);
                    contador = contador + 1;         
                }
                break;
            case "Apple tv":
                while(contador <= mensualidades){
                    cadena_final = "";
                    iva = (apple * contador)* 14/100;
                    valor_total = (contador * apple) + iva;
                    cadena_final = String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s%s"
                            + "%s%s%s%s\n",
                            cadena_final,
                            "Usuario: ",cliente,"\n",
                            "Empresa: ",empresa,"\n",
                            "Precio base: ","$",apple,"\n",
                            "Impuesto: ","$",iva,"\n",
                            "Total a cancelar: ","$",valor_total);
                    contador = contador + 1;
                }
                break;
            case "Amazon prime":
                while(contador <= mensualidades){
                    iva = (amazon * contador)* 16/100;
                    valor_total = (amazon * contador) + iva;
                    cadena_final = String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s%s"
                            + "%s%s%s%s\n",
                            cadena_final,
                            "Usuario: ",cliente,"\n",
                            "Empresa: ",empresa,"\n",
                            "Precio base: ","$",amazon,"\n",
                            "Impuesto: ","$",iva,"\n",
                            "Total a cancelar: ","$",valor_total);
                    contador = contador + 1;
                }
                break;
            default: 
                cadena_final = String.format("%s%s\n",
                        cadena_final,"Error en tipo de empresa");            
        }
        System.out.printf("%s\n",cadena_final);
    }
}
