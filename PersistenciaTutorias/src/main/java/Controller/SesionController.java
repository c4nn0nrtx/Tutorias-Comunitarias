/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAOs.SesionDAO;
import Dominio.Sesion;
import Interfaces.ISesionDAO;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Sandra
 */
public class SesionController {
    
    private final ISesionDAO sesionDAO;
    private final List<String> estadosValidos = Arrays.asList("programada", "en curso", "completada");

    public SesionController(){
        this.sesionDAO = new SesionDAO();
    }
    
    //VQALIDACIONES
    
    //Insert
        public boolean agregarSesion(String estado, Date fechaHora){
            if (estado == null || !estadosValidos.contains(estado.toLowerCase())) {
            System.err.println("Estado inválido. Debe ser: programada, en cursi o completada.");
            return false;
        }
            if (fechaHora == null) {
            System.err.println("La fecha de sesion es obligatoria.");
            return false;
            }
            
            Sesion sesion = new Sesion();
            sesion.setEstado(estado.trim());
            sesion.setFechaHora(fechaHora);
            
            return sesionDAO.insertar(sesion);
        }
   
    //Obtener por id
        public Sesion obtenerPorId(int idSesion) {
        if (idSesion <= 0) {
            System.err.println("ID invalido");
            return null;
        }
        return sesionDAO.obtenerPorId(idSesion);
    }
    
    //obtener todos
        public List<Sesion> obtenerTodos() {
        return sesionDAO.obtenerTodos();
    }
    
    // update
        public boolean actualizarSesion(int idSesion, String estado, Date fechaHora){
            if (idSesion <= 0) {
                System.err.println("ID invalido");
                return false;
            }
            if (estado == null || !estadosValidos.contains(estado.toLowerCase())) {
            System.err.println("Estado inválido. Debe ser: programada, en cursi o completada.");
            return false;
            }
            if (fechaHora == null) {
            System.err.println("La fecha de sesion es obligatoria.");
            return false;
            }
            
            Sesion sesion = new Sesion();
            sesion.setIdSesion(idSesion);
            sesion.setEstado(estado.trim());
            sesion.setFechaHora(fechaHora);
            
            return sesionDAO.insertar(sesion);
        }
    
    //dleete
        public boolean eliminarSesion(int idSesion){
        if (idSesion <= 0) {
            System.err.println("ID invalido");
            return false;
        }
        return sesionDAO.eliminar(idSesion);
    }
}
