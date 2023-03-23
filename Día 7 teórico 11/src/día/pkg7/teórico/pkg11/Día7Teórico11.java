/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg7.teórico.pkg11;

import java.util.Scanner;

/**
 *Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales
 * acentuadas) se mantienen sin cambios.
a @
e #
i $
o %
u *


Realice un subprograma que reciba una secuencia de caracteres y retorne la
* codificación correspondiente. Utilice la estructura “según” para la
* transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 * @author usuario
 */
public class Día7Teórico11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese una secuencia de caracteres");
        String frase= leer.nextLine();
        
        frase = codigo(frase);
        
        System.out.println(frase);
    }
    
    public static String codigo (String frase ){
        
        int longitud =frase.length();
        String letra;
        String fraseNueva="";
        
        for (int i = 0; i < longitud; i++) {
            
            letra = frase.substring(i, i + 1);

            switch (letra) {

                case "a":
                case "A":
                    letra = "@";
                    break;
                case "e":
                case "E":
                    letra = "#";
                    break;
                case "i":
                case "I":
                    letra = "$";
                    break;
                case "o":
                case "O":
                    letra = "%";
                    break;
                case "u":
                case "U":
                    letra = "*";
                    break;
                default:
                    letra=letra;
                    break;
                    
                    

            }
            
            fraseNueva=fraseNueva.concat(letra);
            
        }
        
        return fraseNueva;
    }
    
}
