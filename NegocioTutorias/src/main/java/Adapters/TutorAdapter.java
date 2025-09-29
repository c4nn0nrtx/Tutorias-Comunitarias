/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Adapters;

import DTOs.TutorDTO;
import Dominio.Tutor;
import Exception.NegocioException;
import Interfaces.ITutorAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class TutorAdapter implements ITutorAdapter{

    @Override
    public TutorDTO EntidadADto(Tutor tutor) throws NegocioException {
        TutorDTO tutorDTO = new TutorDTO();
        tutorDTO.setId(tutor.getId());
        tutorDTO.setNombre(tutor.getNombre());
        tutorDTO.setTelefono(tutor.getTelefono());
        tutorDTO.setEmail(tutor.getEmail());
        tutorDTO.setEspecialidad(tutor.getEspecialidad());
//        tutorDTO.setInicio(tutor.getInicio());
//        tutorDTO.setFin(tutor.getFin());
        return tutorDTO;
        
    }

    @Override
    public Tutor DtoAEntidad(TutorDTO tutor) throws NegocioException {
        Tutor tutorEntidad = new Tutor();
        tutorEntidad.setIdTutor(tutor.getId());
        tutorEntidad.setNombre(tutor.getNombre());
        tutorEntidad.setTelefono(tutor.getTelefono());
        tutorEntidad.setEmail(tutor.getEmail());
        tutorEntidad.setEspecialidad(tutor.getEspecialidad());
        tutorEntidad.setInicio(tutor.getInicio().getHours());
        tutorEntidad.setFin(tutor.getFin().getHours());
        return tutorEntidad;
    }

    @Override
    public ArrayList<TutorDTO> consultarTodos(List<Tutor> lista) throws NegocioException {
        try{
           ArrayList<TutorDTO> listaDTO = new ArrayList();
           TutorDTO t;
           for(Tutor tutor : lista){
               t = EntidadADto(tutor);
               listaDTO.add(t);
            }
           return listaDTO;
        }catch(Exception er){
            System.out.println("Error al consultar Datos");
        }
        return null;
    }

}
