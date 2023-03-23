/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg7.práctico.pkg2;

import java.util.Scanner;

/**
 *  Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 * @author usuario
 */
public class Día7Práctico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        String rta,nombre;
        int edad;
        
        
        do{
            
            System.out.println("Ingrese el nombre de la persona");
            nombre=leer.nextLine();
            System.out.println("Ingrese su edad");
            edad=leer.nextInt();
            leer.nextLine();
            mayorMenor(nombre,edad);
            do {
                System.out.println("¿Desea continuar?");
                rta = leer.nextLine();
            } while (!rta.equalsIgnoreCase("Si") && !rta.equalsIgnoreCase("No"));

        } while (!rta.equalsIgnoreCase("No"));

    }
    
    public static void mayorMenor(String nombre,int edad){
        
        if (edad>18){
            System.out.println(nombre+" es mayor de edad.");
        }else{
            System.out.println(nombre+" es menor de edad.");
        }
        
    }
    
}
