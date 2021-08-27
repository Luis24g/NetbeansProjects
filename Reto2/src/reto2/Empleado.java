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
public class Empleado extends Persona {
    
    private double salario;
    private Cargo cargo= new Cargo("","");
    private int check=0;
    private int asignado=0;

    public Empleado(double salario, String nombre, String apellido, String correo, String identificacion, Cargo cargo) {
        super(nombre, apellido, correo, identificacion);
        this.salario = salario;
        this.cargo=cargo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the check
     */
    public int getCheck() {
        return check;
    }

    /**
     * @param check the check to set
     */
    public void setCheck(int check) {
        this.check = check;
    }

    /**
     * @return the asignado
     */
    public int getAsignado() {
        return asignado;
    }

    /**
     * @param asignado the asignado to set
     */
    public void setAsignado(int asignado) {
        this.asignado = asignado;
    }

   
    
    
    
}
