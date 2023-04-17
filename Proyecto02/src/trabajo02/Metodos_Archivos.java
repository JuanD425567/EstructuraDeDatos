/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo02;

import java.util.Scanner;
import java.io.*;

@SuppressWarnings("empty-statement")
public class Metodos_Archivos {

    Scanner entrada;
    File archivo = new File("MiArchivo.txt");

    public Metodos_Archivos() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Escribir archivo[1]:");
        System.out.println("Leer desde archivo[2]:");
        System.out.println("Salir [0]:");
        return entrada.nextInt();

    }

    public void ingresar() {
        FileWriter escribir; //Escribir en el archivo txt
        PrintWriter linea; //Llevar informacion al archvio txt
        String nombre = "";
        String correo = "";
        String dir = "";
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (Exception e) {
        }
        try {
            entrada.nextLine();//Permite leer String
            System.out.println("Digite el nombre");
            nombre = entrada.nextLine();

            System.out.println("Digite el correo");
            correo = entrada.nextLine();

            System.out.println("Digite la direccion");
            dir = entrada.nextLine();
            escribir = new FileWriter(archivo, true);//reescribe el archivo de 
            //texto
            linea = new PrintWriter(escribir);
            linea.println(nombre + "\n" + correo + "\n" + dir);
            linea.close();
        } catch (Exception e) {
        }
    }

    public void presentar() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "";
        String nombre = "";
        String correo = "";
        String dir = "";
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena != null)
               try {
                cadena = almacenamiento.readLine();
                nombre = cadena;
                cadena = almacenamiento.readLine();
                correo = cadena;
                cadena = almacenamiento.readLine();
                dir = cadena;
                   if (cadena !=null) {
                       System.out.println("Nombre: "+nombre+"\nCorreo: "+correo+
                               "\nDireccion: "+dir+"\n");
                   }
            } catch (Exception e) {
            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {
        }
    }
}
