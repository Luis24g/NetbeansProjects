/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author LENOVO
 */
public class Cliente extends Persona {
    
    private String direccion;
    private String telefono;

    public Cliente(String direccion, String telefono, String nombre, String apellido, String correo, String identificacion) {
        super(nombre, apellido, correo, identificacion);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente() {
        super(null, null, null, null);
    }
    
    

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
