/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg6.extra.pkg7.pkg2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día6Extra72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in);
        
        int num,cont,max,min;
        double prom,suma,n;
        cont=0;
        max=0;
        min=0;
        suma=0; 
        
        do{
        System.out.println("Ingrese la cantidad de números a introducir(>0)");
        n=leer.nextInt();
        }while (n<=0);
        
        do{
            
            System.out.println("Ingrese un número");
            num=leer.nextInt();
            if (num>max){
                max=num;
            }else{
                max=max;
            }
            if (cont==0){
                min=num;
            }else if(num<min){
                min=num;
            }else{
                min=min;
            }
            cont=cont+1;
            suma=suma+num;
        }while (cont<n);
        
        prom=suma/n;
        
        System.out.println("El valor máximo introducido fue: "+max);
        System.out.println("El valor mínimo introducido fue: "+min);
        System.out.println("El promedio de los números introducidos fue: "+prom);
    }
    
}
