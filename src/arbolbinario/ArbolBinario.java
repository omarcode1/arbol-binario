/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.Scanner;

/**
 *
 * @author omarl
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionMenu = 0;
//        int opcion2 = 0;
        do {

            System.out.println("\n\n");
            System.out.println(" |                                  MENÚ                                 |");
            System.out.println(" |------------------------------------|----------------------------------|");
            System.out.println(" | 1. Recorriendo inorden - numerico  | 4. Recorriendo inorden - texto   |");
            System.out.println(" | 2. Recorriendo postorden - numerico| 5. Recorriendo postorden - texto |");
            System.out.println(" | 3. Recorriendo preorden - numerico | 6. Recorriendo preorden - texto  |");
            System.out.println(" | 10. Salir                          | 10.No Disponible                 |");
            System.out.println(" |------------------------------------|----------------------------------|");
            System.out.print(" Elija una Opción: ");
            opcionMenu = sc.nextInt();
            ArbolEnteros arbol = new ArbolEnteros();
            arbol.insertar(1);
            arbol.insertar(2);
            arbol.insertar(3);
            arbol.insertar(4);
            arbol.insertar(0);

            ArbolCadenas arbolCadenas = new ArbolCadenas();
            arbolCadenas.insertar("Luis");
            arbolCadenas.insertar("Chris");
            arbolCadenas.insertar("Zelda");
            arbolCadenas.insertar("Cuphead");
            arbolCadenas.insertar("Leon");
            switch (opcionMenu) {
                case 1:
                    System.out.println("Recorriendo inorden:");
                    arbol.inorden();
                    System.out.println(arbol.existe(1)); // true
                    System.out.println(arbol.existe(7)); // false
                    System.out.println(arbol.existe(0)); // true
                    break;
                case 2:
                    System.out.println("Recorriendo postorden:");
                    arbol.postorden();
                    System.out.println(arbol.existe(1)); // true
                    System.out.println(arbol.existe(7)); // false
                    System.out.println(arbol.existe(0)); // true
                    break;
                case 3:
                    System.out.println("Recorriendo preorden:");
                    arbol.preorden();
                    System.out.println(arbol.existe(1)); // true
                    System.out.println(arbol.existe(7)); // false
                    System.out.println(arbol.existe(0)); // true
                    break;

                case 4:

                    System.out.println("Recorriendo inorden:");
                    arbolCadenas.inorden();
                    System.out.println(arbolCadenas.existe("Luis")); // true
                    System.out.println(arbolCadenas.existe("Claire")); // false
                    System.out.println(arbolCadenas.existe("Zelda")); // true
                    break;
                case 5:
                    System.out.println("Recorriendo postorden:");
                    arbolCadenas.postorden();
                    System.out.println(arbolCadenas.existe("Luis")); // true
                    System.out.println(arbolCadenas.existe("Claire")); // false
                    System.out.println(arbolCadenas.existe("Zelda")); // true
                    break;
                case 6:
                    System.out.println("Recorriendo preorden:");
                    arbolCadenas.preorden();
                    System.out.println(arbolCadenas.existe("Luis")); // true
                    System.out.println(arbolCadenas.existe("Claire")); // false
                    System.out.println(arbolCadenas.existe("Zelda")); // true
                    break;

                default:
                    System.out.println("\n\n Opción no válida! \n");

                    break;
            }
        } while (opcionMenu != 10);

    }
}