/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Dominio;

import java.util.Date;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class Sesion {
    private int id;
    private String estado;
    private Date fechaHora;

    public Sesion(String estado, Date fechaHora) {
        this.estado = estado;
        this.fechaHora = fechaHora;
    }

    public Sesion() {
    }

    public int getId() {
        return id;
    }

    public void setIdSesion(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Sesion{" + "id=" + id + ", estado=" + estado + ", fechaHora=" + fechaHora + '}';
    }
    
    

}
