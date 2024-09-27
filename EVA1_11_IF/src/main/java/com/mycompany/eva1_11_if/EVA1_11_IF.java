/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
        //CONDICIONAL (IF)
        //LOGICA BOLEANA ---> OPERACIONES DE VERDADERO O FALSO
        //SOLICITAR LA EDAD EN AÑOS
        
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("Capturar la edad");
        edad = captu.nextInt();
        //DETERMINAR SI ES ADULTO
        //LAS OPERACIONES LOGICAS SOLO GENERAN COMO
        //RESULTADO UN VERDADERO O UN FALSO
        //si son varis instrucciones hay que agruparalas con llaves 
        
        if(edad >= 18){
        System.out.println("ES UN ADULTO");
    }else{//BLOQUE PARA EL FALSO (OPCIONAL)
            System.out.println("MENOR DE EDAD");
    }
        
}
    
}

   
