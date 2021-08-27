/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Radar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float distancia1=Integer.parseInt(JOptionPane.showInputDialog("Distancia 1 en metros"));
        float distancia2=Integer.parseInt(JOptionPane.showInputDialog("Distancia 2 en metros"));
        int   tiempo    =Integer.parseInt(JOptionPane.showInputDialog("Tiempo en segundos"));
        float distanciaTotal;
        float velocidad;
        String textoMulta;
        
        if (distancia2 > distancia1){
         distanciaTotal = distancia2 - distancia1;
        }
       
        else{
        distanciaTotal = distancia1 - distancia2;
                }
        
        velocidad = (float) ((distanciaTotal / tiempo) * 3.6);  
           System.out.println("Velocidad: "+ velocidad+ " Km/h");
           
        if (velocidad <= 20){
        textoMulta = "llamado de atención por baja velocidad";}
        else if( velocidad > 20 && velocidad <= 60){
        textoMulta = "Normal";}
        else if (velocidad > 60 && velocidad <= 80){
        textoMulta = "llamado de atención por alta velocidad";}
        else if (velocidad > 80 && velocidad <= 120){
        textoMulta = "multa tipo I";}
        else{
        textoMulta = "multa tipo II e inmovilización del vehículo";   
        }
        System.out.println(textoMulta);
    }
    
}
