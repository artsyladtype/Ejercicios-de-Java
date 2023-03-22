/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día4ejpractico6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */

/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú: El usuario deberá elegir una opción y el
programa deberá mostrar el resultado por pantalla y luego volver al menú. El
programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea
salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/
public class Día4ejPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        int num1, num2, opcion;
        String confirma;
       
        do{
            System.out.println("Ingrese dos números enteros positivos");
            num1=leer.nextInt();
            num2=leer.nextInt();
        } while (num1<0 || num2<0);

        do {
            System.out.println("Elija una opción");
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("La suma de los números es: " + (num1+num2));
                        confirma="N";
                        break;
                    case 2:
                        System.out.println("La resta de los números es: "+ (num1-num2));
                        confirma="N";
                        break;
                    case 3:
                        System.out.println("El producto de los números es: "+(num1*num2));
                        confirma="N";
                        break;
                    case 4:
                        System.out.println("El cociente de los números es: "+(num1/num2));
                        confirma="N";
                        break;
                    case 5:
                        do{
                        System.out.println("Está seguro? S/N");
                        confirma=leer.next();
                        }while(!confirma.equalsIgnoreCase("S") && !confirma.equalsIgnoreCase("N"));
                        break;
                    default:
                        System.out.println("Elija una opción válida");
                        confirma="N";
                        break;
                    
                    
            
                        
            }
            
    } while (!confirma.equalsIgnoreCase("S"));
        
    }
    
}
