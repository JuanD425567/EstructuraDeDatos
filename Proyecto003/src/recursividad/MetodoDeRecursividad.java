/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

public class MetodoDeRecursividad {

    Scanner entrada;

    public MetodoDeRecursividad() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Factorial [1]");
        System.out.println("Fibonacci [2]");
        System.out.println("Potencia [3]");
        System.out.println("MCD [4]");
        System.out.println("Salir [0]");
        return entrada.nextInt();
    }
    public int factorial(int num){
        if((num== 1) || (num == 0))
            return 1;
        else
           return num*factorial(num-1);
    }
    public int fibo (int num){
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;
        else 
            return fibo(num-1)+fibo(num-2);
    }
    public int potencia (int a,int b){
        if (a == 0 )
            return 1;
        else if(a ==1)
            return a;
        else 
            return a*potencia(a,b-1);
        
    }
}
