/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.pkg2.ej.pkg4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Guía2Ej4 {
    
    /*Realizar un programa que solo permita introducir frases o palabras de 8 de
    largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
    un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
    imprimir “INCORRECTO”. Nota: investigar la función Length() en Java.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        String frase;
        int longitudFrase;
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        longitudFrase=frase.length();
        
        if (longitudFrase==8){
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
        
        // TODO code application logic here
    }
    
}
