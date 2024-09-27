/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
       //DECLARAR VARIABLESPARA ALA CAIFICACION
       //EVALUAR SI ACREDITAS (MAYOE O IGUAL A 70)
       //O NO ACREDITAS (NA ----> MENOR A 70)
       int califa;
       Scanner captu = new Scanner(System.in);
        System.out.println("¿Cual es la califcacion?");
        califa = captu.nextInt();
        if(califa < 70){
            System.out.println("NA");
        }else{
            System.out.println("ACREDITAS");
        }
    }
}
