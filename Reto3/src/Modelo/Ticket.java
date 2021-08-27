/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Ticket {
    private String salida;
    private String destino;
    private LocalDate date;
    private int numeroAdultos;
    private int numeroNinos;
    private double valor;
    private boolean idaYvuelta;

    public Ticket() {
    }
    
    
    public Ticket(String salida, String destino, LocalDate date, int numeroAdultos, int numeroNinos, double valor, boolean idaYvuelta) {
        this.salida = salida;
        this.destino = destino;
        this.date = date;
        this.numeroAdultos = numeroAdultos;
        this.numeroNinos = numeroNinos;
        this.valor = valor;
        this.idaYvuelta = idaYvuelta;
    }

    /**
     * @return the salida
     */
    public String getSalida() {
        return salida;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(String salida) {
        this.salida = salida;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the numeroAdultos
     */
    public int getNumeroAdultos() {
        return numeroAdultos;
    }

    /**
     * @param numeroAdultos the numeroAdultos to set
     */
    public void setNumeroAdultos(int numeroAdultos) {
        this.numeroAdultos = numeroAdultos;
    }

    /**
     * @return the numeroNinos
     */
    public int getNumeroNinos() {
        return numeroNinos;
    }

    /**
     * @param numeroNinos the numeroNinos to set
     */
    public void setNumeroNinos(int numeroNinos) {
        this.numeroNinos = numeroNinos;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the idaYvuelta
     */
    public boolean isIdaYvuelta() {
        return idaYvuelta;
    }

    /**
     * @param idaYvuelta the idaYvuelta to set
     */
    public void setIdaYvuelta(boolean idaYvuelta) {
        this.idaYvuelta = idaYvuelta;
    }
    
    
}
