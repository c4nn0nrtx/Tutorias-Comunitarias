/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAOs.TutorDAO;
import Dominio.Tutor;
import Interfaces.ITutorDAO;
import java.util.List;

/**
 *
 * @author Sandra
 */
public class TutorController {
    private final ITutorDAO tutorDAO;
    
    public TutorController(){
        this.tutorDAO = new TutorDAO();
    }
    
    //VALIDACIONEs
    
    //Inserrt
    public boolean agregarTutor(String nombre, String email, String especialidad, String telefono){
        if (nombre == null || nombre.trim().isEmpty()) {
            System.err.println("El nombre del tutor no puede estar vacio");
            return false;
        }
        if (email == null || email.trim().isEmpty()) {
            System.err.println("El email del tutor no puede estar vacio");
            return false;
        }
        if (especialidad == null || especialidad.trim().isEmpty()) {
            System.err.println("La especialidad materno del tutor no puede estar vacio");
            return false;
        }
        if (telefono == null) {
            telefono = "";
        }

        Tutor tutor = new Tutor();
        tutor.setNombre(nombre.trim());
        tutor.setEmail(email.trim());
        tutor.setEspecialidad(especialidad.trim());
        tutor.setTelefono(telefono.trim());

        return tutorDAO.insertar(tutor);
    }

    //Obtener por id
    public Tutor obtenerPorId(int idTutor){
        if (idTutor <= 0) {
            System.err.println("ID invalido");
            return null;
        }
        return tutorDAO.obtenerPorId(idTutor);
    }
    
    //obtener todfos
    public List<Tutor> obtenerTodos() {
        return tutorDAO.obtenerTodos();
    }
    
    //actualizar
    public boolean actualizarTutor(int idTutor, String nombre, String email, String especialidad, String telefono){
        if (idTutor <= 0) {
            System.out.println("ID invalido");
            return false;
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            System.err.println("El nombre del tutor no puede estar vacio");
            return false;
        }
        if (email == null || email.trim().isEmpty()) {
            System.err.println("El email del tutor no puede estar vacio");
            return false;
        }
        if (especialidad == null || especialidad.trim().isEmpty()) {
            System.err.println("La especialidad materno del tutor no puede estar vacio");
            return false;
        }
        if (telefono == null) {
            telefono = "";
        }
        
        Tutor tutor = new Tutor();
        tutor.setIdTutor(idTutor);
        tutor.setNombre(nombre.trim());
        tutor.setEmail(email.trim());
        tutor.setEspecialidad(especialidad.trim());
        tutor.setTelefono(telefono.trim());

        return tutorDAO.insertar(tutor);
    } 
    
    //eliminar
    public boolean eliminarTutor(int idTutor){
        if (idTutor <= 0) {
            System.err.println("ID invalido");
            return false;
        }
        return tutorDAO.eliminar(idTutor);
    }
    
}
