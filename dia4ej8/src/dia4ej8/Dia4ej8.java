/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4ej8;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Dia4ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 10");
        int num;
        num=leer.nextInt();
        
        while (num<0 || num>10) {
            System.out.println("Número inválido");
            System.out.println("Ingrese un número válido");
            num=leer.nextInt();
            break;
        }
       
        
    }
    
}
