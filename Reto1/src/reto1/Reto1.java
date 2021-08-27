/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p= new Persona();
        
       p.setNombre(JOptionPane.showInputDialog("Escriba el nombre"));
       p.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad")));
       p.setSexo(JOptionPane.showInputDialog("Escriba el sexo"));
       p.setIdentificacion(JOptionPane.showInputDialog("Escriba la identificación"));
        
       p.ImprimirDatos();
       p.Hablar();
      
    }
    
}
