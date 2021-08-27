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
public class Empresa {
    private String nombre;
    private int nit;
    private String direccion;
    private ArrayList<Empleado> empleado = new ArrayList();
    private ArrayList<Administrativo> administrativo= new ArrayList();
    private ArrayList<Cliente>cliente=new ArrayList();

    public Empresa(String nombre, int nit, String direccion, ArrayList<Empleado> empleado, ArrayList<Administrativo> administrativo) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.empleado=empleado;
        this.administrativo=administrativo;
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

    /**
     * @return the nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(int nit) {
        this.nit = nit;
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
     * @return the empleado
     */
    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the administrativo
     */
    public ArrayList<Administrativo> getAdministrativo() {
        return administrativo;
    }

    /**
     * @param administrativo the administrativo to set
     */
    public void setAdministrativo(ArrayList<Administrativo> administrativo) {
        this.administrativo = administrativo;
    }

    /**
     * @return the cliente
     */
    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }
    
}
