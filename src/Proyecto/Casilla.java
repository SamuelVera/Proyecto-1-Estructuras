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
public abstract class Casilla {
    protected boolean vacio = true;
    protected boolean visual = true;
    protected int marca;
    
    Casilla(boolean visual, boolean vacio){ //Establecer vacio o mina, y visualización de la casilla
        this.vacio = vacio;
        this.visual = visual;
    }
    
    public abstract boolean isVacio();

    public abstract boolean isVisual();
    
    public abstract int getMarca();
    
    protected abstract void setMarca(int marca);
}