/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picasyfijas;


import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PicasYFIjas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[] codigo=Juego.GenerarCodigo();
                
       System.out.println("\nBienvenidos al juego" );
       System.out.println("Tienes que adivinar un número de 4 cifras distintas." );
       System.out.println(); 
       
  //Scanner sc = new Scanner(System.in);     
  int intentos = 0;
 
  String propuesta = JOptionPane.showInputDialog("¿Que código propones?"); 
  int aciertos = 0;
  int coincidencias = 0;
  int puntaje[];
  System.out.println(propuesta.length());
  while(true){
            // ^[0-9]+$"
            //^.*[^a-zA-Z0-9 ].*$
    if(!propuesta.matches("^[0-9]+$")|| propuesta.length()!=4){
          JOptionPane.showMessageDialog(null,"El número debe contener 4 digitos");
          propuesta = JOptionPane.showInputDialog("¿Que código propones?");   
          continue;}
          intentos++;
          puntaje=Juego.PicasOFijas(codigo,propuesta);
          
          System.out.println("Tu propuesta ("+ propuesta+ ") tiene "+ puntaje[0]+ " fijas y "+ puntaje[1]+ " picas.");
        if(puntaje[0]==4){break;}
        
        propuesta = JOptionPane.showInputDialog("¿Que código propones?");   
    }
  
        JOptionPane.showMessageDialog(null,"GANASTE\nEl número de intentos fue: "+intentos);
            
       
       
       
       
    }

           
            
  
}
