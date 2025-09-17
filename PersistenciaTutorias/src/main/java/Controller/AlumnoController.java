/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAOs.AlumnoDAO;
import Dominio.Alumno;
import Interfaces.IAlumnoDAO;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Sandra
 */
public class AlumnoController {

    private final IAlumnoDAO alumnoDAO;

    public AlumnoController() {
        this.alumnoDAO = new AlumnoDAO();
    }

    //Insertar nuevo alumno con validaciones
    public boolean agregarAlumno(String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String escuela_Procedencia, String grado_Escolar, Date fecha_nacimiento) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.err.println("El nombre del alumno no puede estar vacio");
            return false;
        }
        if (apellidoPaterno == null || apellidoPaterno.trim().isEmpty()) {
            System.err.println("El apellido paterno del alumno no puede estar vacio");
            return false;
        }
        if (apellidoMaterno == null || apellidoMaterno.trim().isEmpty()) {
            System.err.println("El apellido materno del alumno no puede estar vacio");
            return false;
        }
        if (telefono == null) {
            telefono = "";
        }
        if (escuela_Procedencia == null || escuela_Procedencia.trim().isEmpty()) {
            System.err.println("Escuela de procedencia no puede estar vacio");
            return false;
        }
        if (grado_Escolar == null || grado_Escolar.trim().isEmpty()) {
            System.err.println("Grado escolar no puede estar vacio");
            return false;
        }
        if (fecha_nacimiento == null) {
            System.err.println("Fecha de nacimiento no puede estar vacio");
            return false;
        }

        Alumno alumno = new Alumno();
        alumno.setNombre(nombre.trim());
        alumno.setApellidoPaterno(apellidoPaterno.trim());
        alumno.setApellidoMaterno(apellidoMaterno.trim());
        alumno.setTelefono(telefono.trim());
        alumno.setEscuela_Procedencia(escuela_Procedencia.trim());
        alumno.setGrado_Escolar(grado_Escolar.trim());
        alumno.setFecha_nacimiento(fecha_nacimiento);

        return alumnoDAO.insertar(alumno);

    }

    //Obtener alumno por id con validacion
    public Alumno obtenerPorId(int idAlumno) {
        if (idAlumno <= 0) {
            System.err.println("ID invalido");
            return null;
        }
        return alumnoDAO.obtenerPorId(idAlumno);
    }

    //Obtener todos los alumnos con validaciones
    public List<Alumno> obtenerTodos() {
        return alumnoDAO.obtenerTodos();
    }

    //validar actualizacion de aluimnos
    public boolean actualizarAlumno(int idAlumno, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String escuela_Procedencia, String grado_Escolar, Date fecha_nacimiento) {
        if (idAlumno <= 0) {
            System.err.println("ID invalido");
            return false;
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            System.err.println("El nombre del alumno no puede estar vacio");
            return false;
        }
        if(apellidoPaterno == null || apellidoPaterno.trim().isEmpty()){
          System.err.println("El apellido paterno del alumno no puede estar vacio");
            return false;  
        }
        if (apellidoMaterno == null || apellidoMaterno.trim().isEmpty()){
           System.err.println("El apellido materno del alumno no puede estar vacio");
            return false; 
        }
        if (telefono == null){
            telefono = "";
        } 
        if (escuela_Procedencia == null || escuela_Procedencia.trim().isEmpty()){
           System.err.println("Escuela de procedencia no puede estar vacio");
            return false; 
        }
        if (grado_Escolar == null || grado_Escolar.trim().isEmpty()){
           System.err.println("Grado escolar no puede estar vacio");
            return false; 
        }
        if (fecha_nacimiento == null){
           System.err.println("Fecha de nacimiento no puede estar vacio");
            return false; 
        }
        
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);
        alumno.setNombre(nombre.trim());
        alumno.setApellidoPaterno(apellidoPaterno.trim());
        alumno.setApellidoMaterno(apellidoMaterno.trim());
        alumno.setTelefono(telefono.trim());
        alumno.setEscuela_Procedencia(escuela_Procedencia.trim());
        alumno.setGrado_Escolar(grado_Escolar.trim());
        alumno.setFecha_nacimiento(fecha_nacimiento);
        
        return alumnoDAO.actualizar(alumno);
    }
    
    // eliminar
    public boolean eliminarAlumno(int idAlumno){
        if (idAlumno <= 0) {
            System.err.println("ID invalido");
            return false;
        }
        return alumnoDAO.eliminar(idAlumno);
    }

}
