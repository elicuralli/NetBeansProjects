
package matriz;

import java.util.Scanner;

public class Matriz {

   
    public static void main(String[] args) {
        int matriz [][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        
        for(int i =0; i<matriz.length;i++){
            for(int j = 0; j<matriz.length; j++){
             System.out.println("ingrese un numero: ");
             matriz[i][j] = sc.nextInt();
               
            }
           
        }
        
        for(int i =0; i<matriz.length;i++){
            for(int j = 0; j<matriz.length; j++){
             System.out.println("el valor de la posicion  "+i+j+" es: "+matriz[i][j]);
               
            }
           
        }
    }
    
}
