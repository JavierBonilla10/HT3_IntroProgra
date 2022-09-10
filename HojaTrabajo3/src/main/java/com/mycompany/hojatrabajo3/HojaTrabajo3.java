/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hojatrabajo3;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class HojaTrabajo3 {

    public static void main(String[] args) {
                //Toma la edad
        System.out.print("Ingrese su edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        if(edad == 0 && edad <= 5){
            System.out.print("Eres un bebe");
            System.out.print("\nTu edad es: " + edad);
        }
        else if (edad >=6 && edad <= 11){
            System.out.print("Eres un niño");
            System.out.print("\nTu edad es: " + edad);
        }
        else if (edad >=12 && edad <= 26){
            System.out.print("Eres un adolecente");
            System.out.print("\nTu edad es: " + edad);            
        }
        else if (edad >=27 && edad <= 59){
            System.out.print("Eres un adulto");
            System.out.print("\nTu edad es: " + edad);        
        }
        else {
            System.out.print("Eres un adulto mayor");
            System.out.print("\nTu edad es: " + edad);
       
        }
    }
}
