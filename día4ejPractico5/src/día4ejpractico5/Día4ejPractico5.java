/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día4ejpractico5;

import java.util.Scanner;

/**
 //Escriba un programa en el cual se ingrese un valor
 * límite positivo, y a continuación solicite números al usuario hasta que 
 * la suma de los números introducidos supere el límite inicial.
 //@author usuario/*
 */
public class Día4ejPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        int num, limit, suma;
        suma=0;
        
        do{
        System.out.println("Ingrese un número límite para el programa (max=100)");
        limit=leer.nextInt();
        } while(limit>100);
        
        do{
            System.out.println("Ingrese un número a sumar");
            num=leer.nextInt();
            suma=suma+num;
        } while (suma<=limit);
        
        System.out.println("Límite superado");
    }
    
}
