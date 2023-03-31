/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg9.práctico.pkg5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día9Práctico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        
        System.out.println("A continuación, rellene dos matrices de"
                + " 3*3. Le diremos, "
                + "al final, si la matriz B es antisimétrica respecto a la"
                + " matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el siguiente número de la matriz A");
                matrizA[i][j] = leer.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el siguiente número de la matriz B");
                matrizB[i][j] = leer.nextInt();
            }
        }

        imprimirMatriz(matrizA);
        System.out.println("");
        System.out.println("");
        imprimirMatriz(matrizB);
        
        antiSimetrica(matrizA,matrizB);
    }

    public static void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");

        }
    }

    public static void antiSimetrica(int matrizA[][], int matrizB[][]) {

        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matrizA[i][j] != -(matrizB[i][j])) || matrizA[i][j] != matrizB[j][i]) {
                    cont++;
                }else{
                    cont=cont;
                }

            }

        }

        if(cont!=0){
            System.out.println("La matriz B no es antisimétrica respecto a A");
        }else{
            System.out.println("La matriz B es antisimétrica respecto a A");
        }
        
    }
}
   
