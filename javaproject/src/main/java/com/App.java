package com;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // permite leer datos desde terminal 
        boolean continuar = true; // continuara el ciclo de iteraciones del menu 
        int opcion = 0; // guarda la opcion del usuario

        while(continuar!=false) {
            System.out.println("Bienvenido\n¿Deseas operar la calculadora?\n1. Sí\n2. No");
            opcion = isInt(scanner); // se valida y escanea la opcion del usuario

            if(opcion==1) {
                // llamada para hacer lectura
                // llamada de calculadora 
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
}
