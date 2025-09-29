/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

import Controller.TutorController;
import DTOs.TutorDTO;
import Exception.NegocioException;
import Interfaces.ITutorAdapter;
import Interfaces.ITutorBO;
import Interfaces.ITutorDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class TutorBO implements ITutorBO{
    private ITutorAdapter adapter;
    private final TutorController tutorDAO = new TutorController();

    @Override
    public TutorDTO registrarTutor(TutorDTO tutor) throws NegocioException {
        try{
            if(tutorDAO.agregarTutor(tutor.getNombre(), tutor.getEmail(),tutor.getEspecialidad(), tutor.getTelefono())){
                return tutor;
            }else{
                throw new NegocioException("Error al agregar al Tutor");
            }
                
        }catch(NegocioException er){
            System.out.println(er.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList<TutorDTO> consultarTodos() throws NegocioException {
        try{
            ArrayList<TutorDTO> listaDTO = adapter.consultarTodos(tutorDAO.obtenerTodos());   
            
        }catch(NegocioException er){
            System.out.println(er.getMessage());
        }
        return null;
    }
    
    @Override
    public TutorDTO modificarTutor(TutorDTO tutor) throws NegocioException {
          tutorDAO.actualizarTutor(
                  tutor.getId(),
                  tutor.getNombre(),
                  tutor.getEmail(),
                  tutor.getEspecialidad(), 
                  tutor.getTelefono()
          ); 

        return null;
    }

    @Override
    public TutorDTO eliminarTutor(long id) throws NegocioException {
        TutorDTO tutorEncontrado= null;
        if(buscarPorId(id)!= null){
            tutorEncontrado = buscarPorId(id);
            tutorDAO.eliminarTutor(id);
        }
        else{
            return null;
        }
        return tutorEncontrado;
    }

    @Override
    public TutorDTO buscarPorId(long id) throws NegocioException {
        return adapter.EntidadADto(tutorDAO.obtenerPorId(id));
    }
    
}
