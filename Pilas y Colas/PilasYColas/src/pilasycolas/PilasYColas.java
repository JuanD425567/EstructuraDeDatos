package pilasycolas;

import java.util.Scanner;

public class PilasYColas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lim;
        int op;
        int num;
        System.out.println("[Ingrese el tamano de la Pila]");
        lim = entrada.nextInt();
        MetodosCola myCola = new MetodosCola(lim);
        do {
            op = myCola.menu();
            switch(op){
                case 1 -> myCola.Push();
                case 2 -> myCola.Pop();
                default->{}
            }
        } while (op!=0 );
    }
    
}
