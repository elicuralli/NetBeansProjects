
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Double matriz[][] = new Double[4][4];
        Double suma = 0.0;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<4;i++){
            for(int j =0;j<3;j++){
                System.out.print("ingrese las calificaciones obtenidas del alumno 1"+i+": ");
                matriz[i][j] =sc.nextDouble();
                suma+= matriz[i][j];
            
            }
            matriz[i][3] = suma/3; //agrego el promedio en la columna 3 
            suma = 0.0; //contador vuelve a 0
        }
        
        //mostramos las notas
        for(int i = 0; i<4;i++){
            System.out.print("las calificaciones obtenidas del alumno "+i+" son: ");
            for(int j =0;j<3;j++){
                
                System.out.println("nota "+j+ ": "+matriz[i][j]);
            
            }
            System.out.println("el promedio es: "+ matriz[i][3]);
        }
    }
    
}
