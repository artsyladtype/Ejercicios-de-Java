/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg9.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día9Ejercicio3 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector");
        
        int n=leer.nextInt();
        int []vector=new int[n];
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,intLargo;
        String numString;

        for (int i = 0; i < n; i++) {

            do {
                System.out.println("Ingrese un número de hasta 5 dígitos");
                vector[i] = leer.nextInt();
            } while (vector[i] < 0 || vector[i] >= 100000);
            numString = String.valueOf(vector[i]);
            intLargo=numString.length();
            
            /*
            if (vector[i]>=0 && vector[i]<=9){
            cont1++
            }else if(vector[i]>=10 && vector[i]<=99){
            cont2++
            }
            etc
            
            
            
            */
            
            switch (intLargo){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                    
            }
            
            
            
            
            
            
        }
       
        System.out.println("Se encontraron " + cont1 + " números de 1 cifra.");
        System.out.println("Se encontraron " + cont2 + " números de 2 cifras.");
        System.out.println("Se encontraron " + cont3 + " números de 3 cifras.");
        System.out.println("Se encontraron " + cont4 + " números de 4 cifras.");
        System.out.println("Se encontraron " + cont5 + " números de 5 cifras.");
    }
    
}
