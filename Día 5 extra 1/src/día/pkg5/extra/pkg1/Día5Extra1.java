/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg5.extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día5Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de minutos");
        int dias,min,hs;
        min=leer.nextInt();
        hs=min/60;
        dias=(hs/24);
        hs=hs-dias*24;
        
        System.out.println("Los minutos ingresados equivalen a "+dias+" días, "+hs+" horas");
        
    }
    
}
