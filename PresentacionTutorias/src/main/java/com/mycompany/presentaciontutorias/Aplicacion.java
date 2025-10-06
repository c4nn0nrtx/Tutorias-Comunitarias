package com.mycompany.presentaciontutorias;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Controller.AlumnoController;
import Controller.TutorController;
import DTOs.AlumnoDTO;
import DTOs.TutorDTO;
import Dominio.Alumno;
import Dominio.Tutor;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import view.ModuloAlumnos.ActualizarAlumno;
import view.ModuloAlumnos.MenuAlumnos;
import view.ModuloAlumnos.PanelDatosAlumno;
import view.ModuloAlumnos.PanelNombres;
import view.ModuloAlumnos.ResumenActualizar;
import view.ModuloAlumnos.ResumenAlumno;
import view.ModuloTutores.ActualizarTutor;
import view.ModuloTutores.AgregarTutor;
import view.ModuloTutores.MenuSistema;
import view.ModuloTutores.MenuTutores;
import view.ModuloTutores.ResumenTutorActualizado;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
//Aplicacion para la logica de navegacion

public class Aplicacion {
    
    //modulos Tutores
    private MenuTutores menuTutores;
    private AgregarTutor agregarTutor;
    private MenuSistema menuSistema;
    private ActualizarTutor actualizarTutor;
    private ResumenTutorActualizado resumenTutor;
    
    //modulo Alumnos
    private MenuAlumnos menuAlumnos;
    private PanelNombres nombresAlumno;
    private PanelDatosAlumno datosAlumno;
    private ResumenAlumno resumenAlumno;
    private ActualizarAlumno actualizarAlumno;
    private ResumenActualizar resumenActulizar;
    
    //Objetos Temporales
    private AlumnoDTO alumnoTemporal;
    private TutorDTO tutorTemporal;
    //Controllers
    
    private TutorController controlTutores;
    private AlumnoController controlAlumnos;


    public Aplicacion() {
        menuSistema = new MenuSistema(this);
        controlTutores = new TutorController();
        controlAlumnos = new AlumnoController();
    }
    //Metodo para probar main
    public void iniciar(){
        menuSistema.setLocationRelativeTo(null);
        menuSistema.setVisible(true);
    }

    public void cambiarPantalla(JPanel nuevaPantalla) {
        menuSistema.getPanel().removeAll();
        menuSistema.getPanel().add(nuevaPantalla);
        menuSistema.pack();
        menuSistema.setLocationRelativeTo(null);
        menuSistema.revalidate();
        menuSistema.repaint();
        menuSistema.setVisible(true);
    }
    //Obtener Listas 
    public List<Tutor> consultarTodos(){
        return controlTutores.obtenerTodos();
    }
    
    public List<Alumno> consultarTodosAlumnos(){
        return controlAlumnos.obtenerTodos();
    }
    
    
    //Caso Agregar Ttutor
    public Boolean confirmarTutor(String nombre, String email, String especialidad, String telefono, Date inicio, Date fin){
        String disponibilidadd =  "" + inicio.getHours()+":"+inicio.getMinutes() +"--"+ fin.getHours()+":"+fin.getMinutes();
        if(controlTutores.agregarTutor(nombre, email, especialidad, telefono, inicio, fin, disponibilidadd)){
            mostrarMenuTutores();
            return true;
        }
        mostrarAgregarTutor();
        return false;
        
    }
    public Boolean actualizarTutor(TutorDTO tutor){
        String disponibilidadd =  "" + tutor.getInicio().getHours()+":"+tutor.getInicio().getMinutes() +"--"+ tutor.getFin().getHours()+":"+tutor.getFin().getMinutes();
        if(controlTutores.actualizarTutor(tutor.getId(),tutor.getNombre(), tutor.getEmail(), tutor.getEspecialidad(), tutor.getTelefono(), tutor.getInicio(), tutor.getFin(), disponibilidadd )){
            mostrarMenuTutores();
            return true;
        }
        mostrarAgregarTutor();
        return false;  
    }
    
    public boolean eliminarTutor(int id){
        if(controlTutores.eliminarTutor(id)){
            mostrarMenuTutores();
            return true;
        }
        mostrarMenuTutores();
        return false;  
    }
    
    //Views
    public void mostrarAgregarTutor(){
        agregarTutor = new AgregarTutor(this);
        cambiarPantalla(agregarTutor);
    }
    
    public void mostrarMenuTutores(){
        menuTutores = new MenuTutores(this);
        cambiarPantalla(menuTutores);
    }
    
    public void mostrarActualizarTutor(){
        actualizarTutor = new ActualizarTutor(this);
        cambiarPantalla(actualizarTutor);
    }
    
    public void mostrarResumenTutor(){
        resumenTutor = new ResumenTutorActualizado(this);
        cambiarPantalla(resumenTutor);
    }
    
    //Caso Alumnos
    public void mostrarMenuAlumnos(){ 
        menuAlumnos = new MenuAlumnos(this);
        cambiarPantalla(menuAlumnos);
    }
    
    public void mostrarIngresarNombreAlumnos(){
        nombresAlumno = new PanelNombres(this);
        cambiarPantalla(nombresAlumno);
    }
    
    public void mostraDatosAlumno(){
        datosAlumno = new PanelDatosAlumno(this);
        cambiarPantalla(datosAlumno);
    }
    
    public void mostrarResumenAlumno(){
        resumenAlumno = new ResumenAlumno(this);
        cambiarPantalla(resumenAlumno);
    }
    
    public void mostrarActulizarAlumno(){
        actualizarAlumno = new ActualizarAlumno(this);
        cambiarPantalla(actualizarAlumno);
    }
    
    public void mostrarResumenAlumnoActulizado(){
        resumenActulizar = new ResumenActualizar(this);
        cambiarPantalla(resumenActulizar);
    }
    
    
    public void setAlumno(AlumnoDTO alumno){
        this.alumnoTemporal = alumno;
    }
    public AlumnoDTO getAlumnoTemporal(){
        return alumnoTemporal;
    }
    public void setTutor(TutorDTO tutor){
        this.tutorTemporal = tutor;
    }
    public TutorDTO getTutorTemporal(){
        return tutorTemporal;
    }
    
    //caso agregar alumno
    public Boolean confirmarAlumno(AlumnoDTO alumno){
        if(controlAlumnos.agregarAlumno(alumno.getNombre(), alumno.getApellidoPaterno(), alumno.getApellidoMaterno(), alumno.getTelefono(), 
                alumno.getEscuelaProcedencia(),alumno.getGradoEscolar(), alumno.getEdad())){
            mostrarMenuAlumnos();
            return true;
        }
        mostrarIngresarNombreAlumnos();
        return false; 
    }
    public Boolean actualizarAlumno(AlumnoDTO alumno){
        if(controlAlumnos.actualizarAlumno(alumno.getId(),alumno.getNombre(), alumno.getApellidoPaterno(), alumno.getApellidoMaterno(), alumno.getTelefono(), 
                alumno.getEscuelaProcedencia(),alumno.getGradoEscolar(), alumno.getEdad())){
            mostrarMenuAlumnos();
            return true;
        }
        mostrarActulizarAlumno();
        return false; 
    }
    
    public boolean eliminarAlumno(int id){
        if(controlAlumnos.eliminarAlumno(id)){
            mostrarMenuTutores();
            return true;
        }
        mostrarMenuTutores();
        return false;  
    }
}
