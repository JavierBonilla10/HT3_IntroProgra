/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer9;

/**
 *
 * @author Javier
 */
public class HT3_Ejer9 {

    public static void main(String[] args) {
        System.out.print("*----------------------*\n");
        System.out.print("* Bienvenido al casino *\n");
        System.out.print("*----------------------*\n");
        System.out.print("Sus dados se lanzaran a continuacion\n");
        
        int min = 1;
        int max = 6;
        int dado1 = (int)Math.floor(Math.random()*(max-min+1)-min);
        int dado2 = (int)Math.floor(Math.random()*(max-min+1)-min);
        int dado3 = (int)Math.floor(Math.random()*(max-min+1)-min);
        
        if (dado1 == 6 && dado2 == 6 && dado3 == 6){
        System.out.print("Excelente\n");
        System.out.print("Sus dados son\n");
        System.out.print("dado1 -> " + dado1 + " dado2 -> " + dado2 + " dado3 -> " + dado3 );        
        }
        else if ((dado1 == 6 || dado2 == 6) && dado3 != 6){
        System.out.print("Muy bien\n");
        System.out.print("Sus dados son\n");
        System.out.print("dado1 -> " + dado1 + " dado2 -> " + dado2 + " dado3 -> " + dado3 );        
        }
        else if ((dado1 == 6 || dado3 == 6) && dado2 != 6){
        System.out.print("Muy bien\n");
        System.out.print("Sus dados son\n");
        System.out.print("dado1 -> " + dado1 + " dado2 -> " + dado2 + " dado3 -> " + dado3 );        
        }
        else if ((dado2 == 6 || dado3 == 6) && dado1 != 6){
        System.out.print("Muy bien\n");
        System.out.print("Sus dados son\n");
        System.out.print("dado1 -> " + dado1 + " dado2 -> " + dado2 + " dado3 -> " + dado3 );        
        }
        else {
        System.out.print("Pesimo\n");
        System.out.print("Sus dados son\n");
        System.out.print("dado1 -> " + dado1 + " dado2 -> " + dado2 + " dado3 -> " + dado3 ); 
        }
    }
}
