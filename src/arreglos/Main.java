/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opc;

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n"
                    + "1. Crear arreglo de numeros\n"
                    + "2. Crear arreglo de cadenas\n"
                    + "3. Crear arreglo de caracteres"
                    + "0. Salir"));

            switch (opc) {

                case 1:
                    int opc2;

                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
                    int numeros[] = new int[cant];
                    
                    Arreglo a1 = new Arreglo(numeros);
                    
                    do {

                        opc2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n"
                                + "1. Agregar numeros\n"
                                + "2. Buscar numero\n"
                                + "3. Ordenar numeros"
                                + "0. Salir"));

                        switch (opc2) {

                            case 1:                          

                                for (int i = 0; i < cant; i++) {

                                    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));

                                    numeros[i] = num;
                                }

                                break;
                                
                            case 2:
                                
                                int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que busca:"));
                                
                                a1.buscarNumero(buscar);

                        }

                    } while (opc != 0);

            }

        } while (opc != 0);

        /*int a[] = {10, 50, 564, 910, 41, 1};
        String s[] = {"Sandra", "Andres", "Camilo", "Ana"};
        char c[] = {'f', '@', 'x', 'r', '$'};

        Arreglo arr = new Arreglo(a);
        Arreglo arr2 = new Arreglo(s);
        Arreglo arr3 = new Arreglo(c);

        arr.buscarNumero(910);
        arr.ordenarNumeros();

        System.out.println();
        arr2.ordenarCadena();

        System.out.println();
        arr3.ordenarCaracteres();*/

    }

}
