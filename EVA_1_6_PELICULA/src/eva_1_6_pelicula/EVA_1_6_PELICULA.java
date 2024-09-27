/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_1_6_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nombre----->String
        //Genreo ------>String o char
        //Duracion (int)---> 1 hora = 3600 segundos
        //Reparto ------> String
        //Clasificacion -------> String
        
        String Nombre;
        String Genero;
        int Duracion;
        String Reparto;
        String Clasificacion;
        
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Introduce el nobre de la pelicula: ");
        Nombre = captu.nextLine();
        System.out.println("Captura genero: ");
        Genero = captu.nextLine();
        System.out.println("Captura la duracion en segundos:");
        Duracion = captu.nextInt();
        captu.nextLine();
        System.out.println("Captura el reparto: ");
        captu.nextLine();
        System.out.println("Captura la calsifiacion: ");
        captu.nextLine();
        
        System.out.println("IMPRESION DE LOS DATOS");
        System.out.println(Nombre);
        System.out.println(Genero);
        System.out.println(Duracion);
        System.out.println(Reparto);
        System.out.println(Clasificacion);
        
        
        
        
    }
    
}
