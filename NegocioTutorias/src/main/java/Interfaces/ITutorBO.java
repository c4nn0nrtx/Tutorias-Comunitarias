/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import DTOs.TutorDTO;
import Exception.NegocioException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface ITutorBO {
    public TutorDTO registrarTutor(TutorDTO tutor) throws NegocioException;
    public ArrayList<TutorDTO> consultarTodos() throws NegocioException;
    public TutorDTO modificarTutor(TutorDTO tutor) throws NegocioException;
    public TutorDTO eliminarTutor(int id) throws NegocioException;
    public TutorDTO buscarPorId(long id) throws NegocioException;
}
