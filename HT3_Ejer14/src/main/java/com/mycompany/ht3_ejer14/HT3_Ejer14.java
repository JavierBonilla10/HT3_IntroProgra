/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer14;

/**
 *
 * @author Javier
 */
public class HT3_Ejer14 {

    public static void main(String[] args) {
        System.out.print("*----------------------------*\n");
        System.out.print("* Resolucion de la integral  *\n");
        System.out.print("*        ∫ x^2 + x dx        *\n");
        System.out.print("*          de 0 a 10         *\n");
        System.out.print("* Por el metodo del trapecio *\n");
        System.out.print("*----------------------------*\n");
        
        double delta = (((10-0)/10));
        double deltat = delta / 2;
        int contador = 1;
        double xi = 1;
        double total1 = 0;
        double total2 = 0;
        double total;
        
        while (contador < 10) {
            total2 += (2*(Math.pow(xi,2)+(xi)));
        xi++;
        contador++;
        }
        
        total1 = Math.pow(10,2)+(10);

        total = deltat*(total1+total2);
        
        System.out.print("EL resultado con una aproximacion de 10 repeticiones es: " + total);
        //el resultado segun el numero de repeticiones puede variar

    }
}
