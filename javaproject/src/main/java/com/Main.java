package com;
/**Universidad del Valle de Guatemala
 * @author Aaron Beltran
 * @author Diana Diaz
 * @author Mariel Guamuche 
 * 
 * Algoritmos y estructuras de datos 
 * Hoja de trabajo 2
 */

//imports
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Hello world!
 */
public final class Main {
    private Main() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // permite leer datos desde terminal 
        boolean continuar = true; // continuara el ciclo de iteraciones del menu 
        int opcion = 0; // guarda la opcion del usuario
        Pila pila = new Pila(); // creación objeto de clase pila 
        BufferedReader file;

        while(continuar!=false) {
            System.out.println("Bienvenido\n¿Deseas operar la calculadora?\n1. Sí\n2. No");
            opcion = isInt(scanner); // se valida y escanea la opcion del usuario
          
            if(opcion==1) {
                // llamada para hacer lectura
                readFile();
                
                // llamada de calculadora 
                System.out.println("---\nEl resultado es: " + pila.calculate("incluir expresion leida aqui")+"\n---");   
            } else {
                continuar = false; // se debe de cerrar el ciclo
                System.out.println("Gracias por usar este simulador");
            }
        }
        scanner.close();
    }

    private static int isInt(Scanner scanner) {
        boolean isNum=false; // bandera para parar validaciones
        int number=0; // valor numerico que se retorna
        while(!isNum) {
            try{
                number = Integer.parseInt(scanner.nextLine());
                isNum = true;
            } catch(NumberFormatException e) {
                System.out.println("Error. Verifique que el valor ingresado sea numérico e intente de nuevo.");
            }
        }
        return number;
    }

    /**
     * Metodo para leer archivos
     */
    private static void readFile() {
        try {
            File myObj = new File("datos.txt"); //se guarda el archivo en un objeto tipo file
            Scanner myReader = new Scanner(myObj);
            /*se lee la linea del file */
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine(); //se guarda 
              List<String> list = new ArrayList<String>();//se crea una nueva arraylist
              list.add(data); //se agrega al arraylist
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
          }
    }
}
