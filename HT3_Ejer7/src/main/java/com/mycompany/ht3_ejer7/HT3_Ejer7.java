/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht3_ejer7;
import java.util.Scanner;
/**
 *
 * @author Javier
 */
public class HT3_Ejer7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("*-----------------------------------------------*\n");
        System.out.print("Seleccione su facultad\n ");
        System.out.print("Ing. en sistemas -> 1      Derecho        ->2\n");
        System.out.print("Ing. naviera     -> 3      Ing. pesquera  ->4\n");
        System.out.print("Contabilidad     -> 5      Administracion ->6\n");
        System.out.print("*-----------------------------------------------*\n");

        System.out.print("Ingrese su facultad: ");
        int facultad = sc.nextInt();
        double importe, mensualidad, igv, total;
        

        switch(facultad){
            case 1:
                importe = 350;
                mensualidad = 650;
                igv = 0.18*(importe + mensualidad);
                total = importe + mensualidad + igv;
                System.out.print("Su importe de matricula es de " + importe +"\n");
                System.out.print("Su mensualidad es de " + mensualidad +"\n");
                System.out.print("Su igv es de " + igv +"\n");
                System.out.print("El total a pagar es de "+ total +"\n");
                break;              
            case 2:
                importe = 300;
                mensualidad = 550;
                igv = 0.18*(importe + mensualidad);
                total = importe + mensualidad + igv;
                System.out.print("Su importe de matricula es de " + importe +"\n");
                System.out.print("Su mensualidad es de " + mensualidad +"\n");
                System.out.print("Su igv es de " + igv +"\n");
                System.out.print("El total a pagar es de "+ total +"\n");
                break;                  
            case 3:
                importe = 300;
                mensualidad = 500;
                igv = 0.18*(importe + mensualidad);
                total = importe + mensualidad + igv;
                System.out.print("Su importe de matricula es de " + importe +"\n");
                System.out.print("Su mensualidad es de " + mensualidad +"\n");
                System.out.print("Su igv es de " + igv +"\n");
                System.out.print("El total a pagar es de "+ total +"\n");
                break;  
            case 4:
                importe = 310;
                mensualidad = 460;
                igv = 0.18*(importe + mensualidad);
                total = importe + mensualidad + igv;
                System.out.print("Su importe de matricula es de " + importe +"\n");
                System.out.print("Su mensualidad es de " + mensualidad +"\n");
                System.out.print("Su igv es de " + igv +"\n");
                System.out.print("El total a pagar es de "+ total +"\n");
                break;  
            case 5:
                importe = 280;
                mensualidad = 490;
                igv = 0.18*(importe + mensualidad);
                total = importe + mensualidad + igv;
                System.out.print("Su importe de matricula es de " + importe +"\n");
                System.out.print("Su mensualidad es de " + mensualidad +"\n");
                System.out.print("Su igv es de " + igv +"\n");
                System.out.print("El total a pagar es de "+ total +"\n");
                break;  
            case 6:
                importe = 360;
                mensualidad = 520;
                igv = 0.18*(importe + mensualidad);
                total = importe + mensualidad + igv;
                System.out.print("Su importe de matricula es de " + importe +"\n");
                System.out.print("Su mensualidad es de " + mensualidad +"\n");
                System.out.print("Su igv es de " + igv +"\n");
                System.out.print("El total a pagar es de "+ total +"\n");
                break;  
            default:
                System.out.print("Ingrese una facultad validad");
                break;
    }
    
    }
}
