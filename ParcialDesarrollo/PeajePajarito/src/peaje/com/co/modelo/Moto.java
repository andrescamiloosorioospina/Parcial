/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.com.co.modelo;

/**
 *
 * @author Andrés Camilo Osorio
 */
public class Moto extends Vehiculo{
    
    /*
     Constructor heredado de la clase Vehiculo(Padre)
    */
    public Moto(String placa, String marca, int valorPeaje) {
        super(placa, marca, valorPeaje);
        
    }
    @Override
    public String toString() {
        return "{'Moto':{" + "'placa':{" + placa + "}, 'marca':{" + marca + "} 'valorPeaje':{" + valorPeaje + "}}"+'}';
    }

}
