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
        int opcion1 = 0;
        int opcion2 = 0;
        do {

            System.out.println("\n\n");
            System.out.println(" | MENÚ |");
            System.out.println(" |-----------------------|-----------------------|");
            System.out.println(" | 1. Recorrer inorden| 6.Recorrer preorden (texto)|");
            System.out.println(" | 2. Recorrer postord| 9.                         |");
            System.out.println(" | 3. Recorrer preorde| 10.                        |");
            System.out.println(" | 4. Recorrer inorden(txt) |                      |");
            System.out.println(" | 5. Recorrer postorden(txt) |                    |");
            System.out.println(" | 20. Quit                                        |");
            System.out.println(" |-----------------------|-----------------------|");
            System.out.print(" Elija una Opción: ");

            opcion1 = sc.nextInt();
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
            switch (opcion1) {
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
        } while (opcion1 != 20);

    }
}
