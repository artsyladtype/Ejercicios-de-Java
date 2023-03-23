/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg6.extra.pkg10;
import java.util.Scanner;

/**
 * Realice un programa para que el usuario adivine el resultado de una
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
 * El programa debe indicar al usuario si su respuesta es o no correcta. En caso
 * que la respuesta sea incorrecta se debe permitir al usuario ingresar su
 * respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
 * la función Math.random() de Java.
 *
 * @author usuario
 */
public class Día6Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int num1,num2,rta,producto,cont;
        cont=0;

        num1=(int) (Math.random()*10);
        num2=(int) (Math.random()*10);
        producto=num1*num2;
        System.out.println(num1);
        System.out.println(num2);
        
        
        ///MMMMMM DIJO LA MUDA
        do{
            if (cont==0){
            System.out.println("Adivine el resultado de una multiplicación entre "
                    + "dos números aleatorios entre 0 y 10");
            rta=leer.nextInt();
            cont++;
            }else{
                System.out.println("¡Intente de nuevo!");
                rta=leer.nextInt();
            }
        }while(rta!=producto);
        
        System.out.println("¡Lo ha adivinado!");
    }
    
    
}
