
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        
        /* int vector [] ; int vector[] = new int[4];
        
        llenado 
        vector[0] =35...
        */
        
        int vector [] = new int[5]; 
        Scanner sc = new Scanner(System.in); 
        
        for (int i = 0; i<vector.length; i++){
            System.out.print("ingrese un numero para la posicion "+i+" : ");
            vector[i]= sc.nextInt();  
        }
        
        for(int i = 0; i<vector.length; i++){
            
            System.out.println("el indice es: " + i+ " y el contenido es: " +vector[i]);
        
        }
        
        
   }
           
}
    

