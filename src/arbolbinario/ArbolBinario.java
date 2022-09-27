/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.Scanner;

/**
 * @author omarl
 */
public class ArbolBinario {

<<<<<<< HEAD
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionMenu = 0;
        int opcion2 = 0;
        do {

            System.out.println("\n\n");
            System.out.println(" |              MENÚ              |");
            System.out.println(" |---------------|-----------------|");
            System.out.println(" | 1. Recorriendo inorden          |");
            System.out.println(" | 2. Recorriendo postorden        |");
            System.out.println(" | 3. Recorriendo preorden         |");
            System.out.println(" | 4. Recorriendo inorden          |");
            System.out.println(" | 5. Recorriendo postorden        |");
            System.out.println(" | 6. Recorriendo preorden         |");
            System.out.println(" |---------------|-----------------|");
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
                    System.out.println(arbol.existe(1));
                    System.out.println(arbol.existe(7)); 
                    System.out.println(arbol.existe(0)); 
                    break;
                case 2:
                    System.out.println("Recorriendo postorden:");
                    arbol.postorden();
                    System.out.println(arbol.existe(1)); 
                    System.out.println(arbol.existe(7)); 
                    System.out.println(arbol.existe(0)); 
                    break;
                case 3:
                    System.out.println("Recorriendo preorden:");
                    arbol.preorden();
                    System.out.println(arbol.existe(1)); 
                    System.out.println(arbol.existe(7)); 
                    System.out.println(arbol.existe(0)); 
                    break;

                case 4:
                    System.out.println("Recorriendo inorden:");
                    arbolCadenas.inorden();
                    System.out.println(arbolCadenas.existe("Luis")); 
                    System.out.println(arbolCadenas.existe("Claire")); 
                    System.out.println(arbolCadenas.existe("Zelda")); 
                    break;
                case 5:
                    System.out.println("Recorriendo postorden:");
                    arbolCadenas.postorden();
                    System.out.println(arbolCadenas.existe("Luis")); 
                    System.out.println(arbolCadenas.existe("Claire")); 
                    System.out.println(arbolCadenas.existe("Zelda"));
                    break;
                case 6:
                    System.out.println("Recorriendo preorden:");
                    arbolCadenas.preorden();
                    System.out.println(arbolCadenas.existe("Luis"));
                    System.out.println(arbolCadenas.existe("Claire"));
                    System.out.println(arbolCadenas.existe("Zelda"));
                    break;

                default:
                    System.out.println("\n\n Opción no válida! \n");

                    break;
            }
        } while (opcionMenu != 20);
        
//        Scanner sc = new Scanner(System.in);
//        Scanner sc1 = new Scanner(System.in);
//        ArbolCadenas arbolCadenas = new ArbolCadenas();
//
//        int opciones = 0;
//        do {
//            System.out.println(" |              MENÚ           |");
//            System.out.println(" |-----------------------------|");
//            System.out.println(" | 1. Insertar datos           |");
//            System.out.println(" | 2. Recorriendo inorden      |");
//            System.out.println(" | 3. Recorriendo posterior    |");
//            System.out.println(" | 4. Recorriendo preorden     |");
//            System.out.println(" |-----------------------------|");
//            System.out.print(" Elija una Opción: ");
//            opciones = sc.nextInt();
//
//            switch (opciones) {
//                case 1:
//                    System.out.println("Insertar de datos ");
//                    String dato = sc1.nextLine();
//                    arbolCadenas.insertar(dato);
//                    break;
//                case 2:
//                    System.out.println("Recorriendo inorden:");
//                    arbolCadenas.inorden();
//                    break;
//                case 3:
//                    System.out.println("Recorriendo postorden:");
//                    arbolCadenas.postorden();
//                    break;
//                case 4:
//                    System.out.println("Recorriendo preorden:");
//                    arbolCadenas.preorden();
//                    break;
//                case 5:
//                    System.out.println("No existe mas opciones ");
//                    break;
//
//            }
//
//        } while (opciones != 10);

//        ArbolEnteros arbol = new ArbolEnteros();
//        arbol.insertar(1);
//        arbol.insertar(2);
//        arbol.insertar(3);
//        arbol.insertar(4);
//        arbol.insertar(0);
//        System.out.println("Recorriendo inorden:");
//        arbol.inorden();
//        System.out.println("Recorriendo postorden:");
//        arbol.postorden();
//        System.out.println("Recorriendo preorden:");
//        arbol.preorden();
//        System.out.println(arbol.existe(1)); // true
//        System.out.println(arbol.existe(7)); // false
//        System.out.println(arbol.existe(0)); // true
//
//        ArbolCadenas arbolCadenas = new ArbolCadenas();
//        arbolCadenas.insertar("Luis");
//        arbolCadenas.insertar("Chris");
//        arbolCadenas.insertar("Zelda");
//        arbolCadenas.insertar("Cuphead");
//        arbolCadenas.insertar("Leon");
//        System.out.println("Recorriendo inorden:");
//        arbolCadenas.inorden();
//        System.out.println("Recorriendo postorden:");
//        arbolCadenas.postorden();
//        System.out.println("Recorriendo preorden:");
//        arbolCadenas.preorden();
//        System.out.println(arbolCadenas.existe("Luis")); // true
//        System.out.println(arbolCadenas.existe("Claire")); // false
//        System.out.println(arbolCadenas.existe("Zelda")); // true
=======

    public static void main(String[] args) throws Exception{
        
        ArbolEnteros arbol = new ArbolEnteros();
        ArbolCadenas arbolCadenas = new ArbolCadenas();
        Scanner leer = new Scanner(System.in);
        
        int opcionMenu = 0;
        
        do {
            System.out.println("\n\n");
            System.out.println(" |                        MENÚ                         |");
            System.out.println(" |--------------------------|--------------------------|");
            System.out.println(" | 1. Insertar Numero       | 5. Insertar Texto        |");
            System.out.println(" | 2. Recorriendo Inorden   | 6. Recorriendo Inorden   |");
            System.out.println(" | 3. Recorriendo PostOrden | 7. Recorriendo PostOrden |");
            System.out.println(" | 4. Recorriendo PreOden   | 8. Recorriendo PreOrden  |");
            System.out.println(" |                          |20. Salir                 |");
            System.out.println(" |--------------------------|--------------------------|");
            System.out.print(" Elija una Opción: ");
            opcionMenu = leer.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n\n INSERTAR NUMERO\n");
                    arbol.insertar(leer.nextInt());
                    break;
                case 2:
                    System.out.println("\n\n RECORRIENDO INORDEN\n");
                    arbol.inorden();
                    break;
                case 3:
                    System.out.println("\n\n RECORRIENDO POSTORDEN");
                    arbol.postorden();
                    break;
                case 4:
                    System.out.println("\n\n RECORRIENDO PREORDEN");
                    arbol.preorden();
                    System.out.println(arbol.existe(leer.nextInt())); 
                    break;
                case 5:
                    System.out.println("\n\n INSERTAR TEXTO\n");
                    arbolCadenas.insertar(leer.next());
                    break;
                case 6:
                    System.out.println("\n\n RECORRIENDO INORDEN\n");
                    arbolCadenas.inorden();
                    break;
                case 7:
                    System.out.println("\n\n RECORRIENDO POSTORDEN");
                    arbolCadenas.postorden();
                    break;
                case 8:
                    System.out.println("\n\n RECORRIENDO PREORDEN");
                    arbolCadenas.preorden();
                    System.out.println(arbolCadenas.existe(leer.next()));
                    break;
                default:
                    System.out.println("\n\n Opción no válida! \n");
                    break;
            }
        } while (opcionMenu != 20);
      
>>>>>>> e285bf93162ed2559a3a4986c35f1f0692686422
    }
    
}
