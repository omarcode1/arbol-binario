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
      
    }
    
}
