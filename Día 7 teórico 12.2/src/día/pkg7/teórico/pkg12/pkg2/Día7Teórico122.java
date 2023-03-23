/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg7.teórico.pkg12.pkg2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día7Teórico122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Por favor ingrese dos números");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        esMultiplo(num1,num2);
    }
    
    public static void esMultiplo(int num1,int num2){
        
        if (num1%num2==0){
            
            System.out.println("El primer número es múltiplo del segundo");
            
        }else{
            System.out.println("El primer número no es múltiplo del segundo");
        }
        
    }
    
}
