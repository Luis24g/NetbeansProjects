/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

/**
 *
 * @author LENOVO
 */
public class SepararCadena {
    String cadena;

    public SepararCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public  String[] Separar(){
        
        String[] lista = cadena.split("@");
        return lista;
    
    }
}
