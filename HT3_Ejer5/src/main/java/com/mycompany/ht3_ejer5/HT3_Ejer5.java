/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer5;

import java.util.Scanner;
/**
 *
 * @author Javier
 */
public class HT3_Ejer5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cifra=0;
        
        System.out.print("Ingrese un numero de 0 a 99999: ");
        int numero = sc.nextInt();
        
        //comprobar que este en el intervalo
        if(numero >= 0 || numero <= 99999){
            String num = String.valueOf(numero);
            for(int i=0; i < num.length(); i++){
                cifra++;
            }
            System.out.print("El numero de cifras es " + cifra);
        }
        else {
            System.out.print("Ingrese un numero dentro del rango dicho");
        }
    }
}
