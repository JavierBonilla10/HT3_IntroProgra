/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer11;
import java.util.Scanner;
/**
 *
 * @author Javier
 */
public class HT3_Ejer11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A continuacion ingresa en Kg el peso de cada pieza: ");
        double pieza = sc.nextDouble();
        int contador1= 0;
        int contador2 = 0;
        int contador3 = 0;

        
        while (pieza != 0){
            System.out.print("Ingresa en Kg el peso de cada pieza: ");        
            pieza = sc.nextDouble();    
            if (pieza > 9.8) {
                contador1++;
            }
            if (pieza >= 9.8 && pieza <= 10.2) {
                contador2++;
            }
            if (pieza > 10.2){
                contador3++;
            }
        }
        
        System.out.print("Total de piezas mayores a 10.2kg " + contador3 + "\n");
        System.out.print("Total de piezas entre 9.8kg y 10.2kg " + contador2 + "\n");
        System.out.print("Total de piezas menores a 9.8kg " + contador1 + "\n");

        System.out.print("Total de piezas procesadas: " + (contador1 + contador2 + contador3));
    }
}
