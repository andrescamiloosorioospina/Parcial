/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.com.co.vista;

import java.util.Scanner;
import peaje.com.co.controlador.Controlador;
import peaje.com.co.modelo.Automovil;
import peaje.com.co.modelo.Camion;
import peaje.com.co.modelo.Moto;
import peaje.com.co.modelo.Vehiculo;

/**
 *
 * @author Andrés Camilo Osorio
 */

public class MenuPrincipal {
    static Controlador controlador = new Controlador();
    static Scanner leer = new Scanner(System.in);
    protected String marca;
    protected String placa;
    protected int valorPeaje;
    protected int opcion;
    
    
     /*
     @marca: Marca del vehiculo
     @placa: Placa del vehiculo
     @ValorPeaje: Precio del peaje
    */
    
    /*
      Metodo para crear un nuevo vehiculo, e invoca cada metodo por aparte
    */
    public void crearVehiculo(){
        boolean seguir = true;
        
        while (seguir == true) {
            
        System.out.println("Ingrese uno de los siguientes vehiculos");
        System.out.println("1. Automovil ");
        System.out.println("2. Camion");
        System.out.println("3. Moto");
        opcion = leer.nextInt();
        switch(opcion){
        case 1:
            automovil();
            break;
        case 2:
            camion();
            break;
        case 3:
            moto();
        }
        System.out.println("Desea salir? S. si, N. no");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("n") || respuesta.equalsIgnoreCase("N")) {
            seguir = true;
        } else{
            seguir  = false;
        }
     } 
    }
    
    /*
        Crear  auntomvil, llevar el objeto completo de auto a la clase Vehiculo
    */
    public void automovil(){
        System.out.println("Ingrese placa: ");
        placa = leer.next();
        System.out.println("Ingrese marca: ");
        marca = leer.next();
        
        Automovil auto = new Automovil(placa, marca, 10000);
        controlador.llenarVehiculo(auto);
          {
        }
    }
     
    public void camion(){
        System.out.println("Ingrese placa: ");
        placa = leer.next();
        System.out.println("Ingrese marca: ");
        marca = leer.next();
        System.out.println("Ingrese valor del peaje: ");
        valorPeaje = leer.nextInt();
        System.out.println("Ingrese el numero de ejes: ");
        int ejes = leer.nextInt();
        
        Camion camioncito = new Camion(placa, marca, 15000, ejes);
        controlador.llenarVehiculo(camioncito);
    }
        
    public void moto(){
        System.out.println("Ingrese placa: ");
        placa = leer.next();
        System.out.println("Ingrese marca: ");
        marca = leer.next();
      
        Moto motico = new Moto(placa, marca, 0);
        controlador.llenarVehiculo(motico);
    }

    
}
