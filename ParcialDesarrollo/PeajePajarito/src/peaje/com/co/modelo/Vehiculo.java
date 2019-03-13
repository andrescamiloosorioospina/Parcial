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
public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected int valorPeaje;

    public Vehiculo(String placa, String marca, int valorPeaje) {
        this.placa = placa;
        this.marca = marca;
        this.valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", valorPeaje=" + valorPeaje + '}';
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }
    
}
