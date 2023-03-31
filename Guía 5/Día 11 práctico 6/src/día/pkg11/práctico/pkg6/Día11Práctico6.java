/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg11.práctico.pkg6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día11Práctico6 {

    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
     * 9 donde la suma de sus filas, sus columnas y sus diagonales son 
     * idénticas. Crear un programa que permita introducir un cuadrado por
     * teclado y determine si este cuadrado es mágico o no. El programa deberá
     * comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int [][]cuadrado=new int[3][3];
        System.out.println("Ingrese los números para el cuadrado y le diremos"
                + " si es mágico o no");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                System.out.println("Ingrese un número");
                cuadrado[i][j]=leer.nextInt();
                }while(cuadrado[i][j]<1 || cuadrado[i][j]>9);
            }
            
            
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(cuadrado[i][j]+" ");
                
            }
            System.out.println("");
        }
        System.out.println("");
        esMagico(cuadrado);
        
    }
    
    public static void esMagico(int matriz[][]){
        
        int cont=0;
        int magico=0;
        int suma=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0) {
                    
                    magico=magico+matriz[i][j];
                    
                }else{
                    suma=suma+matriz[i][j];
                }
            }
            if (i!=0 && suma!=magico){
                cont++;
            }
            suma=0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                suma=suma+matriz[j][i];
                
            }
            if (suma != magico) {
                cont++;
            }
            suma = 0;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j) {

                    suma = suma + matriz[i][j];

                }
            }

        }

        if (suma != magico) {
            cont++;
        }
        suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i + j == 2) {

                    suma = suma + matriz[i][j];

                }

            }

        }
        if (suma != magico) {

            cont++;
        }
        
        suma=0;
        
        
        if (cont==0) {
            
            System.out.println("¡El cuadrado es mágico!");
            
        }else{
            System.out.println("¡El cuadrado no es mágico!");
        }

    }

    
   
}
