/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg5.extra.pkg2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día5Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int a,b,c,d,aux;
        
        System.out.println("Ingrese los cuatro valores");
        
        a=leer.nextInt();
        b=leer.nextInt();
        c=leer.nextInt();
        d=leer.nextInt();
        
        System.out.println("Los valores iniciales son: ");
        System.out.println("A: " +a);
        System.out.println("B: " +b);
        System.out.println("C: "+c);
        System.out.println("D: " +d);
        
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        
        System.out.println("Los valores finales son: ");
        System.out.println("A: " +a);
        System.out.println("B: " +b);
        System.out.println("C: "+c);
        System.out.println("D: " +d);
          
        
    }
    
}
