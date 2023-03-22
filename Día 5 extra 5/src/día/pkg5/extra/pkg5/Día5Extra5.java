/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg5.extra.pkg5;

import java.util.Scanner;

/**
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un
valor real que represente el costo del tratamiento (previo al descuento) y
determine el importe en efectivo a pagar por dicho socio.

 *
 * @author usuario
 */
public class Día5Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer=new Scanner(System.in);
        
        String cat;
        double costo,real;
        
        real=0;
        
        System.out.println("Ingrese su categoría de socio");
        cat=leer.nextLine().toUpperCase();
        System.out.println("Ingrese el costo de su tratamiento");
        costo=leer.nextDouble();
        
        switch(cat){
            case "A":
                real=costo*0.5;
                break;
            case "B":
                real=costo*0.65;
                break;
            case "C":
                real=costo;
                break;
            default:
                System.out.println("Categoría no reconocida.");
                
                
        }
        if (real==0){
            System.out.println("");
        }else {
        System.out.println("El costo final de su tratamiento es de: $"+real);
        }
        
    }
    
}
