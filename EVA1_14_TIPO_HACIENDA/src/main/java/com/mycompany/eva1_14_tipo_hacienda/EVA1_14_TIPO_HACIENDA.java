/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA1_14_TIPO_HACIENDA {

    public static void main(String[] args) {
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Capturar el tipo de persona F:fisica, M:Moral");
        tipo = captu.nextLine().charAt(0);
        System.out.println("El caracter es " + tipo);
        if (tipo == 'F')
            System.out.println("Persona Fisica");
        else
            System.out.println("Persona Moral");
    }
}
