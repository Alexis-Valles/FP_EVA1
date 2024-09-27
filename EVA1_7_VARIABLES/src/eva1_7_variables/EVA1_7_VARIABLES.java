/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_variables;

/**
 *
 * @author invitado
 */
public class EVA1_7_VARIABLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMETICAS
        int x = 10; //declaracion y asignamiento
        int y = 5; 
        //declaracion d multiplesvariables del
        //mismo tipo
        int suma, resta, divi, multi, pot, raiz;
        //SUMA Y RESTA
        suma = x + y; //operador de suma +
        System.out.println("Suma de x + y:");
        System.out.println(suma);
        
        resta = x - y; //operador de diferencia -
        System.out.println("Resta de x - y");
        System.out.println(resta);
        
        //MULTIPLICACION
        multi = x * y; //operador de multi´plicacion *
        System.out.println("Multi de x * y");
        System.out.println(multi);
        
        //DIVISION -------> EL MANEJO DE TIPOS DE DATOS
        //Si dividimos enteros java espera como resultado un entero
        divi = x / y;
        System.out.println("División de x(10) / y(5)");
        System.out.println(divi);
        //cambiamos los valores de x y
        x= 5;
        y =2;
        divi = x / y;
        System.out.println("Division x(5) / y(2)");
        System.out.println(divi);
        x = 11;
        y = 3;
        divi = x / y;
        System.out.println("Divison x(11) / y(3)");
        System.out.println(divi);
        
        double vall = 11;
        double val2 = 3;
        double diviD;
        diviD = val1 / val2;
        System.out.println("Division entre decimales");
        System.out.println(diviD);
        
        
    }
    
}
