/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Administrativo extends Empleado {
    private String categoria;
    private ArrayList <Empleado> empleados = new ArrayList();

    public Administrativo(String categoria, double salario, String nombre, String apellido, String correo, String identificacion, Cargo cargo) {
        super(salario, nombre, apellido, correo, identificacion, cargo);
        this.categoria = categoria;
        
        
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the empleados
     */
    public ArrayList <Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(ArrayList <Empleado> empleados) {
        this.empleados = empleados;
    }

    
  
}

