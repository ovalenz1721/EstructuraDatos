/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.util.Scanner;

/**
 *
 * @author OHMASTER
 */
public class PilaUno {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opt, tope = 0, tope2 = 0, tam1, tam2, aux = 0, x = 0;
        Boolean encontrado = false;
        //unir pila y pila2 en pila3
        System.out.println("ingresa el tamaño de la pila uno");
        int pila[] = new int[tam1 = sc.nextInt()];
        System.out.println("ingresa el tamaño de la pila dos");
        int pila2[] = new int[tam2 = sc.nextInt()];
        int pila3[] = new int[tam1 + tam2];
        int pila4[] = new int[tam1 + tam2];
        do {
            System.out.println("1- agregar \n"
                    + "2- mostrar \n"
                    + "3- eliminar \n"
                    + "4- mostrar ultimos 3\n"
                    + "5- llenar pila 1 y pila 2\n"
                    + "6- vaciar\n"
                    + "7- Unir pila1 y pila2 \n"
                    + "8- Unir forma 2\n"
                    + "9 salir ");
            switch (opt = sc.nextInt()) {
                case 1:
                    if (tope < tam1) {
                        System.out.println("tope = " + tope);
                        System.out.println("agregar elemento a la pila");
                        pila[tope] = sc.nextInt();
                        tope++;
                        System.out.println("tope = " + tope);
                    } else {
                        System.out.println("pila llena..");
                    }
                    break;
                case 2:
                    if (tope > 0) {
                        System.out.println("contenido de pila 1");
                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.println("posicion: " + i + " tiene el dato: " + pila[i]);
                        }
                        System.out.println("contenido de pila 2");
                        for (int i = tope2 - 1; i >= 0; i--) {
                            System.out.println("posicion: " + i + " tiene el dato: " + pila2[i]);
                        }
                        if (aux == 1) {
                            System.out.println("contenido de pila 3");
                            for (int i = 0; i < pila3.length; i++) {
                                System.out.println("posicion: " + i + " tiene el dato: " + pila3[i]);
                            }
                        }
                    } else {
                        System.out.println("pila vacia..");
                    }
                    break;
                case 3:
                    System.out.println("dato eliminado...");
                    tope--;
                    System.out.println("tope = " + tope);
                    break;
                case 4:
                    System.out.println("ultimos 3");
                    int cont = 0;
                    for (int i = tope - 1; i >= 0; i--) {
                        System.out.println("posicion: " + i + " tiene el dato: " + pila[i]);
                        cont++;
                        if (cont == 3) {
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("llenando de forma automatica pila con numeros aleatorios\n"
                            + "en un rango de 150-200");
                    for (int i = tope; i < tam1; i++) {
                        pila[tope] = (int) (Math.random() * 50 + 150);
                        System.out.println("dato: " + pila[i] + " en posicion: " + tope);
                        tope++;
                    }
                    for (int i = tope2; i < tam2; i++) {
                        pila2[tope2] = (int) (Math.random() * 50 + 150);
                        System.out.println("dato: " + pila2[i] + " en posicion: " + tope2);
                        tope2++;
                    }
                    break;
                case 6:
                    tope = 0;
                    System.out.println("pila vacia...");
                    break;
                case 7:
                    //llenar pila 3 con los valores de pila 1
                    /*  tope2 = 5
                     tam1   5
                     tam2   5
                            0 1 2 3 4 5 6 7 8 9 
                            ----------------------
                     pila   4 8 9 2 3 -
                    
                     pila2  9 1 7 5 6 -
                    
                     pila4  4 9 8 1 9 7 2 5 3 6
                     */
                    //1 2 3 4 5
                    for (int i = 0; i < tam1; i++) {
                        pila3[i] = pila[x];
                        x++;
                    }
                    x = 0;
                    //           10  ;   i<10    ;
                    for (int i = tam1; i < tam1 + tam2; i++) {
                        pila3[i] = pila2[x];
                        x++;
                    }
                    aux = 1;
                break;
                case 8:
                    //ingresan pila1 y pila 2 en pila 4
                    //mostrar pila 4
                    
                break;
            }
        } while (opt != 9);
    }
}
