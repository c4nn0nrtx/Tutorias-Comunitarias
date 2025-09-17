/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAOs.MateriaDAO;
import Dominio.Materia;
import Interfaces.IMateriaDAO;
import java.util.List;

/**
 *
 * @author Sandra
 */
public class MateriaController {
    private final IMateriaDAO materiaDAO;
    
    public MateriaController(){
        this.materiaDAO = new MateriaDAO();
    }
    
    //VALIDACIONES
    
    //Insert
    public boolean agregarMateria(String nombre, String nivel_Educativo, String descripcion){
        if (nombre == null || nombre.trim().isEmpty()) {
            System.err.println("El nombre de la materia no puede estar vacio");
            return false;
        }
        if (nivel_Educativo == null || nivel_Educativo.trim().isEmpty()) {
            System.err.println("El nivel educativo no puede estar vacio");
            return false;
        }
        if (descripcion == null || descripcion.trim().isEmpty()) {
            System.err.println("La descripcion no puede estar vacio");
            return false;
        }
        Materia materia = new Materia();
        materia.setNombre(nombre.trim());
        materia.setNivel_Educativo(nivel_Educativo.trim());
        materia.setDescripcion(descripcion.trim());
        
        return materiaDAO.insertar(materia);
        
    }
    
    //Obtener por id
    public Materia obtenerPorId(int idMateria) {
        if (idMateria <= 0) {
            System.err.println("ID invalido");
            return null;
        }
        return materiaDAO.obtenerPorId(idMateria);
    }
    
    //Obtener todos
    public List<Materia> obtenerTodos() {
        return materiaDAO.obtenerTodos();
    }
    
    //update
    public boolean actualizarMateria(int idMateria, String nombre, String nivel_Educativo, String descripcion){
        if (idMateria <= 0) {
            System.err.println("ID invalido");
            return false;
            
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            System.err.println("El nombre de la materia no puede estar vacio");
            return false;
        }
        if (nivel_Educativo == null || nivel_Educativo.trim().isEmpty()) {
            System.err.println("El nivel educativo no puede estar vacio");
            return false;
        }
        if (descripcion == null || descripcion.trim().isEmpty()) {
            System.err.println("La descripcion no puede estar vacio");
            return false;
        }
        Materia materia = new Materia();
        materia.setIdMateria(idMateria);
        materia.setNombre(nombre.trim());
        materia.setNivel_Educativo(nivel_Educativo.trim());
        materia.setDescripcion(descripcion.trim());
        
        return materiaDAO.actualizar(materia);
    }
    
    //delete
    public boolean eliminarMateria(int idMateria){
        if (idMateria <= 0) {
            System.err.println("ID invalido");
            return false;
        }
        return materiaDAO.eliminar(idMateria);
    }
    
}
