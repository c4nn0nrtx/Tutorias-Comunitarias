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
public class Alumno {
    private int id;
    private String nombre, apellidoPaterno, apellidoMaterno, 
            telefono, escuela_Procedencia, grado_Escolar;
    private Date fecha_nacimiento;

    public Alumno(String nombre, String nombrePaterno, String nombreMaterno, String telefono, String escuela_Procedencia, String grado_Escolar, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = nombrePaterno;
        this.apellidoMaterno = nombreMaterno;
        this.telefono = telefono;
        this.escuela_Procedencia = escuela_Procedencia;
        this.grado_Escolar = grado_Escolar;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Alumno() {
    }

    public void setIdAlumno(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String nombrePaterno) {
        this.apellidoPaterno = nombrePaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String nombreMaterno) {
        this.apellidoMaterno = nombreMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEscuela_Procedencia() {
        return escuela_Procedencia;
    }

    public void setEscuela_Procedencia(String escuela_Procedencia) {
        this.escuela_Procedencia = escuela_Procedencia;
    }

    public String getGrado_Escolar() {
        return grado_Escolar;
    }

    public void setGrado_Escolar(String grado_Escolar) {
        this.grado_Escolar = grado_Escolar;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

//    @Override
//    public String toString() {
//        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", nombrePaterno=" + nombrePaterno + ", nombreMaterno=" + nombreMaterno + ", telefono=" + telefono + ", escuela_Procedencia=" + escuela_Procedencia + ", grado_Escolar=" + grado_Escolar + ", fecha_nacimiento=" + fecha_nacimiento + '}';
//    }


    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", telefono=" + telefono + ", escuela_Procedencia=" + escuela_Procedencia + ", grado_Escolar=" + grado_Escolar + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
}
