/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.pkg2.ej.pkg1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Guía2Ej1 {
    
    /*. Implementar un programa que dado dos números enteros determine cuál es el
    mayor y lo muestre por pantalla.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1;
        int n2;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros");
        n1=leer.nextInt();
        n2=leer.nextInt();
        
        if (n1>n2){
            System.out.println("El mayor número es " + n1);
        } else{
            System.out.println("El mayor número es "+n2);
        }
        // TODO code application logic here
    }
    
    
}
