/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_meses_year;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA1_19_MESES_YEAR {

    public static void main(String[] args) {
        int mes;
        System.out.println("Ingrese el numero de mes (1 - 12)");
        Scanner captu = new Scanner(System.in);
        mes = captu.nextInt();
        
       if(mes == 1){
           System.out.println("Enero");
       }else if(mes == 2){
           System.out.println("Febrero");
       }else if(mes == 3){
           System.out.println("Marzo");
       }else if(mes == 4){
           System.out.println("Abril");
       }else if(mes == 5){
           System.out.println("Mayo");
       }else if(mes == 6){
           System.out.println("Jumio");
       }else if(mes == 7){
           System.out.println("julio");
       }else if(mes == 8){
           System.out.println("Agosto");
       }else if(mes == 9){
           System.out.println("Septiembre");
       }else if(mes == 10){
           System.out.println("Octubre");
       }else if(mes == 11){
           System.out.println("Noviembre");
       }else if(mes == 12){
           System.out.println("Diciembre");
       
       }else
            System.out.println("Mes no vslido");
       {
       }         
    }
}
