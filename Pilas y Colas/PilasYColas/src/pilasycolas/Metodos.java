package pilasycolas;

import java.util.Scanner;

public class Metodos {

    Scanner entrada = new Scanner(System.in);
    //VARIABLES A UTILIZAR.
    int[] myPila;
    int tope;

    //EL CONSTRUSCTOR DONDE SE INICIALIZAN LAS VARIABLES,OBJETO(SCANNER).
    public Metodos(int _lim) {
        this.entrada = new Scanner(System.in);
        this.myPila = new int[_lim];
        this.tope = -1;
    }

    //MENU DE OPCIONES
    public int menu() {
        System.out.println("-----------------------------------------");
        System.out.println("            [MENU PRINCIPAL]            |");
        System.out.println("-Push  [1]                              |");
        System.out.println("-Pop   [2]                              |");
        System.out.println("-Salir [0]                              |");
        System.out.println("-----------------------------------------");
        return entrada.nextInt();
    }

    //AQUI SE COMPARA SI LA PILA TIENE ESPACIO O NO.
    public boolean pilaLlena() {
        if (this.tope == myPila.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilaVacia() {
        if (this.tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    //EL METODO PUSH PARA INGRESAR UN ELEMENTO A LA ULTIMA POSICION.
    public void Push() {
        if (!pilaLlena()) {
            System.out.println("Ingrese elemento");
            tope++;
            myPila[tope] = entrada.nextInt();
        } else {
            System.out.println("[LA PILA ESTA LLENA]");
        }

    }

    //EL METODO POP PARA ELIMINAR EL ULTIMO VALOR.
    public void Pop() {
        if (!pilaVacia()) {
            System.out.println(myPila[tope]);
            tope--;
        } else {
            System.out.println("[LA PILA ESTA VACIA]");
        }
    }
}
