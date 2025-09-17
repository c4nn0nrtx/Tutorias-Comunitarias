/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Tutor;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ITutorDAO {
    boolean insertar(Tutor tutor);
    Tutor obtenerPorId(int idtutor);
    List<Tutor> obtenerTodos();
    boolean actualizar(Tutor tutor);
    boolean eliminar(int idtutor);
}
