/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día4ej9;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día4ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        int num, contador,suma;
        contador=0;
        suma=0;
        do {
            
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            contador = contador + 1;
            if (num >= 0) {
                suma = suma + num;
            }

            
        } while (contador<20 && num!=0);
        
        if (num==0){
            System.out.println("Se ha capturado el 0!");
            System.out.println("La suma de los números ingresados es: "+suma);
        } else {
            System.out.println("La suma de los números ingresados es: "+suma);
        }
        
    }
    
}
