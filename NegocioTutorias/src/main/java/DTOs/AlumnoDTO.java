/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTOs;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class AlumnoDTO {
    private int id, edad, telefono;
    private String nombre, apellidoPaterno, apellidoMaterno, escuelaProcedencia, gradoEscolar;

    public AlumnoDTO() {
    }

    public AlumnoDTO(int id, int edad, int telefono, String nombre, String apellidoPaterno, String apellidoMaterno, String escuelaProcedencia, String gradoEscolar) {
        this.id = id;
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.escuelaProcedencia = escuelaProcedencia;
        this.gradoEscolar = gradoEscolar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEscuelaProcedencia() {
        return escuelaProcedencia;
    }

    public void setEscuelaProcedencia(String escuelaProcedencia) {
        this.escuelaProcedencia = escuelaProcedencia;
    }

    public String getGradoEscolar() {
        return gradoEscolar;
    }

    public void setGradoEscolar(String gradoEscolar) {
        this.gradoEscolar = gradoEscolar;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", edad=" + edad + ", telefono=" + telefono + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", escuelaProcedencia=" + escuelaProcedencia + ", gradoEscolar=" + gradoEscolar + '}';
    }
    
    
}
