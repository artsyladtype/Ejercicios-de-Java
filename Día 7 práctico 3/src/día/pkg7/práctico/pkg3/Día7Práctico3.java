/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg7.práctico.pkg3;

import java.util.Scanner;

/**
 *  Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 * @author usuario
 */
public class Día7Práctico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double euros;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros=leer.nextDouble();
        leer.nextLine();
        do{
        System.out.println("Ingrese la moneda a la que desea convertir: "
                + "dólares, yenes o libras");
        moneda=leer.nextLine();
        }while(!moneda.equalsIgnoreCase("dolares")&& !moneda.equalsIgnoreCase
        ("yenes")&&!moneda.equalsIgnoreCase("libras"));
        convert(euros,moneda);
        
        
    }
    
    public static void convert(double euros,String moneda){
        
        double respuesta=0;
        
        switch(moneda){
            case "libras":
                respuesta=euros*0.86;
                break;
            case "dolares":
                respuesta=euros*1.28611;
                break;
            case "yenes":
                respuesta=euros*129.852;
        }
        
        System.out.println("Los euros ingresados son equivalentes a "+respuesta+" "+moneda);
        
    }
    
}
