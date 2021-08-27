/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author LENOVO
 */
public class Persona {

private String nombre;
private int edad;
private String sexo;
private String identificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void ImprimirDatos(){
        
        System.out.println("Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nSexo: "+getSexo()+"\nIdentificación: "+getIdentificacion());
                

    }
    
    public void Hablar(){
    
    System.out.println("La persona "+nombre+" esta hablando");
    }
    
 
    
}
