/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.presentaciontutorias;

import Controller.TutorController;
import Dominio.Tutor;
import Interfaces.ITutorBO;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import views.AgregarTutor;
import views.MenuSistema;
import views.MenuTutores;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class Aplicacion {
    private MenuTutores menuTutores;
    private AgregarTutor agregarTutor;
    private MenuSistema menuSistema;
    
    private TutorController control;
    private ITutorBO tutorBO;

    public Aplicacion() {
        menuSistema = new MenuSistema(this);
        control = new TutorController();
    }
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
    
    public List<Tutor> consultarTodos(){
        return control.obtenerTodos();
    }
    
    public Boolean confirmarTutor(String nombre, String email, String especialidad, String telefono, Date inicio, Date fin){
        if(control.agregarTutor(nombre, email, especialidad, telefono, inicio, fin)){
            mostrarMenuTutores();
            return true;
        }
        mostrarAgregarTutor();
        return false;
        
    }
    
    public void mostrarAgregarTutor(){
        agregarTutor = new AgregarTutor(this);
        cambiarPantalla(agregarTutor);
    }
    
    public void mostrarMenuTutores(){
        menuTutores = new MenuTutores(this);
        cambiarPantalla(menuTutores);
    }
}
