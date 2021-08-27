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
public class Persona {

private String nombre;
private String apellido;
private String correo;
private String identificacion;

    public Persona(String nombre, String apellido, String correo, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.identificacion = identificacion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void ImprimirDatos(){
        
        System.out.println("Nombre: "+getNombre()+"\nEdad: "+getApellido()+"\nSexo: "+getCorreo()+"\nIdentificación: "+getIdentificacion());
                

    }
    
  
 
    
}
