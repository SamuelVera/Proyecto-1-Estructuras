/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Samuel Vera
 * Carnet: 20171110080
 * CI: 26475783
 */
public class Mina extends Casilla{
    Mina(boolean vacio){   //Constructor de visualizar y deterinar mina o vacio
        super(false,vacio);
    }
    @Override
    protected void setMarca(int marca){ //Colocar marca a la casilla
        this.marca = marca;
    }
    @Override
    public boolean isVacio() {
        return this.vacio;
    }
    @Override
    public boolean isVisual() {
        return this.visual;
    }
    @Override
    public int getMarca() {
        return this.marca;
    }
}
