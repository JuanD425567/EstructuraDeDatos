package pilasycolas;

import java.util.Scanner;

public class MetodosCola {

    Scanner entrada = new Scanner(System.in);
    //VARIABLES A UTILIZAR.
    int[] myCola;
    int tope;

    //EL CONSTRUSCTOR DONDE SE INICIALIZAN LAS VARIABLES,OBJETO(SCANNER).
    public MetodosCola(int _lim) {
        this.entrada = new Scanner(System.in);
        this.myCola = new int[_lim];
        this.tope = -1;
    }

    //MENU DE OPCIONES
    public int menu() {
        System.out.println("-----------------------------------------");
        System.out.println("|           [MENU PRINCIPAL]            |");
        System.out.println("|-Push  [1]                             |");
        System.out.println("|-Pop   [2]                             |");
        System.out.println("|-Salir [0]                             |");
        System.out.println("-----------------------------------------");
        return entrada.nextInt();
    }

    //AQUI SE COMPARA SI LA PILA TIENE ESPACIO O NO.
    public boolean colaLlena() {
        if (this.tope == myCola.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean colaVacia() {
        if (this.tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    //EL METODO PUSH PARA INGRESAR UN ELEMENTO A LA ULTIMA POSICION.
    public void Push() {
        if (!colaLlena()) {
            System.out.println("Ingrese elemento");
            tope++;
            myCola[tope] = entrada.nextInt();
        } else {
            System.out.println("[LA PILA ESTA LLENA]");
        }

    }

    //EL METODO POP PARA ELIMINAR EL PRIMER VALOR.
    public void Pop() {
        if (!colaVacia()) {
            System.out.println(myCola[0]);
            if (tope !=0) {
                recorreIzq();
            }
            tope = tope--;
        }
    }
    public void recorreIzq(){
        for (int i = 0; i < tope; i++) {
            myCola[i]=myCola[i+1];
        }
    }
}
