/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.pkg2.ej.pkg2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Guía2Ej2 {
    
    /*Crear un programa que dado un numero determine si es par o impar.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int n1;
        System.out.println("Ingrese un número entero");
        n1=leer.nextInt();
        
        if(n1%2==0){
            System.out.println("El número es par");
        } else{
            System.out.println("El número es impar");
        }
        // TODO code application logic here
    }
    
}
