/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        
        Scanner in= new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre= in.nextLine();
        System.out.println("Hola "+nombre);
        String palabra="Palabras pero muchas palabras";
        for(char caracter:palabra.toCharArray()){
            System.out.println(caracter);
        }
    }
    
}
