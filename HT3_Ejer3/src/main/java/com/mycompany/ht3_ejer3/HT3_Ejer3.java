/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer3;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class HT3_Ejer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();
        
        //Ver si es par o impar y si es positivo o negativo
        if (numero % 2 == 0 && numero > 0) {
            System.out.print("El numero es par y positivo");
        }
        else if (numero % 2 == 0 && numero < 0){
            System.out.print("El numero es par y negativo");
        }
        else if (numero % 2 != 0 && numero > 0) {
            System.out.print("El numero es impar y positvo");
        }
        else if (numero % 2 != 0 && numero < 0) {
            System.out.print("El numero es impar y negativo");
        }
        else {
            System.out.print("El numero es cero");
        }
    }
}
