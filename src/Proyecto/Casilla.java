/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Random;

/**
 *
 * @author Samuel Vera
 * Carnet: 20171110080
 * CI: 26475783
 */
public class Casilla {
    private boolean vacio = true;
    private boolean visual = true;
    private int marca;
    
    Casilla(boolean visual, boolean vacio){ //Establecer vacio o mina, y visualización de la casilla
        this.vacio = vacio;
        this.visual = visual;
    }
    public boolean isVacio() {  //Retornar si es mina o no
        return vacio;
    }
    public boolean isVisual() { //Retornal si no se ha clickeado la casilla
        return visual;
    }
    public int getMarca() { //Retornar la marca
        return marca;
    }
    protected void setMarca(int marca){ //Cambio de status de la marca
        this.marca = marca;
    }
    protected void setVisual(boolean visual){   //Cambio de status de visualización
        this.visual = visual;
    }
}