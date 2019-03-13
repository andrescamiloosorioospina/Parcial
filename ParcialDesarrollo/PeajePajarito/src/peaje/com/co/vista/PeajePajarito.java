/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.com.co.vista;

import peaje.com.co.controlador.Controlador;
import peaje.com.co.modelo.Automovil;

/**
 *
 * @author Andrés Camilo Osorio
 */
public class PeajePajarito {

    /**
     * @param args the command line arguments
     */
    
    static MenuPrincipal menu = new MenuPrincipal();
    static Controlador control = new Controlador();
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu.crearVehiculo();
        control.mostrarVehiculo();
       
    }
    
}
