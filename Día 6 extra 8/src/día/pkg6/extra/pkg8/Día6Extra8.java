/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg6.extra.pkg8;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 *
 * @author usuario
 */
public class Día6Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int num,cont,par,impar;
        cont=0;
        par=0;
        impar=0;
        
        do{
            do{
                System.out.println("Ingrese un número");
                num=leer.nextInt();
            }while(num<=0);
            
            cont=cont+1;
            
            if(num%2==0){
                par++;
            }else{
                impar++;
            }
            
        }while(num%5!=0);
        
        System.out.println("Cantidad de números leídos: "+cont);
        System.out.println("Cantidad de números pares: "+par);
        System.out.println("Cantidad de números impares: "+impar);
        
    }
    
}
