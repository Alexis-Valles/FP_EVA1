/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rangos;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA1_17_RANGOS {

    public static void main(String[] args) {
        
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("Capture el numero de calificacion (0-1oo)");
       calif = captu.nextInt();
       captu.nextLine();
       if(calif >= 0 && calif <= 100){
           System.out.println("Calificacion aceptada");
       }else{
           System.out.println("Calificacion no aceptada");
       }
        
       
        
        
    }
}
