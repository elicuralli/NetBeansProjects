
package funciones;

import java.util.Scanner;


public class Funciones {

    
    public static void main(String[] args) {
        int a,b;
        int res;
        Scanner sc = new Scanner(System.in);
        

        System.out.println("ingrese un numero: ");
        a = sc.nextInt();
        
        System.out.println("ingrese otro numero: ");
        b = sc.nextInt();
        
        res = suma(a, b);
        System.out.println("su resultado es: "+res);
        
    }
    public static int suma(int a,int b){
        return a+b;
    
    }
    
}
