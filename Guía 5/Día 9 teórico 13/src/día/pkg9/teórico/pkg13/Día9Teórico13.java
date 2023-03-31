/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg9.teórico.pkg13;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día9Teórico13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        String [] vector=new String [10];
        
        for (int i=0; i<vector.length; i++){
            
            System.out.println("Ingrese el nombre de un integrante");
            vector[i]=leer.nextLine();
            
        }
        
        imprimirVector(vector);
        
    }
    
    public static void imprimirVector(String[] vector){
        
        /*for (int i=0; i<vector.length;i++){
            System.out.println(vector[i]);
        }*/
        
        for (String elemento:vector){
            
            System.out.println(elemento+" ");
            
        }
        
    }
    
}
