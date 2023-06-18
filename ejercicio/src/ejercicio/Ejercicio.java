
package ejercicio;

import java.util.Scanner;

public class Ejercicio {

    
    public static void main(String[] args) {
        int num [] = new int [15];
        int contador=0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<num.length; i++){
            System.out.println("ingrese un numero: ");
            num[i]= sc.nextInt();
        }
        
        for(int i = 0;i<num.length; i++){
            
            if(num[i] ==3){
            contador =contador +1;
            }
        }
        System.out.println("la cantidad de numeros 3 q hay es: " +contador);
    }
    
}
