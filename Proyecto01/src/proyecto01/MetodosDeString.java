/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto01;

import java.util.Scanner;

public class MetodosDeString {

    Scanner entrada;
    String cadena;

    public MetodosDeString() {
        this.entrada = new Scanner(System.in);
        this.cadena = "";
    }

    public int menu() {
        int opcion;
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Imprimir caracter por caracter [1]");
        System.out.println("Contar veces que se repide caracter [2]");
        System.out.println("Averiguar si un caracter es un palindo [3]");
        System.out.println("Contar vocales y consonantes [4]");
        System.out.println("Salir [0]");
        System.out.println("------------------------------------------");
        opcion = entrada.nextInt();
        return opcion;
    }

    public void carxcar() {
        entrada.nextLine();
        System.out.println("Ingrese cadena:");
        cadena = entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    public void veces() {
        entrada.nextLine();
        int cantidad = 0;
        System.out.println("Ingrese cadena:");
        cadena = entrada.nextLine();
        System.out.println("Ingrese caracter a revisar");
        char caracter = entrada.next().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                cantidad=cantidad+1;
            }
        }
    }
    public void palindromo() {
    int j;
    boolean sies=true;
    entrada.nextLine();
        System.out.println("Digite una cadena de caracteres: ");
        cadena = entrada.nextLine();
        String cad=eliminaEspacios(cadena);
        j=cad.length()-1;
        for (int i = 0; i <cad.length()/2; i++) {
            if (cad.charAt(i)!=cad.charAt(j)) {
                sies=false;
                System.out.println("No es palindromo");
                break;
                
            }
            j--;
        }
        if(sies==true)
            System.out.println("Si es palindromo");
    }
}
