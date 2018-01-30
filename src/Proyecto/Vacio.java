package Proyecto;

/**
 * Clase Vacio, los objetos de esta clase son Casillas vacias
 * Sub Clase de Casilla
 */
public class Vacio extends Casilla{
        //Constructor de una casilla vacia
    Vacio(boolean vacio){
        super(false,vacio);
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
    public void setVisual(boolean visual){
        this.visual = visual;
    }
}
