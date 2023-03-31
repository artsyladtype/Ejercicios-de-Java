/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día.pkg9.práctica.pkg4;

/**
 *
 * @author usuario
 */
public class Día9Práctica4 {

    /**
     * 
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int [][] matrizA=new int[4][4];
        int [][] matrizB=new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j]=(int)(Math.random()*10);
            }
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j]=matrizA[j][i];
            }
        }
        
        imprimirMatriz(matrizA);
        System.out.println("");
        System.out.println("");
        imprimirMatriz(matrizB);
    }
    
    public static void imprimirMatriz(int matriz[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("");
            
        }
}
    
}
