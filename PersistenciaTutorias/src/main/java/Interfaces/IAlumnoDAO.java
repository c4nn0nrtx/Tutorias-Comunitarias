/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Alumno;
import java.util.List;

/**
 *
 * @author Sandra
 */
public interface IAlumnoDAO {
    boolean insertar(Alumno alumno);
    Alumno obtenerPorId(int idAlumno);
    List<Alumno> obtenerTodos();
    boolean actualizar(Alumno alumno);
    boolean eliminar(int idAlumno);
    
}
