/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg11.práctico.pkg6.pkg1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Día11Práctico61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        System.out.println("Ingrese los valores de la matriz.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        comprobar(matriz);

    }

    public static void comprobar(int[][] matriz) {
        boolean num = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    num = false;
                }

            }
        }
        if (num == true) {
            calcularMagica(matriz);
            imprimirMatriz(matriz);
        } else {
            System.out.println("Error");
        }
    }

    public static void calcularMagica(int[][] matriz) {
        int columna = 0, fila = 0, diagonal1 = 0, diagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            columna = 0;
            fila = 0;
            for (int j = 0; j < 3; j++) {
                fila += matriz[i][j];
                columna += matriz[j][i];
                if (i == j) {
                    diagonal1 += matriz[i][j];
                }
                if (i + j == 3) {
                    diagonal2 += matriz[i][j];
                }
            }
        }
        if ((diagonal1 == diagonal2) || (fila == columna)) {
            System.out.println("La matriz es magica y la suma es: " + fila);

        } else {
            System.out.println("La matriz no es magica");
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println("");
        }
        System.out.println(" ");
    }
}
