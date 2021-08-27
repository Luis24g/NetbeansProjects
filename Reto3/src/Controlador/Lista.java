/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Lista {
   private static ArrayList<PasajeroAdulto>pasajeroAdulto=new ArrayList();
   private static ArrayList<PasajeroNino>pasajeroNino=new ArrayList();
   
   
   public static void ListaAdultos(PasajeroAdulto adulto){


        pasajeroAdulto.add(adulto);
    
    }
    
    public static void ListaNinos(PasajeroNino nino){
        pasajeroNino.add(nino);
    }

    
    public static void ImprimirListaAdultos(){
        for(PasajeroAdulto a:pasajeroAdulto){
        System.out.println("************************************");    
        System.out.println("Nombre: "+a.getNombre());
        System.out.println("Apellido: "+a.getApellido());
        System.out.println("Telefono: "+a.getTelefono());
        System.out.println("Correo: "+a.getCorreo());
        System.out.println("Tipo documento: "+a.getTipo());
        System.out.println("Numero de documento: "+a.getDocumento());
        System.out.println("Sexo: "+a.getSexo());
        System.out.println("************************************"); 
        }
        
    }
    
    public static void ImprimirListaNinos(){
    for(PasajeroNino a:pasajeroNino){
           System.out.println("************************************");    
        System.out.println("Nombre: "+a.getNombre());
        System.out.println("Apellido: "+a.getApellido());
        System.out.println("Tipo documento: "+a.getTipo());
        System.out.println("Numero de documento: "+a.getDocumento());
        System.out.println("Sexo: "+a.getSexo());
        System.out.println("************************************"); 
    }
    }
    
    public static double CalcularPrecio(int numAdult, int numNinos, double precio, boolean idaYvuelta ){
        
        int pasajeros= numAdult+numNinos;
        double total=pasajeros * precio;
        if(idaYvuelta){
        total=total*2;
        }
        
        return total;
        
    } 
    
    /**
     * @return the pasajeroAdulto
     */
    public static ArrayList<PasajeroAdulto> getPasajeroAdulto() {
        return pasajeroAdulto;
    }

    /**
     * @return the pasajeroNino
     */
    public static ArrayList<PasajeroNino> getPasajeroNino() {
        return pasajeroNino;
    }
}
