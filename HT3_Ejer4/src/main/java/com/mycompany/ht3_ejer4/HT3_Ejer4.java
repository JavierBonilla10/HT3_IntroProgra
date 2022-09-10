/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer4;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class HT3_Ejer4 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc1.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc2.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = sc3.nextInt();
                
        //num1 sera el mayor y num3 el menor
        if(num1 > num2 && num1 > num3 && num2 > num3){
            System.out.print("Es el mayor es " + num1 + "\nEl de enmedio es " + num2 + "\nEl menor es " + num3);
        }
        //num1 mayor y num 2 menor
        else if(num1 > num2 && num1 > num3 && num3 > num2){
            System.out.print("Es el mayor es " + num1 + "\nEl de enmedio es " + num3 + "\nEl menor es " + num2);
        }
        //num2 mayor y num3 menor
        else if(num2 > num1 && num2 > num3 && num1 > num3){
            System.out.print("Es el mayor es " + num2 + "\nEl de enmedio es " + num1 + "\nEl menor es " + num3);
        }
        //num2 mayor y num1 menor
        else if(num2 > num1 && num2 > num3 && num3 > num1){
            System.out.print("Es el mayor es " + num2 + "\nEl de enmedio es " + num3 + "\nEl menor es " + num1);
        }   
        //num3 mayor y num1 menor
        else if(num3 > num1 && num3 > num2 && num2 > num1){
            System.out.print("Es el mayor es " + num3 + "\nEl de enmedio es " + num2 + "\nEl menor es " + num1);
        }
        //num3 mayor y num2 menor
        else if(num3 > num1 && num3 > num2 && num1 > num1){
            System.out.print("Es el mayor es " + num3 + "\nEl de enmedio es " + num1 + "\nEl menor es " + num2);
        }     
        //un numero mayor y los otros iguales
        //num1 mayor - num2 y num3 igual
        else if(num1 > num2 && num1 > num3 && num2 == num3){
            System.out.print("Es el mayor es " + num1 + "\nEl menor es " + num3);
        }
        //num2 mayor - num1 y num3 igual
        else if(num2 > num1 && num2 > num3 && num1 == num3){
            System.out.print("Es el mayor es " + num2 + "\nEl menor es " + num3);
        }  
        //num3 mayor - num1 y num2 igual
        else if(num3 > num1 && num3 > num2 && num2 == num1){
            System.out.print("Es el mayor es " + num3 + "\nEl menor es " + num1);
        }
        //Todos son igaules
        else{
            System.out.print("Todos los numeros son iguales a " + num1);
        }   
    }
}
