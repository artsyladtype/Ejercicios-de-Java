/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg9.práctico.pkg2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día9Práctico2 {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un número a buscar en el vector. El
     * programa mostrará dónde se encuentra el numero y si se encuentra repetido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        int []vector=new int[n];
        
        for (int i = 0; i < n; i++) {
            
            vector[i]=(int)(Math.random()*10);
            
        }
        int numBuscado;
        
        do{
        System.out.println("Ingrese el número que desea buscar (de 0 a 9)");
        numBuscado=leer.nextInt();
        }while(numBuscado<0 || numBuscado>9);
        int contador=0;
        for (int i = 0; i < n; i++) {
            
            if (vector[i]==numBuscado && contador==0) {
                
                contador++;
                System.out.println("El número buscado se encuentra en la posición "+i+" del vector");
                
            }else if(vector[i]==numBuscado && contador>0){
                
                contador++;
                System.out.println("El número buscado se repite en la posición "+i+" del vector");

            }

        }

        if (contador == 0) {
            System.out.println("El número ingresado no fue encontrado en el vector");
            
        }
        
    }
    
}
