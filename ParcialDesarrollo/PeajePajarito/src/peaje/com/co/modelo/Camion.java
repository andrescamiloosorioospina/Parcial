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
public class Camion extends Vehiculo{
    /*
     Constructor heredado de la clase Vehiculo(Padre)
    */
    protected int numeroEjes;
    public Camion(String placa, String marca, int valorPeaje, int numeroEjes) {
        super(placa, marca, valorPeaje);
        this.numeroEjes = numeroEjes;
    }

   @Override 
   public String toString() {
        return "Camion{" + "placa=" + placa + ", marca=" + marca + ", valorPeaje=" + valorPeaje + ", numeroEjes" + numeroEjes +'}';
    }

}
