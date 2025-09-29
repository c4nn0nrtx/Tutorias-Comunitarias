/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.presentaciontutorias;

import Controller.TutorController;
import DTOs.TutorDTO;
import Exception.NegocioException;
import Interfaces.ITutorBO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        menuTutores = new MenuTutores(this);
        agregarTutor = new AgregarTutor();
    }

    public void cambiarPantalla(JPanel nuevaPantalla) {
        menuSistema.getContentPane().removeAll();
        menuSistema.getContentPane().add(nuevaPantalla);
        menuSistema.revalidate();
        menuSistema.repaint();
        menuSistema.setVisible(true);
    }
    
    public ArrayList<TutorDTO> consultarTodos(){
        try {
            return tutorBO.consultarTodos();
        } catch (NegocioException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void mostrarAgregarTutor(){
        cambiarPantalla(agregarTutor);
    }
    public void mostrarMenuTutores(){
        cambiarPantalla(menuTutores);
    }
}
