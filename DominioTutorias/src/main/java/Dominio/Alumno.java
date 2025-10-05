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
    private int id, edad,telefono;
    private String nombre, apellidoPaterno, apellidoMaterno, 
             escuela_Procedencia, grado_Escolar;
//    private Date fecha_nacimiento; en el documento pide la edad chingue su

    

    public Alumno() {
    }

    public void setIdAlumno(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Alumno(int id, int edad, String nombre, String apellidoPaterno, String apellidoMaterno, int telefono, String escuela_Procedencia, String grado_Escolar) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.escuela_Procedencia = escuela_Procedencia;
        this.grado_Escolar = grado_Escolar;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", telefono=" + telefono + ", escuela_Procedencia=" + escuela_Procedencia + ", grado_Escolar=" + grado_Escolar + '}';
    }
    
    
    
 
    
}
