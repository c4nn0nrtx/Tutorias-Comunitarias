/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import DTOs.TutorDTO;
import Exception.NegocioException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ITutorBO {
    public TutorDTO registrarAlumno(TutorDTO tutor) throws NegocioException;
    public List<TutorDTO> consultarTodos() throws NegocioException;
    public TutorDTO modificarAlumno(TutorDTO alumno) throws NegocioException;
    public TutorDTO eliminarAlumno(int id) throws NegocioException;
}
