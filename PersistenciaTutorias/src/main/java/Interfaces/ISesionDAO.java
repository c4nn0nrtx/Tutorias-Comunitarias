/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Sesion;
import java.util.List;

/**
 *
 * @author Sandra
 */
public interface ISesionDAO {
    boolean insertar(Sesion sesion);
    Sesion obtenerPorId(int idSesion);
    List<Sesion> obtenerTodos();
    boolean actualizar(Sesion sesion);
    boolean eliminar(int idSesion);
}
