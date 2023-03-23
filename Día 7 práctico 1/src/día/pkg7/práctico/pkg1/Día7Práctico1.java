/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg7.práctico.pkg1;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main. 
 *
 * @author usuario
 */
public class Día7Práctico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        System.out.println("Ingrese la operación que desea realizar");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        
        int op=leer.nextInt();
        
        int resultado=0;
        
        switch(op){
            
            case 1: resultado=sumar(num1,num2);
            break;
            case 2: resultado=restar(num1,num2);
            break;
            case 3: resultado=multiplicar(num1,num2);
            break;
            case 4: resultado=dividir(num1,num2);
            break;
            default: System.out.println("Opción inválida");
            
        }
        
        System.out.println("El resultado de la operación elegida es "+resultado);
        
        
        
    }

    public static int sumar(int num1, int num2) {

        int res = num1 + num2;
        return res;
    }

    public static int restar(int num1, int num2) {

        int res = num1 - num2;
        return res;

    }

    public static int multiplicar(int num1, int num2) {
        int res = num1 * num2;
        return res;
    }

    public static int dividir(int num1, int num2) {
        int res = num1 / num2;
        return res;
    }


    
}
