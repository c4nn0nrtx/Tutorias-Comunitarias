/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import DTOs.TutorDTO;
import Dominio.Tutor;
import Exception.NegocioException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ITutorAdapter {
    public TutorDTO EntidadADto(Tutor tutor) throws NegocioException;
    public Tutor DtoAEntidad(TutorDTO tutor) throws NegocioException;
    public ArrayList<TutorDTO> consultarTodos(List<Tutor> lista) throws NegocioException;
}
