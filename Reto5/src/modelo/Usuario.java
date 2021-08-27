/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import utils.db.DB;

/**
 *
 * @author LENOVO
 */
public class Usuario {
    
    private Integer id;
    private String nombre;

    public Usuario() {
    }

    public Usuario(String nombre) {
       
        this.nombre = nombre;
    }

    
    
  
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

   
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
