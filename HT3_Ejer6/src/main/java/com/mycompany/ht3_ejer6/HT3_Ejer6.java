/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer6;
import java.util.Scanner;
/**
 *
 * @author Javier
 */
public class HT3_Ejer6 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        String userName = new String("javier");
        String password = new String("contra123");
        System.out.print("Ingrese su usuario: ");
        String user = sc1.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String passwo = sc2.nextLine();
        
        if (user.equals(userName) && passwo.equals(password)) {
            System.out.print("Bienvenido "+ user);
        }
        else {
            System.out.print("Contraseña/usuario incorrecto");
        }
              
    }
}
