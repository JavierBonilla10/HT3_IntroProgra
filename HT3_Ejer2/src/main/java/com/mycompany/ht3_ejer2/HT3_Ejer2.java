/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer2;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class HT3_Ejer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Ingresa un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa un segundo numero: ");
        int num2 = sc.nextInt();
        
        //comparacion de cual es el mayor
        if (num1 < num2) {
        System.out.print(num2 + " Es mayor a " + num1);
        }
        else if (num2 < num1) {
        System.out.print(num1 + " Es mayor a " + num2);
        }
        else{
            System.out.print(num1 + " Es igual a " + num2);
        }
    }
}
