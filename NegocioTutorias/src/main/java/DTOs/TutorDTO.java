/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTOs;

import java.util.Date;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class TutorDTO {
    private int id;
    private String nombre, email, especialidad, telefono, disponibilidad;
    private Date inicio, fin;

    public TutorDTO(int id, String nombre, String email, String especialidad, String telefono, Date inicio, Date fin) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.especialidad = especialidad;
        this.telefono = telefono; 
        this.inicio = inicio;
        this.fin = fin;
        
    }

    public TutorDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
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
        return "TutorDTO{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", especialidad=" + especialidad + ", telefono=" + telefono + ", disponibilidad=" + disponibilidad + ", inicio=" + inicio + ", fin=" + fin + '}';
    }
    

    

    
}
