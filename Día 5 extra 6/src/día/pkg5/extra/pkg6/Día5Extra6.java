/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg5.extra.pkg6;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 * @author usuario
 */
public class Día5Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int n,cont1;
        double prom1,prom2,estatura,sum1,sum2;
        sum1=0;
        sum2=0;
        cont1=0;
        
        System.out.println("Ingrese la cantidad de personas a calcular");
        n=leer.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println("Estatura "+i+":");
            estatura=leer.nextDouble();
            sum2=sum2+estatura;
            if (estatura<1.60){
                cont1++;
                sum1=sum1+estatura;
            }
            

        }
        
            prom1=sum1/cont1;
            prom2=sum2/n;
            
            System.out.println("El promedio de estatura de las personas de menos de 1.6 mts de estatura es: "+prom1);
            System.out.println("El promedio general de estatura es: "+prom2);
        
    }
    
}
