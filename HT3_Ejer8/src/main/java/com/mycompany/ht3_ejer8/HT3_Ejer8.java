/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer8;
import java.util.Scanner;
/**
 *
 * @author Javier
 */
public class HT3_Ejer8 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        
        System.out.print("Ingrese sus notas\n");
        System.out.print("Ingrese nota 1: ");
        double nota1 = sc1.nextInt();
        System.out.print("Ingrese nota 2: ");        
        double nota2 = sc2.nextInt();
        System.out.print("Ingrese nota 3: ");        
        double nota3 = sc3.nextInt();
        System.out.print("Ingrese nota 4: ");
        double nota4 = sc4.nextInt();
        
        double promedio = ((nota1 * 0.20)+(nota2 * 0.20)+(nota3 * 0.30)+(nota4 * 0.30));
        
        if (promedio >= 0 && promedio <= 60) {
        System.out.print("Perdio\n");
        System.out.print("Promedio: " + promedio);
        }
        else if (promedio >= 61 && promedio <= 70) {
        System.out.print("Decente\n");
        System.out.print("Promedio: " + promedio);
        }
        else if (promedio >= 71 && promedio <= 80) {
        System.out.print("Aceptable\n");
        System.out.print("Promedio: " + promedio);
        }
        else if (promedio >= 81 && promedio <= 100) {
        System.out.print("Excelente\n");
        System.out.print("Promedio: " + promedio);
        }
    }
}
