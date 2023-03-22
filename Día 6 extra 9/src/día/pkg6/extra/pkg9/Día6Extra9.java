/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg6.extra.pkg9;

import java.util.Scanner;

/**
 * 
 * Simular la división usando solamente restas. Dados dos números enteros
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
 * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un
 * resultado menor que el divisor, este resultado es el residuo, y el número de
 * restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 *
 * @author usuario
 */
public class Día6Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        
        int num1,num2,cociente,resto;
        cociente=0;
        resto=0;
        
        do{
            System.out.println("Ingrese el dividendo");
            num1=leer.nextInt();
            System.out.println("Ingrese el divisor (debe ser menor o igual que"
                    + " el"
                    + " dividendo");
            num2=leer.nextInt();
        }while (num2>num1 || (num1<=0)||(num2<=0));
        
        do{
            num1=num1-num2;
            cociente=cociente+1;
            if (num1<num2){
                resto=num1;
            }
        }while(num1>=num2);
        
        System.out.println("El cociente de la división es: "+cociente);
        System.out.println("El resto de la división es: "+resto);
        
    }
    
}
