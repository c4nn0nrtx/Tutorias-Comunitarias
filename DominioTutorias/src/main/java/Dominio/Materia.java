/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Dominio;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class Materia {
    private int id;
    private String nombre,nivel_Educativo, descripcion;

    public Materia( String nombre, String nivel_Educativo, String descripcion) {
        this.nombre = nombre;
        this.nivel_Educativo = nivel_Educativo;
        this.descripcion = descripcion;
    }

    public Materia() {
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

    public String getNivel_Educativo() {
        return nivel_Educativo;
    }

    public void setNivel_Educativo(String nivel_Educativo) {
        this.nivel_Educativo = nivel_Educativo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nombre=" + nombre + ", nivel_Educativo=" + nivel_Educativo + ", descripcion=" + descripcion + '}';
    }
    
    
}
