/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Materia;
import java.util.List;

/**
 *
 * @author Sandra
 */
public interface IMateriaDAO {
    boolean insertar(Materia materia);
    Materia obtenerPorId(int idMateria);
    List<Materia> obtenerTodos();
    boolean actualizar(Materia materia);
    boolean eliminar(int idMateria);
}
