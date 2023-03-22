/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg5.extra.pkg3;

import java.util.Scanner;


/*
Elaborar un algoritmo en el cual se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función
equals() de la clase String.
*/
/**
 *
 * @author usuario
 */
public class Día5Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        String letra;
        
        System.out.println("Ingrese una letra");
        letra=leer.nextLine();
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
           || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
           || letra.equalsIgnoreCase("u")){
            
            System.out.println("La letra ingresada es una vocal");
            
        }else{
            System.out.println("La letra ingresada no es una vocal");
        }

        
    }
    
}
