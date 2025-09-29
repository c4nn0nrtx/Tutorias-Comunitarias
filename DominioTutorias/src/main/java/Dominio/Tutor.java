/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Dominio;

import java.sql.Date;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class Tutor {
    private Long id;
    private String nombre, email, especialidad, telefono;
    private int inicio, fin;
    private String disponibilidad;

    public Tutor(Long id, String nombre, String email, String especialidad, String telefono,int inicio, int fin, String disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.inicio = inicio;
        this.fin = fin;
        this.disponibilidad = disponibilidad;
    }

    public Tutor() {
    }

    public Long getId() {
        return id;
    }

    public void setIdTutor(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Tutor{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", especialidad=" + especialidad + ", telefono=" + telefono + ", inicio=" + inicio + ", fin=" + fin + ", disponibilidad=" + disponibilidad + '}';
    }

}
