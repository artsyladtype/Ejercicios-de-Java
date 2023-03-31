/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg11.extra.pkg6;

import java.util.Scanner;

/**
 *Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
 * medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
* siguientes funciones de Java substring(), Length() y Math.random().
 * @author usuario
 */
public class Día11Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        String p1,p2,p3,p4,p5;
        String [][]matriz=new String[20][20];
        inicializarMatriz(matriz);
        ubicarPalabras(matriz);
        
            /*System.out.println("Ingrese una palabra");
            do{
            p1=leer.nextLine();
            }while(p1.length()<3 || p1.length()>5);
            
            System.out.println("Ingrese otra palabra");
            do{
            p2=leer.nextLine();
            }while(p2.length()<3 || p2.length()>5);
            
            System.out.println("Ingrese otra palabra");
            do{
            p3=leer.nextLine();
            }while(p3.length()<3 || p3.length()>5);
            
            System.out.println("Ingrese otra palabra");
            do{
            p4=leer.nextLine();
            }while(p4.length()<3 || p4.length()>5);
            
            System.out.println("Ingrese otra palabra");
            do{
            p5=leer.nextLine();
            }while(p5.length()<3 || p5.length()>5);*/
            

        

        
    }
        public static void inicializarMatriz(String matriz[][]){
            
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    
                    matriz[i][j]=String.valueOf((int)(Math.random()*10));
                    
                }
                
            }
            /*for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(matriz[i][j]+" ");
                    
                }
                System.out.println("");*/
            }
            public static void ubicarPalabras(String matriz[][]){
        int r1, r2, r3, r4, r5;
        /*String []v1=new String[p1.length()];
            String []v2=new String[p2.length()];
            String []v3=new String[p3.length()];
            String []v4=new String[p4.length()];
            String []v5=new String[p5.length()];
            
            for (int i = 0; i < p1.length(); i++) {
                v1[i]=p1.substring(i,i+1);
            }*/
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            Scanner leer=new Scanner(System.in);
            System.out.print("Ingrese palabra " + (i + 1) + "  -> ");
            palabras[i] = leer.next();
            if (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres");
                i--;
            }
            
                
            }
        

        
            do {
                r1 = (int) (Math.random() * 20);
                r2 = (int) (Math.random() * 20);
            r3 = (int) (Math.random() * 20);
            r4 = (int) (Math.random() * 20);
            r5 = (int) (Math.random() * 20);

        } while (r1 == r2 || r1 == r3 || r1 == r4 || r1 == r5 || r2 == r3 || r2 == r4 || r2 == r5
                || r3 == r4 || r3 == r5 || r4 == r5);
            
        

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
               /* if (i == r1 && j<palabras[i].length()) {*/
                    matriz[i][j]=palabras[i].substring(j,j+1);

                /*}*/

            }
            

        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

    }

        }
        
        


    

    
    

