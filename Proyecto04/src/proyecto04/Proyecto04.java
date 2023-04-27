/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto04;
import java.util.Scanner;
public class Proyecto04 {
    public static void main(String[] args) {
        //OBJETOS
        Metodos obj = new Metodos();
        Scanner entrada = new Scanner(System.in);
        //VARIABLES
        int lim;
        int opcionmenu;
        int num;
        int ev;
        
        //PROCESO
        System.out.println("Ingrese el tamano del arreglo");
        lim = entrada.nextInt();
        obj.setLim(lim);
        opcionmenu = obj.menu();
        
        int [] arreglo= new int[lim];
        
        switch(opcionmenu){
            case 0 -> ev=obj.insFull(arreglo);
        }
        
        
    }
    
}
