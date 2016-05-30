/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author marcelino
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1 e1 = new Ejercicio1();
        Ejercicio2 e2 = new Ejercicio2();
        Ejercicio3 e3 = new Ejercicio3();
        Ejercicio4 e4 = new Ejercicio4();
        Ejercicio5  e5 = new Ejercicio5();
        
        int opcion = 0;
        
        System.out.print("Numero de Ejercicio?  ");
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();
        
        switch(opcion)
        {
            case 1:
                e1.show();
                break;
            
            case 2:
                e2.show();
                break;
            
            case 3:
                e3.show();
                break;
            
            case 4:
                e4.show();
                break;
            
            case 5:
                e5.show();
                break;
                
            default:
                System.out.println("Error");
                break;
        }
        
        
    }
    
}
