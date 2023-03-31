/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg9.práctico.pkg1;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.
 * @author usuario
 */
public class Día9Práctico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int[]vector=new int[100];
        
        for(int i=0;i<100;i++){
            
            vector[i]=i+1;
            
        }
        
        
        
          for (int i = 99; i >= 0; i--) {
              
              System.out.println(vector[i]);
            
        }
{
            
            
            
        }
        
    }
    
    
}
