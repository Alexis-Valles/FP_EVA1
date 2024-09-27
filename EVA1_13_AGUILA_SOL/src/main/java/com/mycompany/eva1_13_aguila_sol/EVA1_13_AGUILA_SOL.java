/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_aguila_sol;

/**
 *
 * @author alexi
 */
public class EVA1_13_AGUILA_SOL {

    public static void main(String[] args) {
        //ALEATORIO
        //GENERER NUMEROS ALEATORIOS
       double valor = Math.random();
       //random genera valores >= 0 y < a 1
       //entre 0 y .999999 etc
       if(valor < 0.5){
           System.out.println("Aguila");
           
       }else{
           System.out.println("Sol");
       }
          
    }
}
