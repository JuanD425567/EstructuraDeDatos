/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author SALA H
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodoDeRecursividad obj = new MetodoDeRecursividad();
        int opc;
        int num;
        int exp;
        int a;
        int b;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> {
                    System.out.println("Ingrese numero: ");
                    num = obj.entrada.nextInt();
                    System.out.println("El factorial de" + num + "es:"
                            + obj.factorial(num));
                }
                case 2 -> {
                    System.out.println("Ingrese posicion");
                    num = obj.entrada.nextInt();
                    System.out.println("El fibo de la posicion" + num
                            + "es" + obj.fibo(num));
                }
                case 3 -> {
                    System.out.println("Ingresa base:");
                    num = obj.entrada.nextInt();
                    System.out.println("Ingrese exponente");
                    exp = obj.entrada.nextInt();
                    System.out.println(num + "elevado a la potencia" + exp
                            + "es:" + obj.potencia(num, exp));
                }
            }
        }while (opc !=0);
    }
}
