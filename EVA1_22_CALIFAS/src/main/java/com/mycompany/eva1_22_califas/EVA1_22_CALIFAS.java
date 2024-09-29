/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA1_22_CALIFAS {

    public static void main(String[] args) {
         int numero;
         
         Scanner captu = new Scanner(System.in);
         System.out.println("Indique el numero de la calificacion:(0 y 100)");
         numero = captu.nextInt();
         captu.nextLine();
         
        if(numero <0 || numero >100){
            System.out.println("Numero no válido. Debe estar entre o y 100");
        }else{
            if (numero >= 90){
                System.out.println("La calificacion es: A");
            }else if (numero >= 80){
                System.out.println("La calificacion es: B");
            }else if (numero >= 70){
                System.out.println("La calificacion es: C");
            }else if (numero >= 60){
                System.out.println("La calificacion es: F");
            }
         }
                 
         
    }
}
