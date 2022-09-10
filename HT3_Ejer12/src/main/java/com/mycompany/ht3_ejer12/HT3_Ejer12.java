/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer12;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class HT3_Ejer12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero para obtener su factorial: ");
        int numero = sc.nextInt();
        double factorial = numero;
        double aux1 = numero;
        int contador = 1;
        
        while (contador < numero){
            aux1--;
            factorial = factorial * (aux1);
            contador++;
        }
        System.out.print("El factorial de "+ numero + " es " + factorial);
                
    }
}
