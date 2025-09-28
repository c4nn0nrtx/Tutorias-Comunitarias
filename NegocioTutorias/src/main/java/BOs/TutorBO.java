/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

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
    private ITutorDAO tutorDAO;
    private ITutorAdapter adapter;

    @Override
    public TutorDTO registrarTutor(TutorDTO tutor) throws NegocioException {
        try{
            if(tutorDAO.insertar(adapter.DtoAEntidad(tutor))){
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
      try{
          tutorDAO.actualizar(adapter.DtoAEntidad(tutor)); 
          
        }catch(NegocioException er){
            System.out.println(er.getMessage());
        }
        return null;
    }

    @Override
    public TutorDTO eliminarTutor(long id) throws NegocioException {
        if(tutorDAO.eliminar(id)){
            return buscarPorId(id);
        }
        else{
            return null;
        }
    }

    @Override
    public TutorDTO buscarPorId(long id) throws NegocioException {
        return adapter.EntidadADto(tutorDAO.obtenerPorId(id));
    }
    
}
