/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.com.co.controlador;

import java.util.ArrayList;
import peaje.com.co.modelo.Vehiculo;

/**
 *
 * @author Andrés Camilo Osorio
 */
public class Controlador {
    static ArrayList vechiculos = new ArrayList();
    
    /**
    *Metodo llenar Vehiculo
    *Agrega el vehiculo sea moto,carro o camión a un array list
    */
    public static void llenarVehiculo(Vehiculo vehiculo){  
    vechiculos.add(vehiculo);  
    }
    
        /*
    *Metodo mostrar Vehiculo
    *Imprime el vehiculo con cada uno de sus parámetros
    */
    public static void mostrarVehiculo(){
        
        for (Object object : vechiculos) {
            System.out.println(((Vehiculo)object).toString());
            System.out.println("El Vehiculo es: "+((Vehiculo)object).toString());
            System.out.println(" ");
        }
        
    }
    
}
