/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg6.extra.pkg11;

import java.util.Scanner;

/**
 *  Escribir un programa que lea un número entero y devuelva el número de dígitos
 * que componen ese número. Por ejemplo, si introducimos el número 12345, el
 * programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
 * utilizando el operador de división. Nota: recordar que las variables de tipo
 * entero truncan los números o resultados.
 * @author usuario
 */
public class Día6Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int num,digitos;
        digitos=0;
        
        System.out.println("Ingrese un número");
        num=leer.nextInt();
        
        do{
            num=num/10;
            digitos++;
        }while (num>0);
        
        System.out.println("La cantidad de dígitos del número ingresado es: "+digitos);
        
    }
    
}
