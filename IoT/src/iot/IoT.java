/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class IoT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int contador[];
        
        String mensaje=JOptionPane.showInputDialog("Ingrese los dispositivos y sus caracteristicas usando el siguiente formato:\ntipo_dispositivo1,identificador1,estado1@tipo_dispositivo2,identificador2,estado2@...\n");
        
        SepararCadena sh= new SepararCadena(mensaje);
        
        String newLista[]=sh.Separar();
        
        
        for(int i=0;i<newLista.length;i++){
        System.out.println(newLista[i]);
        }
        
        Contar con= new Contar();
       
        
        contador=con.Contador(newLista);
        
        System.out.println("El numero de dispositivos en On es : "+contador[0]);
        System.out.println("El numero de dispositivos en Off es : "+contador[1]);
        
       
        
        
       
    }
    
}
