/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Arreglo {

    int a[];
    String s[];
    char c[];
    
    public Arreglo(int a[]) {
        this.a = a;
    }
    
    public Arreglo(String s[]) {
        this.s = s;
    }
    
    public Arreglo(char c[]) {
        this.c = c;
    }

    public void buscarNumero(int dato) {
        int seguir = 0;
        for (int i = 0; i < a.length && seguir == 0; i++) {
            if (a[i] == dato) {
                System.out.println("dato " + dato + " fue encontrado en la posicion " + i);
                seguir = 1;
            }
        }
        if (seguir == 0) {
            System.out.println("Dato " + dato + " no encontrado");
        }
    }

    public void ordenarNumeros() {
        int i, j;
        int lon = a.length;
        int aux;
        for (i = 0; i < lon - 1; i++) {
            for (j = i + 1; j < lon; j++) {
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }

        //imprimir
        for (i = 0; i < lon; i++) {
            System.out.println(a[i] + " ");
        }

    }

    public void ordenarCadena(){
        
        Arrays.sort(s);
        
        for(String nombres : s){
            System.out.println(nombres);
        }
    }
    
    public void ordenarCaracteres(){
        
        Arrays.sort(c);
        
        for(char caracter : c){
            System.out.println(caracter);
        }
    }
    
    
    
}
