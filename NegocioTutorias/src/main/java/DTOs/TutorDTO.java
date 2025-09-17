/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTOs;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class TutorDTO {
    private int id;
    private String nombre, email, especialidad, telefono;
//    private string disponibilidad debera ser Date o una fecha especifica?

    public TutorDTO(int id, String nombre, String email, String especialidad, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.especialidad = especialidad;
        this.telefono = telefono;
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

    @Override
    public String toString() {
        return "Tutor{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", especialidad=" + especialidad + ", telefono=" + telefono + '}';
    }
}
