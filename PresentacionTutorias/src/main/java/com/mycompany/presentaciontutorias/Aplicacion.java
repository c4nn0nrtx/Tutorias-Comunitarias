/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.presentaciontutorias;

import Controller.AlumnoController;
import Controller.TutorController;
import Dominio.Alumno;
import Dominio.Tutor;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import view.ModuloAlumnos.MenuAlumnos;
import view.ModuloAlumnos.PanelDatosAlumno;
import view.ModuloAlumnos.PanelNombres;
import view.ModuloTutores.AgregarTutor;
import view.ModuloTutores.MenuSistema;
import view.ModuloTutores.MenuTutores;

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
    
    //modulo Alumnos
    private MenuAlumnos menuAlumnos;
    private PanelNombres nombresAlumno;
    private PanelDatosAlumno datosAlumno;
    
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
        if(controlTutores.agregarTutor(nombre, email, especialidad, telefono, inicio, fin)){
            mostrarMenuTutores();
            return true;
        }
        mostrarAgregarTutor();
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
}
