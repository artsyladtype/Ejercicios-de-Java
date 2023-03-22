/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg6.extra.pkg13;

import java.util.Scanner;

/**
 *
 * Crear un programa que dibuje una escalera de números, donde cada línea de
 * números comience en uno y termine en el número de la línea. Solicitar la
 * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
 * número 3:
1
12
123

 * @author usuario
 */
public class Día6Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int num,cont;
        cont=1;
        do{
        System.out.println("Ingrese la altura de la escalera (max=10)");
        num=leer.nextInt();
        }while(num>10 || num<=0);
        
        do{
            for (int i = 1; i < cont+1; i++) {
                System.out.print(i);
            }
            System.out.println("");
            cont=cont+1;
        }while(cont<=num);
        
    }
    
}
