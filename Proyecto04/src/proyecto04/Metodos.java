/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto04;

import java.util.Scanner;

public class Metodos {

    Scanner entrada = new Scanner(System.in);

    private int lim;
    private int opcionmenu;
//set

    public void setLim(int lim) {
        this.lim = lim;
    }

    public void setOpcionmenu(int opcionmenu) {
        this.opcionmenu = opcionmenu;
    }
//get

    public int getOpcionmenu() {
        return opcionmenu;
    }

    public int getLim() {
        return lim;
    }

    public int menu() {
        System.out.println("Insertar completo  [0]");
        System.out.println("Insertar al Final  [1]");
        System.out.println("Insertar al inicio [2]");
        System.out.println("Insertar ordenado  [3]");
        System.out.println("Presentar          [4]");
        System.out.println("Salir              [5]");
        opcionmenu = entrada.nextInt();
        return opcionmenu;
    }

    public int insFull(int[] X) {
        for (int i = 0; i < X.length; i++) {
            System.out.println("Ingrese elemento[" + i + "]: ");
            X[i] = entrada.nextInt();
        }
        return X.length;
    }
    

}
