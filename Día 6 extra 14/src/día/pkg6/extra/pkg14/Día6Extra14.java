/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg6.extra.pkg14;

import java.util.Scanner;

/**
 *
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
 * cantidad de hijos. Escriba un programa que pida la cantidad de familias y
 * para cada familia la cantidad de hijos para averiguar la media de edad de los
 * hijos de todas las familias.
 * @author usuario
 */
public class Día6Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int n,m,edad,suma;
        suma=0;
        
        do{
        System.out.println("Ingrese la cantidad de familias a analizar");
        n=leer.nextInt();
        }while(n<=0 || n>10);
        
        for (int i = 1; i < n+1; i++) {
            do{
            System.out.println("Ingrese la cantidad de hijos de la familia "+i);
            m=leer.nextInt();
            }while(m<=0 || m>6);
            
            for (int j = 1; j < m+1; j++) {
                do{
                System.out.println("Ingrese la edad del hijo n° "+j);
                edad=leer.nextInt();
                }while(edad<0 || edad>30);
                suma=suma+edad;
                
            }
            System.out.println("La media de edad de la familia "+i+" es de "+suma/m
            +" años");
            suma=0;
        }
        
    }
    
}
