/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4ej6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Dia4ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Escriba dos números enteros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        if (num1>25 && num2>25){
            System.out.println("Ambos números son mayores a 25");
        } else if (num1>25 || num2>25) {
            System.out.println("Uno de los dos números es mayor a 25");
        } else {
            System.out.println("Ninguno de los números es mayor a 25");
        }
        
        
    }
}
